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
public class Nguoi {

    protected int IDNguoi;
    protected String ten;
    protected String soDienThoai;
    protected String email;
    protected String diaChi;

    public Nguoi() {
    }

    public Nguoi(int IDNguoi, String ten, String soDienThoai, String email, String diaChi) {
        this.IDNguoi = IDNguoi;
        this.ten = ten;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
    }

    public int getIDNguoi() {
        return IDNguoi;
    }

    public void setIDNguoi(int IDNguoi) {
        this.IDNguoi = IDNguoi;
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
