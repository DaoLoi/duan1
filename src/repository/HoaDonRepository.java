/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.HoaDon;
import repository.ipml.IFHoaDon;
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
public class HoaDonRepository implements IFHoaDon{

    @Override
    public List<HoaDon> getList() {
    List<HoaDon> hoaDons = new ArrayList<>();
    String sql = "SELECT IDHD,IDKH,IDNV,NGAYLAP,NGAYSUA,TRANGTHAI FROM HOADON";
    try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idHD = rs.getString(1);
                String idKH = rs.getString(2);
                String idNV = rs.getString(3);

                String ngayLap = rs.getString(4);
                String ngaySua = rs.getString(5);
                int trangThai = rs.getInt(6);

                HoaDon hoaDon = new HoaDon(idHD, idKH, idNV, ngayLap, ngaySua, trangThai);

                hoaDons.add(hoaDon);
            }
            rs.close();
            ps.close();
            con.close();
            return hoaDons;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(HoaDon hoaDon) {
    String sql = "INSERT INTO HOADON(NGAYLAP,NGAYSUA,TRANGTHAI)values(?,?,?)";
    try ( Connection con = SQLSeverConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            

            ps.setString(1, hoaDon.getNgayLap());
            ps.setString(2, hoaDon.getNgaySua());
            ps.setInt(3, hoaDon.getTrangThai());
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
    public boolean update(HoaDon hoaDon, String idHD) {
    String sql = "UPDATE HOADON SET NGAYLAP=?, NGAYSUA=?, TRANGTHAI=? WHERE IDHD=?";
    try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);


            ps.setString(1, hoaDon.getNgayLap());
            ps.setString(2, hoaDon.getNgaySua());
            ps.setInt(3, hoaDon.getTrangThai());
            ps.setString(4, idHD);
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
    public boolean delete(String idHD) {
    String sql = "DELETE FROM HOADON WHERE IDHD=?";
    try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idHD);
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
