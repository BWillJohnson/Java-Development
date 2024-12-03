import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class SakilaMovies {
    public static void main(String[] args) {
            if (args.length != 2) {
                System.out.println("Application needs two arguments to run: " +
                        "java com.pluralsight.Main <username> <password>");
                System.exit(1);
            }

            String username = args[0];
            String password = args[1];

            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
            dataSource.setUsername(username);
            dataSource.setPassword(password);




    }

}
