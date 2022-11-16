/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LOIDEPTRAI
 */
public class NhaCungCap {

    private String idNcc;
    private String tenNCC;
    private String diaChi;
    private String sdt;
    private String ngayLap;
    private String ngaySua;
    private int trangThai;

    public NhaCungCap() {
    }

    public NhaCungCap(String idNcc, String tenNCC, String diaChi, String sdt, String ngayLap, String ngaySua, int trangThai) {
        this.idNcc = idNcc;
        this.tenNCC = tenNCC;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.ngayLap = ngayLap;
        this.ngaySua = ngaySua;
        this.trangThai = trangThai;
    }

    public String getIdNcc() {
        return idNcc;
    }

    public void setIdNcc(String idNcc) {
        this.idNcc = idNcc;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
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

    public Object[] toRowData() {
        return new Object[]{idNcc, tenNCC, diaChi, sdt, ngayLap, ngaySua, trangThai};
    }
}
