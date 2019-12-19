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
public class NguyenLieu {

    private String IDNguyenLieu;
    private String ten;
    private float donGia;
    private String mota;

    public NguyenLieu() {
    }

    public NguyenLieu(String IDNguyenLieu, String ten, float donGia, String mota) {
        this.IDNguyenLieu = IDNguyenLieu;
        this.ten = ten;
        this.donGia = donGia;
        this.mota = mota;
    }

    public String getIDNguyenLieu() {
        return IDNguyenLieu;
    }

    public void setIDNguyenLieu(String IDNguyenLieu) {
        this.IDNguyenLieu = IDNguyenLieu;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

}
