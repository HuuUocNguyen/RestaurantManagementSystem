/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Hazard
 */
public class HoaDon {
    private String maBan;
    private String tenHoaDon;
    private NhanVien maNhanVien;
    private KhachHang tenKhachHang;
    private Combo combo;
    private float tongSoTienCuaHoaDon;

    public HoaDon() {
    }

    public HoaDon(String maBan, String tenHoaDon, NhanVien maNhanVien, KhachHang tenKhachHang, Combo combo, float tongSoTienCuaHoaDon) {
        this.maBan = maBan;
        this.tenHoaDon = tenHoaDon;
        this.maNhanVien = maNhanVien;
        this.tenKhachHang = tenKhachHang;
        this.combo = combo;
        this.tongSoTienCuaHoaDon = tongSoTienCuaHoaDon;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public String getTenHoaDon() {
        return tenHoaDon;
    }

    public void setTenHoaDon(String tenHoaDon) {
        this.tenHoaDon = tenHoaDon;
    }

    public NhanVien getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(NhanVien maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public KhachHang getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(KhachHang tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public float getTongSoTienCuaHoaDon() {
        return tongSoTienCuaHoaDon;
    }

    public void setTongSoTienCuaHoaDon(float tongSoTienCuaHoaDon) {
        this.tongSoTienCuaHoaDon = tongSoTienCuaHoaDon;
    }
    
    
}
