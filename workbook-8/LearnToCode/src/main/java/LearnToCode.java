import java.sql.*;

public class LearnToCode {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "P@ssw0rd");

        Statement statement = connect.createStatement();

        String query = "SELECT ProductID,ProductName FROM products WHERE ProductID ORDER BY ProductID Asc ";
        ResultSet results = statement.executeQuery(query);
        while (results.next()){
            String productName = results.getString("ProductName");
            int ProductID = results.getInt(1);
            System.out.println(productName);
            System.out.println(ProductID);
            System.out.println("--------------------------------");
        }
        results.close();
        statement.close();
        connect.close();
    }
}
