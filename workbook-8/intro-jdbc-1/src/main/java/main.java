import java.sql.*;

public class main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","P@ssw0rd");

        Statement statement = connection.createStatement();

        String query = "SELECT Name FROM city WHERE CountryCode = 'USA'";

        ResultSet results = statement.executeQuery(query);

        while (results.next()){
            String city = results.getString("Name");
            System.out.println(city);
        }
        connection.close();
    }
}
