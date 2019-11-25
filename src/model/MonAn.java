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
public class MonAn {
    private String ma;
    private String loai;
    private String ten;
    private String moTa;
    private float giaHienTai;

    public MonAn() {
        
    }

    public MonAn(String ma, String loai, String ten, String moTa, float giaHienTai) {
        this.ma = ma;
        this.loai = loai;
        this.ten = ten;
        this.moTa = moTa;
        this.giaHienTai = giaHienTai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public float getGiaHienTai() {
        return giaHienTai;
    }

    public void setGiaHienTai(float giaHienTai) {
        this.giaHienTai = giaHienTai;
    }
    
    
}
