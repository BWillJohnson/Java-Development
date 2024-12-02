import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            if (args.length != 2){
                System.out.println("The application needs a UserName and Password to run");
                System.exit(1);
            }
            String username = args[0];
            String password = args[1];

            Scanner myScan = new Scanner(System.in);
            System.out.println("Please enter the last name of the customer you want to search:");
            String lastNameToSearch = myScan.nextLine();

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind",username,password);

            String query = """
                    SELECT first_name, last_name
                    FROM customer
                    WHERE last_name LIKE ?
                    ORDER BY first_name;
                    """;

            PreparedStatement preparedStatement = connect.prepareStatement(query);
            preparedStatement.setString(1,lastNameToSearch);
            ResultSet results = preparedStatement.executeQuery();

            while (results.next()){
                String firstName = results.getString(1);
                String lastName = results.getString(2);

                System.out.println("firstName: " +  firstName);
                System.out.println("lastName: " +  lastName);
            }
            results.close();
            preparedStatement.close();
            connect.close();
        }catch (Exception ex){
            System.err.println("Notice an error has occurred!");
            ex.printStackTrace();
        }
    }
}
