/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import repository.ipml.IFBanHangHoaDon;
import utilities.SQLSeverConnection;
import viewModel.BanHangHoaDon;

/**
 *
 * @author ASUS
 */
public class BanHangHoaDonRepo implements IFBanHangHoaDon{

    
    @Override
    public List<BanHangHoaDon> getAll() {
    List<BanHangHoaDon> bhHDs = new ArrayList<>();
    String sql = "select HOADON.IDHD, NHANVIEN.TENNV, KHACHHANG.TENKH, HOADON.NGAYLAP, HOADON.TRANGTHAI "
            + "from KHACHHANG join HOADON on KHACHHANG.IDKH = HOADON.IDKH join NHANVIEN on HOADON.IDNV = NHANVIEN.IDNV";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idHD = rs.getString(1);
                String tenNV = rs.getString(2);
                String tenKH = rs.getString(3);
                String ngayLap = rs.getString(4);
                int trangThai = rs.getInt(5);
                
                BanHangHoaDon bhHD = new BanHangHoaDon(idHD, tenNV, tenKH, ngayLap, trangThai);
                bhHDs.add(bhHD);
            }
            rs.close();
            ps.close();
            con.close();
            return bhHDs;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("lỗi");
        }
        return null;
    }

    @Override
    public List<BanHangHoaDon> timKiemHD(String idHoaDon) {
    List<BanHangHoaDon> bhHDs = new ArrayList<>();
        String sql = "select HOADON.IDHD, NHANVIEN.TENNV, KHACHHANG.TENKH, HOADON.NGAYLAP, HOADON.TRANGTHAI from "
                + "KHACHHANG join HOADON on KHACHHANG.IDKH = HOADON.IDKH join NHANVIEN on HOADON.IDNV = NHANVIEN.IDNV "
                + "where HOADON.IDHD like '%"+idHoaDon+"%'";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idHD = rs.getString(1);
                String tenNV = rs.getString(2);
                String tenKH = rs.getString(3);
                String ngayLap = rs.getString(4);
                int trangThai = rs.getInt(5);
                
                BanHangHoaDon bhHD = new BanHangHoaDon(idHD, tenNV, tenKH, ngayLap, trangThai);
                bhHDs.add(bhHD);
            }
            rs.close();
            ps.close();
            con.close();
            return bhHDs;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("lỗi");
        }
        return null;
    }

    @Override
    public List<BanHangHoaDon> timKiemNgay(String ngayT, String ngayD) {
    List<BanHangHoaDon> bhHDs = new ArrayList<>();
    String sql = "select HOADON.IDHD, NHANVIEN.TENNV, KHACHHANG.TENKH, HOADON.NGAYLAP, HOADON.TRANGTHAI "
            + "from KHACHHANG join HOADON on KHACHHANG.IDKH = HOADON.IDKH join NHANVIEN on HOADON.IDNV = NHANVIEN.IDNV "
            + "where HOADON.NGAYLAP > '"+ngayT+"'  and HOADON.NGAYLAP <'"+ngayD+"'";
    try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idHD = rs.getString(1);
                String tenNV = rs.getString(2);
                String tenKH = rs.getString(3);
                String ngayLap = rs.getString(4);
                int trangThai = rs.getInt(5);
                
                BanHangHoaDon bhHD = new BanHangHoaDon(idHD, tenNV, tenKH, ngayLap, trangThai);
                bhHDs.add(bhHD);
            }
            rs.close();
            ps.close();
            con.close();
            return bhHDs;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("lỗi");
        }
        return null;
    }

    @Override
    public List<BanHangHoaDon> timKiemKH(String khachHang) {
    List<BanHangHoaDon> bhHDs = new ArrayList<>();
    String sql = "select HOADON.IDHD, NHANVIEN.TENNV, KHACHHANG.TENKH, HOADON.NGAYLAP, HOADON.TRANGTHAI "
            + "from KHACHHANG join HOADON on KHACHHANG.IDKH = HOADON.IDKH join NHANVIEN on HOADON.IDNV = NHANVIEN.IDNV "
            + "where KHACHHANG.TENKH like N'%"+khachHang+"%'";
    try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idHD = rs.getString(1);
                String tenNV = rs.getString(2);
                String tenKH = rs.getString(3);
                String ngayLap = rs.getString(4);
                int trangThai = rs.getInt(5);
                
                BanHangHoaDon bhHD = new BanHangHoaDon(idHD, tenNV, tenKH, ngayLap, trangThai);
                bhHDs.add(bhHD);
            }
            rs.close();
            ps.close();
            con.close();
            return bhHDs;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("lỗi");
        }
        return null;
    }
    
}
