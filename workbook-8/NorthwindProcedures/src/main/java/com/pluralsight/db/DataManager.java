package com.pluralsight.db;

import com.pluralsight.models.CustomerOrderHistory;
import com.pluralsight.models.SalesByYear;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.net.ssl.SSLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private BasicDataSource dataSource;

    public DataManager(String url, String username, String password) {
        this.dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
    }
    public List<CustomerOrderHistory> CustomerOrderHistory(String customerId){
        List<CustomerOrderHistory> orderHistoryList = new ArrayList<>();

        try(Connection getConnect = dataSource.getConnection();
            CallableStatement statement = getConnect.prepareCall("{CALL CustOrderHist(?)}")) {
            statement.setString(1,customerId);
            try (ResultSet results = statement.executeQuery()){
                while (results.next()){
                    String productName = results.getString("ProductName");
                    int totalQuantity  = results.getInt("Total");

                    CustomerOrderHistory orderHistory = new CustomerOrderHistory(productName,totalQuantity);
                    orderHistoryList.add(orderHistory);
                }

            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return orderHistoryList;
    }
    public List<SalesByYear> salesByYear(String beginningDate,String endingDate){
        List<SalesByYear>salesByYearList = new ArrayList<>();

        try (Connection getConnect = dataSource.getConnection();
        CallableStatement statement = getConnect.prepareCall("{CALL 'Sales By Year' (?,?)}")){
            Date startDate = Date.valueOf(beginningDate);
            Date endDate = Date.valueOf(endingDate);
            try (ResultSet results = statement.executeQuery()){
                while (results.next()){
                      = results.getString("BeginningDate");
                     endingDate = results.getString("EndingDate");

                     SalesByYear salesByYear = new SalesByYear(beginningDate,endingDate);
                     salesByYearList.add(salesByYear)
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return salesByYearList;
    }
}
