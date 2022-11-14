/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.GioHangChiTiet;
import repository.ipml.IFGIoHangChiTiet;
import utilities.SQLSeverConnection;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class GioHangChiTietRepo implements IFGIoHangChiTiet {

    @Override
    public List<GioHangChiTiet> getList() {
        List<GioHangChiTiet> chiTiets = new ArrayList<>();
        String sql = "SELECT IDGHCT,IDGH,IDCTSP,SOLUONG,DONGIA,NGAYLAP,NGAYSUA,TRANGTHAI FROM GIOHANGCHITIET";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idGHCT = rs.getString(1);
                String idGH = rs.getString(2);
                String idCTSP = rs.getString(3);
                int soLuong = rs.getInt(4);
                String donGia = rs.getString(5);
                String ngayLap = rs.getString(6);
                String ngaySua = rs.getString(7);
                int trangThai = rs.getInt(8);

                GioHangChiTiet chiTiet = new GioHangChiTiet(idGHCT, idGH, idCTSP, soLuong, donGia, ngayLap, ngaySua, trangThai);

                chiTiets.add(chiTiet);
            }
            rs.close();
            ps.close();
            con.close();
            return chiTiets;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(GioHangChiTiet chiTiet) {
        String sql = "INSERT INTO GIOHANGCHITIET(SOLUONG,DONGIA,NGAYLAP,NGAYSUA,TRANGTHAI)values(?,?,?,?,?)";
        try ( Connection con = SQLSeverConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, chiTiet.getSoLuong());
            ps.setString(2, chiTiet.getDonGia());
            ps.setString(3, chiTiet.getNgayLap());
            ps.setString(4, chiTiet.getNgaySua());
            ps.setInt(5, chiTiet.getTrangThai());
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
    public boolean update(GioHangChiTiet chiTiet, String idGHCT) {
        String sql = "UPDATE GIOHANGCHITIET SET SOLUONG=?, DONGIA=?, NGAYLAP=?, NGAYSUA=?, TRANGTHAI=? WHERE IDGHCT=?";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, chiTiet.getSoLuong());
            ps.setString(2, chiTiet.getDonGia());
            ps.setString(3, chiTiet.getNgayLap());
            ps.setString(4, chiTiet.getNgaySua());
            ps.setInt(5, chiTiet.getTrangThai());
            ps.setString(6, idGHCT);
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
    public boolean delete(String idGHCT) {
        String sql = "DELETE FROM GIOHANGCHITIET WHERE IDGHCT=?";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idGHCT);
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
    public List<GioHangChiTiet> timKiem(String timChuoi, int so) {
        List<GioHangChiTiet> chiTiets = new ArrayList<>();
        String sql = "select * from GIOHANGCHITIET where IDGHCT like N'%"+timChuoi+"%' or IDGH like'%"+timChuoi+"%'"
                + "or IDCTSP like'%"+timChuoi+"%' or SOLUONG like '%"+so+"%' or DONGIA like N'%"+timChuoi+"%' "
                + "or NGAYLAP like '%"+timChuoi+"%'or NGAYSUA like '%"+timChuoi+"%' or TRANGTHAI like "+so+"";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idGHCT = rs.getString(1);
                String idGH = rs.getString(2);
                String idCTSP = rs.getString(3);
                int soLuong = rs.getInt(4);
                String donGia = rs.getString(5);
                String ngayLap = rs.getString(6);
                String ngaySua = rs.getString(7);
                int trangThai = rs.getInt(8);

                GioHangChiTiet chiTiet = new GioHangChiTiet(idGHCT, idGH, idCTSP, soLuong, donGia, ngayLap, ngaySua, trangThai);

                chiTiets.add(chiTiet);
            }
            rs.close();
            ps.close();
            con.close();
            return chiTiets;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
