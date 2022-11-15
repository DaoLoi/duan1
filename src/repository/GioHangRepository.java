/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.GioHang;
import repository.ipml.IFGioHang;
import utilities.SQLSeverConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class GioHangRepository implements IFGioHang{

    @Override
    public List<GioHang> getList() {
    List<GioHang> gioHangs = new ArrayList<>();
    String sql = "SELECT IDGH,IDKH,IDNV,NGAYLAP,NGAYSUA,TRANGTHAI FROM GIOHANG";
    try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idGH = rs.getString(1);
                String idKH = rs.getString(2);
                String idNV = rs.getString(3);
                
                String ngayLap = rs.getString(4);
                String ngaySua = rs.getString(5);
                int trangThai = rs.getInt(6);

                GioHang gioHang = new GioHang(idGH, idKH, idNV, ngayLap, ngaySua, trangThai);

                gioHangs.add(gioHang);
            }
            rs.close();
            ps.close();
            con.close();
            return gioHangs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(GioHang gioHang) {
    String sql = "INSERT INTO GIOHANG(NGAYLAP,NGAYSUA,TRANGTHAI)values(?,?,?)";
    try ( Connection con = SQLSeverConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, gioHang.getNgayLap());
            ps.setString(2, gioHang.getNgaySua());
            ps.setInt(3, gioHang.getTrangThai());
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
    public boolean update(GioHang gioHang, String idGH) {
    String sql = "UPDATE GIOHANG SET NGAYLAP=?, NGAYSUA=?, TRANGTHAI=? WHERE IDGH=?";
    try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, gioHang.getNgayLap());
            ps.setString(2, gioHang.getNgaySua());
            ps.setInt(3, gioHang.getTrangThai());
            ps.setString(4, idGH);
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
    public boolean delete(String idGH) {
    String sql = "DELETE FROM GIOHANG WHERE IDGH=?";
    try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idGH);
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
