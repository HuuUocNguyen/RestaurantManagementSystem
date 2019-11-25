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
public class NhaHang {

    private String maBan;
    private String ten;
    private int soLuongKhachToiDa;
    private String moTa;

    public NhaHang() {
    }

    public NhaHang(String maBan, String ten, int soLuongKhachToiDa, String moTa) {
        this.maBan = maBan;
        this.ten = ten;
        this.soLuongKhachToiDa = soLuongKhachToiDa;
        this.moTa = moTa;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuongKhachToiDa() {
        return soLuongKhachToiDa;
    }

    public void setSoLuongKhachToiDa(int soLuongKhachToiDa) {
        this.soLuongKhachToiDa = soLuongKhachToiDa;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

}
