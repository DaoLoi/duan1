/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class sanPhamChiTiet {
    private String idctsp;
    private String idsp;
    private String idncc;
    private String idlsp;
    private String idghct;
    private String ten;
    private String size;
    private String chatLieu;
    private String donGia;
    private int slTon;
    private String ngayLap;
    private String ngaySua;
    private boolean trangThai;

    public sanPhamChiTiet() {
    }

    public sanPhamChiTiet(String idctsp, String idsp, String idncc, String idlsp, String idghct, String ten, String size, String chatLieu, String donGia, int slTon, String ngayLap, String ngaySua, boolean trangThai) {
        this.idctsp = idctsp;
        this.idsp = idsp;
        this.idncc = idncc;
        this.idlsp = idlsp;
        this.idghct = idghct;
        this.ten = ten;
        this.size = size;
        this.chatLieu = chatLieu;
        this.donGia = donGia;
        this.slTon = slTon;
        this.ngayLap = ngayLap;
        this.ngaySua = ngaySua;
        this.trangThai = trangThai;
    }

    public String getIdctsp() {
        return idctsp;
    }

    public void setIdctsp(String idctsp) {
        this.idctsp = idctsp;
    }

    public String getIdsp() {
        return idsp;
    }

    public void setIdsp(String idsp) {
        this.idsp = idsp;
    }

    public String getIdncc() {
        return idncc;
    }

    public void setIdncc(String idncc) {
        this.idncc = idncc;
    }

    public String getIdlsp() {
        return idlsp;
    }

    public void setIdlsp(String idlsp) {
        this.idlsp = idlsp;
    }

    public String getIdghct() {
        return idghct;
    }

    public void setIdghct(String idghct) {
        this.idghct = idghct;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public int getSlTon() {
        return slTon;
    }

    public void setSlTon(int slTon) {
        this.slTon = slTon;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(String ngaySua) {
        this.ngaySua = ngaySua;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
}
