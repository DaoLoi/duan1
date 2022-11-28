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
        String sqlString = " SELECT SANPHAM.IDSP, NHACUNGCAP.IDNCC , LOAISANPHAM.IDLSP,MAUSAC.IDMAUSAC,SIZE.IDSIZE, SANPHAM.TENSP ,SANPHAM.GIANHAP,SANPHAM.GIABAN,SANPHAM.CHATLIEU,SANPHAM.SLTON,SANPHAM.NGAYLAP,SANPHAM.NGAYSUA,SANPHAM.TRANGTHAI\n"
                + "FROM     dbo.LOAISANPHAM INNER JOIN\n"
                + "                  dbo.SANPHAM ON dbo.LOAISANPHAM.IDLSP = dbo.SANPHAM.IDLSP INNER JOIN\n"
                + "                  dbo.MAUSAC ON dbo.SANPHAM.IDMAUSAC = dbo.MAUSAC.IDMAUSAC INNER JOIN\n"
                + "                  dbo.NHACUNGCAP ON dbo.SANPHAM.IDNCC = dbo.NHACUNGCAP.IDNCC INNER JOIN\n"
                + "                  dbo.SIZE ON dbo.SANPHAM.IDSIZE = dbo.SIZE.IDSIZE";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlString);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getBigDecimal(7),
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
            ps.setString(1, sp.getIdncc());
            ps.setString(2, sp.getIdlsp());
            ps.setString(3, sp.getIdMauSac());
            ps.setString(4, sp.getIdSize());
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
    public boolean update(SanPham sp, String idSP) {
        String sql = " UPDATE SANPHAM SET IDNCC=?,IDLSP=?,IDMAUSAC=?,IDSIZE=?,TENSP=?,"
                + "GIANHAP=?,GIABAN=?,CHATLIEU=?,SLTON=?,NGAYLAP=?,NGAYSUA=?,TRANGTHAI=? WHERE IDSP=?";
        try ( Connection con = SQLSeverConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, sp.getIdncc());
            ps.setString(2, sp.getIdlsp());
            ps.setString(3, sp.getIdMauSac());
            ps.setString(4, sp.getIdSize());
            ps.setString(5, sp.getTenSP());
            ps.setBigDecimal(6, sp.getGiaNhap());
            ps.setBigDecimal(7, sp.getGiaBan());
            ps.setString(8, sp.getChatLieu());
            ps.setInt(9, sp.getSlTon());
            ps.setString(10, sp.getNgayLap());
            ps.setString(11, sp.getNgaySua());
            ps.setInt(12, sp.getTrangThai());
            ps.setString(13, idSP);
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (Exception e) {
        }
        return true;
    }

    @Override
    public boolean delete(String idSP) {
        String sql = " DELETE FROM SANPHAM WHERE IDSP=?";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idSP);
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
