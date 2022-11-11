/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import model.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utilities.SQLSeverConnection;

/**
 *
 * @author LOIDEPTRAI
 */
public class SanPhamRepository {

    public List<SanPham> getAll() {
        String query = "SELECT [IDSP]\n"
                + "      ,[TENSP]\n"
                + "      ,[NGAYLAP]\n"
                + "      ,[NGAYSUA]\n"
                + "      ,[TRANGTHAI]\n"
                + "  FROM [dbo].[SANPHAM]";
        try ( Connection con = SQLSeverConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<SanPham> getAll = new ArrayList<>();
            while (rs.next()) {
                SanPham sp = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                getAll.add(sp);
            }
            return getAll;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean insert(SanPham sp) {
        String query = "INSERT INTO [dbo].[SANPHAM]\n"
                + "           ([TENSP]\n"
                + "           ,[NGAYLAP]\n"
                + "           ,[NGAYSUA]\n"
                + "           ,[TRANGTHAI])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        try ( Connection con = SQLSeverConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, sp.getTenSp());
            ps.setObject(2, sp.getNgayLap());
            ps.setObject(3, sp.getNgaySua());
            ps.setObject(4, sp.getTrangThai());
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return false;
    }

    public boolean update(SanPham sp) {
        String query = "UPDATE [dbo].[SANPHAM]\n"
                + "   SET \n"
                + "      [TENSP] = ?\n"
                + "      ,[NGAYLAP] = ?\n"
                + "      ,[NGAYSUA] = ?\n"
                + "      ,[TRANGTHAI] = ?\n"
                + " WHERE [IDSP] = ?";
        try ( Connection con = SQLSeverConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, sp.getTenSp());
            ps.setObject(2, sp.getNgayLap());
            ps.setObject(3, sp.getNgaySua());
            ps.setObject(4, sp.getTrangThai());
            ps.setObject(5, sp.getIdsp());
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return false;
    }

    public boolean delete(String idsp) {
        String query = "DELETE FROM [dbo].[SANPHAM]\n"
                + "      WHERE [IDSP] = ?";
        try ( Connection con = SQLSeverConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, idsp);
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return false;
    }
}
