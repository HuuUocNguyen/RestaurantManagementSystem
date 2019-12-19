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
public class NhaCungCap {

    private int IDNhaCungCap;
    private String ten;
    private String diaChi;
    private String moTa;
    private String email;
    private String soDienThoai;
    private int IDNguyenLieu;

    public NhaCungCap() {
    }

    public NhaCungCap(int IDNhaCungCap, String ten, String diaChi, String moTa, String email, String soDienThoai, int IDNguyenLieu) {
        this.IDNhaCungCap = IDNhaCungCap;
        this.ten = ten;
        this.diaChi = diaChi;
        this.moTa = moTa;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.IDNguyenLieu = IDNguyenLieu;
    }

    public int getIDNhaCungCap() {
        return IDNhaCungCap;
    }

    public void setIDNhaCungCap(int IDNhaCungCap) {
        this.IDNhaCungCap = IDNhaCungCap;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getIDNguyenLieu() {
        return IDNguyenLieu;
    }

    public void setIDNguyenLieu(int IDNguyenLieu) {
        this.IDNguyenLieu = IDNguyenLieu;
    }

}
