
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RphoneBookJDBC{

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/phonebook"; // Replace with your database URL
        String username = "root"; // Replace with your database username
        String password = "Tanuku@1"; // Replace with your database password

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet =null;
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Create the statement
            statement = connection.createStatement();

            // SQL to update a value in the ProductPhone table
            String updateTableSQL = "UPDATE ProductPhone SET Price = 778.99 WHERE ProductID = 2";

            // Execute the update table SQL statement
            statement.executeUpdate(updateTableSQL);
            System.out.println("ProductPhone table updated successfully.");

            // SQL to retrieve data from the ProductPhone table
            String selectSQL = "SELECT * FROM ProductPhone";

            // Execute the select SQL statement
             resultSet = statement.executeQuery(selectSQL);

            // Process the result set
            while (resultSet.next()) {
                int productId = resultSet.getInt("ProductID");
                String productName = resultSet.getString("ProductName");
                String brand = resultSet.getString("Brand");
                String model = resultSet.getString("Model");
                double price = resultSet.getDouble("Price");
                String releaseDate = resultSet.getDate("ReleaseDate").toString();

                System.out.println("ProductID: " + productId +
                                   ", ProductName: " + productName +
                                   ", Brand: " + brand +
                                   ", Model: " + model +
                                   ", Price: " + price +
                                   ", ReleaseDate: " + releaseDate);
            }

            

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
            	resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}