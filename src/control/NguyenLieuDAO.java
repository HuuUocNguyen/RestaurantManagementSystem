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

    static private ArrayList<HoaDonNhapNguyenLieu> list;

    public NguyenLieuDAO(ArrayList<HoaDonNhapNguyenLieu> list) {
        this.list = list;
    }

    public static ArrayList<HoaDonNhapNguyenLieu> getAllNguyenLieu() throws ClassNotFoundException, SQLException {
        ArrayList<HoaDonNhapNguyenLieu> listHoaDonNhapNguyenLieu = null;
        listHoaDonNhapNguyenLieu = NguyenLieuDAO.list;
        for(int i=0; i<listHoaDonNhapNguyenLieu.size(); i++){
            System.out.println(listHoaDonNhapNguyenLieu.get(i).getIDnhaCungCap());
            System.out.println(listHoaDonNhapNguyenLieu.get(i).getSoLuong());
            System.out.println(listHoaDonNhapNguyenLieu.get(i).getTongTien());
        }
                
        return null;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        NguyenLieuDAO nguyenLieuDAO = new NguyenLieuDAO(list);
        nguyenLieuDAO.getAllNguyenLieu();
    }
}
