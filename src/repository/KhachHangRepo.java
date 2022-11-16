/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.KhachHang;
import utilities.SQLSeverConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import repository.ipml.IFKhachHang;

/**
 *
 * @author admin
 */
public class KhachHangRepo implements IFKhachHang{

    @Override
    public List<KhachHang> getList() {
        List<KhachHang> khachHangs = new ArrayList<>();
        String sql = "select IDKH, TENKH, SDT, DIACHI, NGAYLAP, NGAYSUA, TRANGTHAI from KHACHHANG";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                String idKH = rs.getString(1);
                String tenKH = rs.getString(2);
                String sdt = rs.getString(3);
                String diaChi = rs.getString(4);
                String ngayLap = rs.getString(5);
                String ngaySua = rs.getString(6);
                int trangThai = rs.getInt(7);
                
                KhachHang KH = new KhachHang(idKH, tenKH, sdt, diaChi, ngayLap, ngaySua, trangThai);
                khachHangs.add(KH);
                
            }
            rs.close();
            ps.close();
            con.close();
            return khachHangs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(KhachHang kh) {
        String sql = "INSERT INTO KHACHHANG(TENKH,SDT,DIACHI,NGAYLAP,NGAYSUA,TRANGTHAI)values(?,?,?,?,?,?)";
        try ( Connection con = SQLSeverConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, kh.getTen());
            ps.setString(2, kh.getSdt());
            ps.setString(3, kh.getDiaChi());
            ps.setString(4, kh.getNgayLap());
            ps.setString(5, kh.getNgaySua());
            ps.setInt(6, kh.getTrangThai());
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean update(KhachHang kh, String idKH) {
        String sql = "update KHACHHANG set TENKH=?, SDT=?, DIACHI=?,NGAYLAP=?,NGAYSUA=?,TRANGTHAI=? where IDKH=?";
        try {
            Connection con = SQLSeverConnection.getConnection(); 
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, kh.getTen());
            ps.setString(2, kh.getSdt());
            ps.setString(3, kh.getDiaChi());
            ps.setString(4, kh.getNgayLap());
            ps.setString(5, kh.getNgaySua());
            ps.setInt(6, kh.getTrangThai());
            ps.setString(7, idKH);
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean delate(String idKH) {
        String sql = "DELETE FROM KHACHHANG WHERE IDKH=?";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idKH);
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
   
    
}
