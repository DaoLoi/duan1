/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LOIDEPTRAI
 */
public class SanPham {
    private String idsp;
    private String tenSp;
    private String ngayLap;
    private String ngaySua;
    private String trangThai;

    public SanPham() {
    }

    public SanPham(String idsp, String tenSp, String ngayLap, String ngaySua, String trangThai) {
        this.idsp = idsp;
        this.tenSp = tenSp;
        this.ngayLap = ngayLap;
        this.ngaySua = ngaySua;
        this.trangThai = trangThai;
    }

    public String getIdsp() {
        return idsp;
    }

    public void setIdsp(String idsp) {
        this.idsp = idsp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
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

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    public Object[] toRowData(){
        return new Object[] {idsp,tenSp,ngayLap,ngaySua,trangThai};
    }
}
