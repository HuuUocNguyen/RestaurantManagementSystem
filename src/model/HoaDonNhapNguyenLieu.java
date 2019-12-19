/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Hazard
 */
public class HoaDonNhapNguyenLieu {

    private int IDHoaDonNhap;
    private Date ngayNhap;
    private float tongTien;
    private int soLuong;
    private int IDnhaCungCap;

    public HoaDonNhapNguyenLieu() {

    }

    public HoaDonNhapNguyenLieu(int IDHoaDonNhap, Date ngayNhap, float tongTien, int soLuong, int IDnhaCungCap) {
        this.IDHoaDonNhap = IDHoaDonNhap;
        this.ngayNhap = ngayNhap;
        this.tongTien = tongTien;
        this.soLuong = soLuong;
        this.IDnhaCungCap = IDnhaCungCap;
    }

    public int getIDHoaDonNhap() {
        return IDHoaDonNhap;
    }

    public void setIDHoaDonNhap(int IDHoaDonNhap) {
        this.IDHoaDonNhap = IDHoaDonNhap;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getIDnhaCungCap() {
        return IDnhaCungCap;
    }

    public void setIDnhaCungCap(int IDnhaCungCap) {
        this.IDnhaCungCap = IDnhaCungCap;
    }

}
