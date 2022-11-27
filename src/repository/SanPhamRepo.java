/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import model.SanPham;
import repository.ipml.IFSanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import utilities.SQLSeverConnection;

/**
 *
 * @author Dell
 */
public class SanPhamRepo implements IFSanPham {

    @Override
    public List<SanPham> getList() {
        List<SanPham> list = new ArrayList<>();
        String sqlString = " SELECT IDSP,IDNCC,IDLSP,IDMAUSAC,IDSIZE,TENSP,GIANHAP,"
                + "GIABAN,CHATLIEU,SLTON,NGAYLAP,NGAYSUA,TRANGTHAI FROM SANPHAM";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlString);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getBigDecimal(7),
                        rs.getBigDecimal(8), rs.getString(9), rs.getInt(10), rs.getString(11),
                        rs.getString(12), rs.getInt(13));

                list.add(sp);
            }
            rs.close();
            ps.close();
            con.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(SanPham sp) {
        String sql = " INSERT INTO SANPHAM(IDNCC,IDLSP,IDMAUSAC,IDSIZE,TENSP,GIANHAP,GIABAN,CHATLIEU,SLTON,NGAYLAP,NGAYSUA,TRANGTHAI)\n"
                + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, sp.getIdncc());
            ps.setInt(2, sp.getIdlsp());
            ps.setInt(3, sp.getIdMauSac());
            ps.setInt(4, sp.getIdSize());
            ps.setString(5, sp.getTenSP());
            ps.setBigDecimal(6, sp.getGiaNhap());
            ps.setBigDecimal(7, sp.getGiaNhap());
            ps.setString(8, sp.getChatLieu());
            ps.setInt(9, sp.getSlTon());
            ps.setString(10, sp.getNgayLap());
            ps.setString(11, sp.getNgaySua());
            ps.setInt(12, sp.getTrangThai());
            ps.executeUpdate();
            ps.close();
            con.close();

        } catch (Exception e) {
        }
        return true;
    }

    @Override
    public boolean update(SanPham sp, int idSP) {
        String sql = " UPDATE SANPHAM SET IDNCC=?,IDLSP=?,IDMAUSAC=?,IDSIZE=?,TENSP=?,"
                + "GIANHAP=?,GIABAN=?,CHATLIEU=?,SLTON=?,NGAYLAP=?,NGAYSUA=?,TRANGTHAI=? WHERE IDSP=?";
        try ( Connection con = SQLSeverConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, sp.getIdncc());
            ps.setInt(2, sp.getIdlsp());
            ps.setInt(3, sp.getIdMauSac());
            ps.setInt(4, sp.getIdSize());
            ps.setString(5, sp.getTenSP());
            ps.setBigDecimal(6, sp.getGiaNhap());
            ps.setBigDecimal(7, sp.getGiaBan());
            ps.setString(8, sp.getChatLieu());
            ps.setInt(9, sp.getSlTon());
            ps.setString(10, sp.getNgayLap());
            ps.setString(11, sp.getNgaySua());
            ps.setInt(12, sp.getTrangThai());
            ps.setInt(13, idSP);
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (Exception e) {
        }
        return true;
    }

    @Override
    public boolean delete(int idSP) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}