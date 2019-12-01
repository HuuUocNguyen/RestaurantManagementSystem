/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Hazard
 */
public class HoaDonNhap {
    private String maHoaDonNhap;
    private Date ngayNhap;
    private NhaCungCap nhaCungCap;
    private NguyenLieu nguyenLieu;
    private String maNhaCungCap;
    private String tenNhaCungCap;
    private int tongSoLuongNguyenLieu;
    private float tongTien;

    public HoaDonNhap() {
    }

    public HoaDonNhap(String maHoaDonNhap, Date ngayNhap, NhaCungCap nhaCungCap, NguyenLieu nguyenLieu, int tongSoLuongNguyenLieu, float tongTien) {
        this.maHoaDonNhap = maHoaDonNhap;
        this.ngayNhap = ngayNhap;
        this.nhaCungCap = nhaCungCap;
        this.nguyenLieu = nguyenLieu;
        this.tongSoLuongNguyenLieu = tongSoLuongNguyenLieu;
        this.tongTien = tongTien;
    }

    public String getMaHoaDonNhap() {
        return maHoaDonNhap;
    }

    public void setMaHoaDonNhap(String maHoaDonNhap) {
        this.maHoaDonNhap = maHoaDonNhap;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public NhaCungCap getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(NhaCungCap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public NguyenLieu getNguyenLieu() {
        return nguyenLieu;
    }

    public void setNguyenLieu(NguyenLieu nguyenLieu) {
        this.nguyenLieu = nguyenLieu;
    }

    public int getTongSoLuongNguyenLieu() {
        return tongSoLuongNguyenLieu;
    }

    public void setTongSoLuongNguyenLieu(int tongSoLuongNguyenLieu) {
        this.tongSoLuongNguyenLieu = tongSoLuongNguyenLieu;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
    }

    

    
}
