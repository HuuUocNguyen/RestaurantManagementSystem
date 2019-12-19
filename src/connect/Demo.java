/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Hazard
 */
public class Demo {

    public static void main(String[] args) throws ParseException, SQLException, ClassNotFoundException {
         System.out.println("Get connection ... ");
        Connection conn = JDBCConnection.getMySQLConnection();
        if (conn != null) {
            System.out.println("connect");
        } else {
            System.out.println("no connect");
        }
    }
}
