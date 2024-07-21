import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.*;

class queries
{
    public void main()
    {
        String url="jdbc:mysql://localhost:3300/ramaa";
        String username="root";
        String password="Tanuku@1";
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement st = conn.createStatement();
            
            String queries[]={
                             "select brand,count(brand) from smartphonn group by brand having brand=\"Apple\";",
                             "select Brand,Model from smartphonn where FinalPrice<500;",
                             "select Model from smartphonn where brand=\"Samsung\";",
                             "select Smartphone,Model,FinalPrice from smartphonn where brand=\"Nothing\" order by FinalPrice LIMIT 1;",
                             "select * from smartphonn order by FinalPrice;"
                            };
                             
            for( String qr : queries)
            {
                ResultSet rs = st.executeQuery(qr);
                
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnCount = rsmd.getColumnCount();

                for (int i = 1; i <= columnCount; i++) 
                {
                    System.out.printf("%-20s", rsmd.getColumnName(i));
                }
                System.out.println();

                while (rs.next()) 
                {
                    for (int i = 1; i <= columnCount; i++) 
                    {
                        System.out.printf("%-20s", rs.getString(i));
                    }
                    System.out.println();
                }
                rs.close();
                
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}