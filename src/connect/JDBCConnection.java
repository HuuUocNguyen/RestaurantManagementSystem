/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hazard
 */
public class JDBCConnection {

    public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
        String hostName = "localhost";
        String dbName = "restaurant_management_system";
        String userName = "root";
        String password = "1234";
        return getMySQLConnection(hostName, dbName, userName, password);
    }

    public static Connection getMySQLConnection(String hostName, String dbName, String userName, String password)
            throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        Connection conn = DriverManager.getConnection(connectionURL, userName, password);
        return conn;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Get connection ... ");
        Connection conn = JDBCConnection.getMySQLConnection();
        if (conn != null) {
            System.out.println("connect");
        } else {
            System.out.println("no connect");
        }

    }

}
