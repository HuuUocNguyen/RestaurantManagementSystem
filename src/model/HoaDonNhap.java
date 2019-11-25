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
public class HoaDonNhap {
    private NhaCungCap nhaCungCap;
    private NguyenLieu nguyenLieu;
    private float tongTien;

    public HoaDonNhap() {
    }

    public HoaDonNhap(NhaCungCap nhaCungCap, NguyenLieu nguyenLieu, float tongTien) {
        this.nhaCungCap = nhaCungCap;
        this.nguyenLieu = nguyenLieu;
        this.tongTien = tongTien;
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

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }
    
    
}
