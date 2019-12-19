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
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import model.HoaDonNhapNguyenLieu;
import view.ThongKeNhaCungCapTheoDoanhChiFrm;

/**
 *
 * @author Hazard
 */
public class HoaDonNhapNguyenLieuDAO {

    public static ArrayList<java.sql.Date> getListNgayNhap() throws ClassNotFoundException, SQLException {
        Connection conn = JDBCConnection.getMySQLConnection();
        ArrayList<java.sql.Date> list = new ArrayList<>();
        //String sql = "SELECT ngayNhap FROM tblhoadonnhap ORDER BY ngayNhap ASC";
        String sql = "SELECT * FROM restaurant_management_system.tblhoadonnhapnguyenlieu order by ngayNhap asc ";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getDate("ngayNhap"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static ArrayList<java.sql.Date> getListNgayBatDau_NgayKetThuc() throws ClassNotFoundException, SQLException {
        Connection conn = JDBCConnection.getMySQLConnection();
        ArrayList<java.sql.Date> list = new ArrayList<>();
//        String sql = "SELECT * FROM restaurant_management_system.tblhoadonnhapnguyenlieu "
//                + " WHERE ngayNhap BETWEEN ('sqlStartDate' AND 'sqlEnđDate') order by ngayNhap asc ";
        String sql = "SELECT * FROM restaurant_management_system.tblhoadonnhapnguyenlieu\n"
                + "WHERE ngayNhap BETWEEN \"2019-10-01\" AND \"2019-10-05\"  order by ngayNhap asc ";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //list.add(rs.getDate("ngayNhap"));
                list.add(rs.getDate(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        ThongKeNhaCungCapTheoDoanhChiFrm theoDoanhChiFrm = new ThongKeNhaCungCapTheoDoanhChiFrm();
//        theoDoanhChiFrm.getDate();
//        System.out.println(  theoDoanhChiFrm.getDate());
        for (int i = 0; i < HoaDonNhapNguyenLieuDAO.getListNgayBatDau_NgayKetThuc().size(); i++) {
            System.out.println(HoaDonNhapNguyenLieuDAO.getListNgayBatDau_NgayKetThuc().get(i));
        }
    }
}
