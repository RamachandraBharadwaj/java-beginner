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
            
            String createTableSQL = "CREATE TABLE customers ("+
                        "id INT PRIMARY KEY AUTO_INCREMENT,"+
                        "name VARCHAR(100) NOT NULL,"+
                        "email VARCHAR(100) NOT NULL,"+
                        "phone VARCHAR(20) NOT NULL"+
                        ");";
                                
            statement.execute(createTableSQL);
            /*
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
            */
           
            String quer="INSERT INTO customers (name, email, phone) VALUES"+
                        "('Alice Smith', 'alice.smith@example.com', '555-1234'),"+
                        "('Bob Johnson', 'bob.johnson@example.com', '555-5678'),"+
                        "('Charlie Brown', 'charlie.brown@example.com', '555-8765'),"+
                        "('Diana Prince', 'diana.prince@example.com', '555-4321'),"+
                        "('Edward Norton', 'edward.norton@example.com', '555-9876'),"+
                        "('Fiona Gallagher', 'fiona.gallagher@example.com', '555-1111'),"+
                        "('George Michael', 'george.michael@example.com', '555-2222'),"+
                        "('Hannah Baker', 'hannah.baker@example.com', '555-3333'),"+
                        "('Isaac Newton', 'isaac.newton@example.com', '555-4444'),"+
                        "('Jessica Jones', 'jessica.jones@example.com', '555-5555'),"+
                        "('Kevin Bacon', 'kevin.bacon@example.com', '555-6666'),"+
                        "('Lara Croft', 'lara.croft@example.com', '555-7777'),"+
                        "('Michael Scott', 'michael.scott@example.com', '555-8888'),"+
                        "('Nancy Drew', 'nancy.drew@example.com', '555-9999'),"+
                        "('Oscar Wilde', 'oscar.wilde@example.com', '555-0000'),"+
                        "('Pam Beesly', 'pam.beesly@example.com', '555-1010'),"+
                        "('Quentin Tarantino', 'quentin.tarantino@example.com', '555-2020'),"+
                        "('Rachel Green', 'rachel.green@example.com', '555-3030'),"+
                        "('Steve Rogers', 'steve.rogers@example.com', '555-4040'),"+
                        "('Tony Stark', 'tony.stark@example.com', '555-5050');";
                        

            int rowz= stat.executeUpdate(quer);
            System.out.println(rowz);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
