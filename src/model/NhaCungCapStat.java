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
public class NhaCungCapStat {
    private String ma;
    private NhaCungCap tenNhaCungCapStart;
    private int tongSoLuongNguyenLieu;
    private int tongSoTien;

    public NhaCungCapStat() {
    }

    public NhaCungCapStat(String ma, NhaCungCap tenNhaCungCapStart, int tongSoLuongNguyenLieu, int tongSoTien) {
        this.ma = ma;
        this.tenNhaCungCapStart = tenNhaCungCapStart;
        this.tongSoLuongNguyenLieu = tongSoLuongNguyenLieu;
        this.tongSoTien = tongSoTien;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public NhaCungCap getTenNhaCungCapStart() {
        return tenNhaCungCapStart;
    }

    public void setTenNhaCungCapStart(NhaCungCap tenNhaCungCapStart) {
        this.tenNhaCungCapStart = tenNhaCungCapStart;
    }

    public int getTongSoLuongNguyenLieu() {
        return tongSoLuongNguyenLieu;
    }

    public void setTongSoLuongNguyenLieu(int tongSoLuongNguyenLieu) {
        this.tongSoLuongNguyenLieu = tongSoLuongNguyenLieu;
    }

    public int getTongSoTien() {
        return tongSoTien;
    }

    public void setTongSoTien(int tongSoTien) {
        this.tongSoTien = tongSoTien;
    }
    
    
}
