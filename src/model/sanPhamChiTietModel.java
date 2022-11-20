/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author PC
 */
public class sanPhamChiTietModel {
    private String idctsp;
    private String idsp;
    private String idMauSac;
    private String idSize;
    private String idncc;
    private String idlsp;
    private BigDecimal giaNhap;
    private BigDecimal giaBan;
    private String chatLieu;
    private int slTon;
    private String ngayLap;
    private String ngaySua;
    private boolean trangThai;

    public sanPhamChiTietModel() {
    }

    public sanPhamChiTietModel(String idctsp, String idsp, String idMauSac, String idSize, String idncc, String idlsp, BigDecimal giaNhap, BigDecimal giaBan, String chatLieu, int slTon, String ngayLap, String ngaySua, boolean trangThai) {
        this.idctsp = idctsp;
        this.idsp = idsp;
        this.idMauSac = idMauSac;
        this.idSize = idSize;
        this.idncc = idncc;
        this.idlsp = idlsp;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.chatLieu = chatLieu;
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

    public String getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(String idMauSac) {
        this.idMauSac = idMauSac;
    }

    public String getIdSize() {
        return idSize;
    }

    public void setIdSize(String idSize) {
        this.idSize = idSize;
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

    public BigDecimal getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
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
