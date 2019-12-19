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
import java.util.Collection;
import model.Account;
import model.HoaDonNhapNguyenLieu;
import model.NhaCungCap;

/**
 *
 * @author Hazard
 */
public class NhaCungCapDAO {

    public static ArrayList<HoaDonNhapNguyenLieu> getAllNhaCungCap() throws ClassNotFoundException, SQLException {
        Connection conn = JDBCConnection.getMySQLConnection();
        ArrayList<HoaDonNhapNguyenLieu> list = new ArrayList<HoaDonNhapNguyenLieu>();
        String sql = "SELECT restaurant_management_system.tblnhacungcap.IDNhaCungCap,\n"
                + "restaurant_management_system.tblnhacungcap.ten,\n"
                + "restaurant_management_system.tblhoadonnhapnguyenlieu.tongTien,\n"
                + "restaurant_management_system.tblhoadonnhapnguyenlieu.soLuong\n"
                + "FROM restaurant_management_system.tblhoadonnhapnguyenlieu\n"
                + "INNER JOIN restaurant_management_system.tblnhacungcap ON\n"
                + "restaurant_management_system.tblhoadonnhapnguyenlieu.IDNhaCungCap = restaurant_management_system.tblnhacungcap.IDNhaCungCap\n"
                + "ORDER BY restaurant_management_system.tblhoadonnhapnguyenlieu.soLuong DESC";

        // String sql = "SELECT * FROM restaurant_management_system.tblhoadonnhapnguyenlieu";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonNhapNguyenLieu hoaDonNhapNguyenLieu = new HoaDonNhapNguyenLieu();
                hoaDonNhapNguyenLieu.setIDnhaCungCap(rs.getInt("IDNhaCungCap"));
                hoaDonNhapNguyenLieu.setSoLuong((int) rs.getFloat("tongTien"));
                hoaDonNhapNguyenLieu.setTongTien(rs.getInt("soLuong"));
                list.add(hoaDonNhapNguyenLieu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static ArrayList<NhaCungCap> getAllNhaCungCapByID() throws ClassNotFoundException, SQLException {
        Connection conn = JDBCConnection.getMySQLConnection();
        ArrayList<NhaCungCap> list = new ArrayList<NhaCungCap>();
        String sql = "SELECT restaurant_management_system.tblnhacungcap.IDNhaCungCap,\n"
                + "restaurant_management_system.tblnhacungcap.ten,\n"
                + "restaurant_management_system.tblhoadonnhapnguyenlieu.tongTien,\n"
                + "restaurant_management_system.tblhoadonnhapnguyenlieu.soLuong\n"
                + "FROM restaurant_management_system.tblhoadonnhapnguyenlieu\n"
                + "INNER JOIN restaurant_management_system.tblnhacungcap ON\n"
                + "restaurant_management_system.tblhoadonnhapnguyenlieu.IDNhaCungCap = restaurant_management_system.tblnhacungcap.IDNhaCungCap\n"
                + "ORDER BY restaurant_management_system.tblhoadonnhapnguyenlieu.soLuong DESC";
// String sql = "SELECT * FROM restaurant_management_system.tblhoadonnhapnguyenlieu";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhaCungCap nhaCungCap = new NhaCungCap();
                nhaCungCap.setIDNhaCungCap(rs.getInt("IDNhaCungCap"));
                nhaCungCap.setTen(rs.getString("ten"));
                list.add(nhaCungCap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        for (int i = 0; i < NhaCungCapDAO.getAllNhaCungCap().size(); i++) {
//            System.out.println(NhaCungCapDAO.getAllNhaCungCap().get(i).getIDnhaCungCap());
//            System.out.println(NhaCungCapDAO.getAllNhaCungCap().get(i).getSoLuong());
//            System.out.println(NhaCungCapDAO.getAllNhaCungCap().get(i).getTongTien());
//        }

        for (int i = 0; i < NhaCungCapDAO.getAllNhaCungCapByID().size(); i++) {
            System.out.println(NhaCungCapDAO.getAllNhaCungCapByID().get(i).getIDNhaCungCap());
            System.out.println(NhaCungCapDAO.getAllNhaCungCapByID().get(i).getTen());
        }

    }
}
