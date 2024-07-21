import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.io.*;

class smartphone_table_creation
{
    public void main()
    {
        String url="jdbc:mysql://localhost:3300/ramaa";
        String username="root";
        String password="Tanuku@1";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            
            Connection conn=null;
            Statement stat = null;
            
            String createTableSQL = "CREATE TABLE IF NOT EXISTS smartphonn (" +
                                "Smartphone VARCHAR(255), " +
                                "Brand VARCHAR(25), " +
                                "Model VARCHAR(25), " +
                                "RAM INT, " +
                                "Storage INT,bra "+
                                "Color VARCHAR(25), " +
                                "Free BIT, "+
                                "FinalPrice DOUBLE " +
                                ")";
                                
            statement.execute(createTableSQL);
            
            try(BufferedReader br = new BufferedReader(new FileReader("smartphones.csv")))
            {
                String line;
                int tot_rows_affected=0;
                boolean firs_row=false;
                while((line=br.readLine())!=null)
                {
                    if(firs_row==false)
                    {
                        firs_row=true;
                        continue;
                    }
                    System.out.println(line);
                    String tempora[]=line.split(",");
                    
                    System.out.println(tempora[6]);
                    System.out.println(tempora[7]);
                    String query_construct = "INSERT INTO smartphonn VALUES (?, ?, ?, ?, ?, ?, ?,?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(query_construct);
                    preparedStatement.setString(1, tempora[0]);
                    preparedStatement.setString(2, tempora[1]);
                    preparedStatement.setString(3, tempora[2]);
                    //preparedStatement.setInt(4, Integer.parseInt(tempora[3]));
                    
                    if (tempora[3] != null && !tempora[3].isEmpty()) {
                        preparedStatement.setInt(4, Integer.parseInt(tempora[3]));
                    } 
                    else {
                        preparedStatement.setNull(4, java.sql.Types.INTEGER); // Set RAM to NULL
                    }
                    
                    if(tempora[4]!="")
                    {
                        preparedStatement.setInt(5, Integer.parseInt(tempora[4]));
                    }
                    else
                    {
                        preparedStatement.setNull(5,java.sql.Types.INTEGER);
                    }
                    preparedStatement.setString(6, tempora[5]);
                    preparedStatement.setBoolean(7, Boolean.parseBoolean(tempora[6]));
                    preparedStatement.setDouble(8, Double.parseDouble(tempora[7]));
                    int rowz = preparedStatement.executeUpdate();
                    tot_rows_affected+=rowz;
                    
                }
                
                System.out.println("rows affected : "+tot_rows_affected);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
