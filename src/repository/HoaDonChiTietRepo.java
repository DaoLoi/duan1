/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.HoaDonChiTiet;
import repository.ipml.IFHoaDonChiTiet;
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
public class HoaDonChiTietRepo implements IFHoaDonChiTiet {

    @Override
    public List<HoaDonChiTiet> getList() {
        List<HoaDonChiTiet> chiTiets = new ArrayList<>();
        String sql = "SELECT IDHDCT,IDHD,IDCTSP,SOLUONG,DONGIA,NGAYLAP,NGAYSUA,TRANGTHAI FROM HOADONCHITIET";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idHDCT = rs.getString(1);
                String idHD = rs.getString(2);
                String idCTSP = rs.getString(3);
                int soLuong = rs.getInt(4);
                String donGia = rs.getString(5);
                String ngayLap = rs.getString(6);
                String ngaySua = rs.getString(7);
                int trangThai = rs.getInt(8);

                HoaDonChiTiet chiTiet = new HoaDonChiTiet(idHDCT, idHD, idCTSP, soLuong, donGia, ngayLap, ngaySua, trangThai);

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
    public boolean add(HoaDonChiTiet chiTiet) {
        String sql = "INSERT INTO HOADONCHITIET(SOLUONG,DONGIA,NGAYLAP,NGAYSUA,TRANGTHAI)values(?,?,?,?,?)";
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
    public boolean update(HoaDonChiTiet chiTiet, String idHDCT) {
        String sql = "UPDATE HOADONCHITIET SET SOLUONG=?, DONGIA=?, NGAYLAP=?, NGAYSUA=?, TRANGTHAI=? WHERE IDHDCT=?";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, chiTiet.getSoLuong());
            ps.setString(2, chiTiet.getDonGia());
            ps.setString(3, chiTiet.getNgayLap());
            ps.setString(4, chiTiet.getNgaySua());
            ps.setInt(5, chiTiet.getTrangThai());
            ps.setString(6, idHDCT);
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
    public boolean delete(String idHDCT) {
        String sql = "DELETE FROM HOADONCHITIET WHERE IDHDCT=?";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idHDCT);
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
