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
import model.HoaDonNhapNguyenLieu;

/**
 *
 * @author Hazard
 */
public class NguyenLieuDAO {

    public NguyenLieuDAO() {

    }

    public static ArrayList<HoaDonNhapNguyenLieu> getAllNguyenLieu(java.sql.Date sqlStartDate, java.sql.Date sqlEndDate) throws ClassNotFoundException, SQLException {
        Connection conn = JDBCConnection.getMySQLConnection();
        ArrayList<HoaDonNhapNguyenLieu> list = new ArrayList<HoaDonNhapNguyenLieu>();
        String sql = "select IDNhaCungCap, ngayNhap, ngayNhap, sum(tong) as tongSoTien, sum(tongSoLuong) as tongSoLuong from(\n"
                + "	SELECT restaurant_management_system.tblnhacungcap.IDNhaCungCap,\n"
                + "	restaurant_management_system.tblhoadonnhapnguyenlieu.IDHoaDonNhapNguyenLieu,\n"
                + "	restaurant_management_system.tblhoadonnhapnguyenlieu.tongTien as tong,\n"
                + "	restaurant_management_system.tblhoadonnhapnguyenlieu.soLuong as tongSoLuong,\n"
                + "	restaurant_management_system.tblhoadonnhapnguyenlieu.ngayNhap\n"
                + "	FROM restaurant_management_system.tblhoadonnhapnguyenlieu\n"
                + "	INNER JOIN restaurant_management_system.tblnhacungcap ON\n"
                + "	restaurant_management_system.tblhoadonnhapnguyenlieu.IDNhaCungCap = restaurant_management_system.tblnhacungcap.IDNhaCungCap\n"
                + "     WHERE ngayNhap BETWEEN '" + sqlStartDate + "' AND '" + sqlEndDate + "' \n"
                + "	ORDER BY restaurant_management_system.tblhoadonnhapnguyenlieu.soLuong DESC\n"
                + ") as bangTam group by IDNhaCungCap\n"
                + "";

        System.out.println(sql);
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonNhapNguyenLieu hoaDonNhapNguyenLieu = new HoaDonNhapNguyenLieu();
                hoaDonNhapNguyenLieu.setSoLuong((int) rs.getFloat("tongTien"));
                hoaDonNhapNguyenLieu.setTongTien(rs.getInt("soLuong"));
                hoaDonNhapNguyenLieu.setNgayNhap(rs.getDate("ngayNhap"));
                list.add(hoaDonNhapNguyenLieu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
    }
}
