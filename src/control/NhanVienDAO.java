/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import connect.JDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Account;

/**
 *
 * @author Hazard
 */
public class NhanVienDAO {

    public static ArrayList<Account> getList() throws ClassNotFoundException, SQLException {
        Connection conn = JDBCConnection.getMySQLConnection();
        ArrayList<Account> list = new ArrayList<Account>();
        String sql = "SELECT * FROM restaurant_management_system.tblaccount";

        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Account account = new Account();
                account.setUserName(rs.getString("userName"));
                account.setPassWord(rs.getString("passWord"));
                list.add(account);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        for (int i = 0; i < NhanVienDAO.getList().size(); i++) {
            System.out.println(NhanVienDAO.getList().get(i).getUserName() + " " + NhanVienDAO.getList().get(i).getPassWord());
        }
    }
}
