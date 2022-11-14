/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class GioHang {
    
    private String idGH, idKH, idNV;
    private String ngayLap, ngaySua;
    private int trangThai;

    public GioHang() {
    }

    public GioHang(String idGH, String idKH, String idNV, String ngayLap, String ngaySua, int trangThai) {
        this.idGH = idGH;
        this.idKH = idKH;
        this.idNV = idNV;
        this.ngayLap = ngayLap;
        this.ngaySua = ngaySua;
        this.trangThai = trangThai;
    }

    public String getIdGH() {
        return idGH;
    }

    public void setIdGH(String idGH) {
        this.idGH = idGH;
    }

    public String getIdKH() {
        return idKH;
    }

    public void setIdKH(String idKH) {
        this.idKH = idKH;
    }

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
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

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    
}
