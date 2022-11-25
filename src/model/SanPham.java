/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author yt241
 */
public class SanPham {

    private int idsp;
    private int idncc, idlsp, idMauSac, idSize;
    private String tenSP;
    private BigDecimal giaNhap, giaBan;
    private String chatLieu;
    private int slTon;
    private String ngayLap;
    private String ngaySua;
    private int trangThai;

    public SanPham() {
    }

    public SanPham(int idsp, int idncc, int idlsp, int idMauSac, int idSize, String tenSP, BigDecimal giaNhap, BigDecimal giaBan, String chatLieu, int slTon, String ngayLap, String ngaySua, int trangThai) {
        this.idsp = idsp;
        this.idncc = idncc;
        this.idlsp = idlsp;
        this.idMauSac = idMauSac;
        this.idSize = idSize;
        this.tenSP = tenSP;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.chatLieu = chatLieu;
        this.slTon = slTon;
        this.ngayLap = ngayLap;
        this.ngaySua = ngaySua;
        this.trangThai = trangThai;
    }

    public int getIdsp() {
        return idsp;
    }

    public void setIdsp(int idsp) {
        this.idsp = idsp;
    }

    public int getIdncc() {
        return idncc;
    }

    public void setIdncc(int idncc) {
        this.idncc = idncc;
    }

    public int getIdlsp() {
        return idlsp;
    }

    public void setIdlsp(int idlsp) {
        this.idlsp = idlsp;
    }

    public int getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(int idMauSac) {
        this.idMauSac = idMauSac;
    }

    public int getIdSize() {
        return idSize;
    }

    public void setIdSize(int idSize) {
        this.idSize = idSize;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
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

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    
}
