import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
class PhoneBookJDBC{ 
    public static void main(String[] args) throws Exception{
        String jdbcUrl = "jdbc:mysql://localhost:3306/phonebook"; // Replace with your database URL
        String username = "root"; // Replace with your database username
        String password = "root"; // Replace with your database password
        Connection connection = null;
        Statement statement = null;
        try 
        {
            
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            // Create the statement
            statement = connection.createStatement();
            // SQL to create the ProductPhone table
            // Execute the create table SQL statement
            int x = statement.executeUpdate(createTableSQL);
            System.out.println("ProductPhone table created successfully."+x);

            // SQL to insert values into the ProductPhone table
            String insertValuesSQL = "INSERT INTO ProductPhone (ProductID, ProductName, Brand, Model, Price, ReleaseDate) VALUES " +
                                     "(1, 'iPhone 14', 'Apple', 'A2483', 799.99, '2023-09-24'), " +
                                     "(2, 'Galaxy S22', 'Samsung', 'SM-S901U1', 699.99, '2023-02-11'), " +
                                     "(3, 'Pixel 7', 'Google', 'GQML3', 599.99, '2023-10-18'), " +
                                     "(4, 'OnePlus 10 Pro', 'OnePlus', 'NE2215', 899.99, '2023-04-05'), " +
                                     "(5, 'Xperia 1 IV', 'Sony', 'XQ-CT54', 999.99, '2023-05-20')";

            // Execute the insert values SQL statement
            x = statement.executeUpdate(insertValuesSQL);
            System.out.println(x+"Values inserted into ProductPhone table successfully.");
            //SQL to update a value in the ProductPhone table
            String updateTableSQL = "UPDATE ProductPhone SET Price = 749.99 WHERE ProductID = 4";

            // Execute the update table SQL statement
            x = statement.executeUpdate(updateTableSQL);
            System.out.println(x+"ProductPhone table updated successfully.");

            
            
           } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}
}
