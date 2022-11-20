/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.sanPhamChiTietModel;
import repository.ipml.IFSanPhamChiTiet;
import utilities.SQLSeverConnection;

/**
 *
 * @author ASUS
 */
public class SanPhamChiTietRepo implements IFSanPhamChiTiet{

    @Override
    public List<sanPhamChiTietModel> getAll() {
    List<sanPhamChiTietModel> spCTs = new ArrayList<>();
    String sql = "SELECT IDCTSP,IDSP,IDNCC,IDLSP,IDMAUSAC,IDSIZE,GIANHAP,GIABAN,CHATLIEU,SLTON,NGAYLAP,NGAYSUA,TRANGTHAI FROM CHITIETSANPHAM";
    try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idctsp = rs.getString(1);
                String idsp = rs.getString(2);
                String idMauSac = rs.getString(3);
                String idSize = rs.getString(4);
                String idncc = rs.getString(5);
                String idlsp = rs.getString(6);
                BigDecimal giaNhap = rs.getBigDecimal(7);
                BigDecimal giaBan = rs.getBigDecimal(8);
                String chatLieu = rs.getString(9);
                int slTon = rs.getInt(10);
                String ngayLap = rs.getString(11);
                String ngaySua = rs.getString(12);                
                boolean trangThai = rs.getBoolean(13);

                sanPhamChiTietModel spCT = new sanPhamChiTietModel(idctsp, idsp, idMauSac, idSize, idncc, idlsp, giaNhap, giaBan, chatLieu, slTon, ngayLap, ngaySua, trangThai);

                spCTs.add(spCT);
            }
            rs.close();
            ps.close();
            con.close();
            return spCTs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(sanPhamChiTietModel spCT) {
    String sql = "INSERT INTO CHITIETSANPHAM(GIANHAP,GIABAN,CHATLIEU,SLTON,NGAYLAP,NGAYSUA,TRANGTHAI)values(?,?,?,?,?,?,?)";
    try ( Connection con = SQLSeverConnection.getConnection(); 
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setBigDecimal(1, spCT.getGiaNhap());
            ps.setBigDecimal(2, spCT.getGiaBan());
            ps.setString(3, spCT.getChatLieu());
            ps.setInt(4, spCT.getSlTon());
            ps.setString(5, spCT.getNgayLap());
            ps.setString(6, spCT.getNgaySua());
            ps.setBoolean(7, spCT.isTrangThai());
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
    public boolean update(sanPhamChiTietModel spCT, String idCTsp) {
    String sql = "UPDATE CHITIETSANPHAM SET GIANHAP=?, GIABAN=?, CHATLIEU=?, SLTON=?, NGAYLAP=?, NGAYSUA=?, TRANGTHAI=? WHERE IDCTSP=?";
    try ( 
            Connection con = SQLSeverConnection.getConnection(); 
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setBigDecimal(1, spCT.getGiaNhap());
            ps.setBigDecimal(2, spCT.getGiaBan());
            ps.setString(3, spCT.getChatLieu());
            ps.setInt(4, spCT.getSlTon());
            ps.setString(5, spCT.getNgayLap());
            ps.setString(6, spCT.getNgaySua());
            ps.setBoolean(7, spCT.isTrangThai());
            ps.setString(8, idCTsp);
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
    public boolean delete(String idCTsp) {
    String sql = "DELETE FROM CHITIETSANPHAM WHERE IDCTSP=?";
    try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idCTsp);
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

    
    

