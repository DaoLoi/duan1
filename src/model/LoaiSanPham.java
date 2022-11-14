/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author VU TUAN
 */
public class LoaiSanPham {
    private String idsp;
    private String tenlsp;
    private String ngaylap;
    private String ngaysua;
    private int trangthai;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String idsp, String tenlsp, String ngaylap, String ngaysua, int trangthai) {
        this.idsp = idsp;
        this.tenlsp = tenlsp;
        this.ngaylap = ngaylap;
        this.ngaysua = ngaysua;
        this.trangthai = trangthai;
    }

    public String getIdsp() {
        return idsp;
    }

    public void setIdsp(String idsp) {
        this.idsp = idsp;
    }

    public String getTenlsp() {
        return tenlsp;
    }

    public void setTenlsp(String tenlsp) {
        this.tenlsp = tenlsp;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    public String getNgaysua() {
        return ngaysua;
    }

    public void setNgaysua(String ngaysua) {
        this.ngaysua = ngaysua;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "LoaiSanPham{" + "idsp=" + idsp + ", tenlsp=" + tenlsp + ", ngaylap=" + ngaylap + ", ngaysua=" + ngaysua + ", trangthai=" + trangthai + '}';
    }
    
    
}
