package com.pluralsight.db;

import com.pluralsight.models.Shippers;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertIntoDirectShippers(String companyName, String phone) throws SQLException {
        try (Connection connect = dataSource.getConnection();
             PreparedStatement statement = connect.prepareStatement("insert into shippers (companyName,Phone) values (?,?)", Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, companyName);
            statement.setString(2, phone);

            int rows = statement.executeUpdate();

            System.out.println("Rows that have been Inserted: " + rows);

            try (ResultSet keys = statement.getGeneratedKeys()) {
                while (keys.next()) {
                    System.out.println("A new key was added: " + keys.getInt(1));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Shippers> displayAllShippers() {
        List<Shippers> shippers = new ArrayList<>();

        String allShippersQuery = "SELECT ShipperID,CompanyName,Phone FROM shippers";


        try (Connection connect = dataSource.getConnection();
             PreparedStatement statement = connect.prepareStatement(allShippersQuery);
             ResultSet results = statement.executeQuery()) {
            while (results.next()) {
                int shipperId = results.getInt("ShipperID");
                String companyName = results.getString("CompanyName");
                String phone = results.getString("Phone");

                System.out.println("Shipper ID: " + shipperId);
                System.out.println("Company Name: " + companyName);
                System.out.println("phone number: " + phone);
                System.out.println("---------------------------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return shippers;
    }

    public void updateShipper(int shipperId, String phone) {
        try (Connection connect = dataSource.getConnection();
             PreparedStatement statement = connect.prepareStatement("UPDATE shippers SET Phone = ? WHERE shipperID = ?")) {
            statement.setString(1, phone);
            statement.setInt(2, shipperId);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteShippersRecord(String shipperId){
        String queryDeletion = "DELETE FROM shippers WHERE ShipperID = ?";

        try(Connection connect = dataSource.getConnection();
        PreparedStatement statement = connect.prepareStatement(queryDeletion)){
            statement.setString(1,shipperId);
            int rows = statement.executeUpdate();
            System.out.println("Rows has been Deleted: " + rows);
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
