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
public class NhaCungCap extends Nguoi{
    private Date ngayNhap;
    private int tongSoMatHangNhap;
    private int tongSoTien;

    public NhaCungCap() {
    }

    public NhaCungCap(Date ngayNhap, int tongSoMatHangNhap, int tongSoTien) {
        this.ngayNhap = ngayNhap;
        this.tongSoMatHangNhap = tongSoMatHangNhap;
        this.tongSoTien = tongSoTien;
    }

    public NhaCungCap(Date ngayNhap, int tongSoMatHangNhap, int tongSoTien, String ma, String ten, String soDienThoai, String email, String diaChi) {
        super(ma, ten, soDienThoai, email, diaChi);
        this.ngayNhap = ngayNhap;
        this.tongSoMatHangNhap = tongSoMatHangNhap;
        this.tongSoTien = tongSoTien;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getTongSoMatHangNhap() {
        return tongSoMatHangNhap;
    }

    public void setTongSoMatHangNhap(int tongSoMatHangNhap) {
        this.tongSoMatHangNhap = tongSoMatHangNhap;
    }

    public int getTongSoTien() {
        return tongSoTien;
    }

    public void setTongSoTien(int tongSoTien) {
        this.tongSoTien = tongSoTien;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
   
    
    
}
