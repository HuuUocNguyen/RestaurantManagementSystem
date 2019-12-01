/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.JDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import model.HoaDonNhap;

/**
 *
 * @author Hazard
 */
public class HoaDonNhapDAO {
     public static ArrayList<HoaDonNhap> getListNgayNhap() throws ClassNotFoundException, SQLException {
        Connection conn = JDBCConnection.getMySQLConnection();
        ArrayList<HoaDonNhap> list = new ArrayList<HoaDonNhap>();
        //String sql = "SELECT ngayNhap FROM tblhoadonnhap ORDER BY ngayNhap ASC";
        String sql = "SELECT * FROM restaurant_management_system.tblhoadonnhap order by ngayNhap asc ";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonNhap hoaDonNhap = new HoaDonNhap();
                hoaDonNhap.setNgayNhap(rs.getDate("ngayNhap"));
                list.add(hoaDonNhap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static ArrayList<HoaDonNhap> getListNhaCungCapInformation() throws ClassNotFoundException, SQLException {
        Connection conn = JDBCConnection.getMySQLConnection();
        ArrayList<HoaDonNhap> list = new ArrayList<HoaDonNhap>();
        String sql = "SELECT maNhaCungCap, tenNhaCungCap, tongSoLuongNguyenLieu, tongTien FROM tblhoadonnhap";

        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonNhap hoaDonNhap = new HoaDonNhap();
                hoaDonNhap.setMaNhaCungCap(rs.getString("maNhaCungCap"));
                hoaDonNhap.setTenNhaCungCap(rs.getString("tenNhaCungCap"));
                hoaDonNhap.setTongSoLuongNguyenLieu(rs.getInt("tongSoLuongNguyenLieu"));
                hoaDonNhap.setTongTien(rs.getFloat("tongTien"));
                list.add(hoaDonNhap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        for (int i = 0; i < NhaCungCapDAO.getListNgayNhap().size(); i++) {
            System.out.println(NhaCungCapDAO.getListNgayNhap().get(i).getNgayNhap());
        }
        
//        for (int i = 0; i < NhaCungCapDAO.getListNhaCungCapInformation().size(); i++) {
//            System.out.println(NhaCungCapDAO.getListNhaCungCapInformation().get(i).getMaNhaCungCap() + " "+ NhaCungCapDAO.getListNhaCungCapInformation().get(i).getTenNhaCungCap() + " "+ NhaCungCapDAO.getListNhaCungCapInformation().get(i).getTongSoLuongNguyenLieu() + " "+NhaCungCapDAO.getListNhaCungCapInformation().get(i).getTongTien());
//        }
        
    }
}
