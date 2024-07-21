import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.io.*;

class tableo
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

            
            String createTableSQL = "CREATE TABLE IF NOT EXISTS customers ("+
                        "id INT PRIMARY KEY AUTO_INCREMENT,"+
                        "name VARCHAR(100) NOT NULL,"+
                        "email VARCHAR(100) NOT NULL,"+
                        "phone VARCHAR(20) NOT NULL"+
                        ");";
    
            
            statement.execute(createTableSQL);
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
                        

            int rowz= statement.executeUpdate(quer);
            System.out.println(rowz);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
