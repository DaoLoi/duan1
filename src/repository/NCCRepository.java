/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import model.NhaCungCap;
import repository.ipml.IFNCCRepository;
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
public class NCCRepository implements IFNCCRepository {

    @Override
    public List<NhaCungCap> getAll() {
        String query = "SELECT [IDNCC]\n"
                + "      ,[TENCC]\n"
                + "      ,[DIACHI]\n"
                + "      ,[SDT]\n"
                + "      ,[NGAYLAP]\n"
                + "      ,[NGAYSUA]\n"
                + "      ,[TRANGTHAI]\n"
                + "  FROM [dbo].[NHACUNGCAP]";
        try ( Connection con = SQLSeverConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<NhaCungCap> list = new ArrayList<>();
            while (rs.next()) {
                NhaCungCap ncc = new NhaCungCap(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                list.add(ncc);
            }
            return list;

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean insert(NhaCungCap ncc) {
        String query = "INSERT INTO [dbo].[NHACUNGCAP]\n"
                + "           ([TENCC]\n"
                + "           ,[DIACHI]\n"
                + "           ,[SDT]\n"
                + "           ,[NGAYLAP]\n"
                + "           ,[NGAYSUA]\n"
                + "           ,[TRANGTHAI])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?)";

        try ( Connection con = SQLSeverConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ncc.getTenNCC());
            ps.setObject(2, ncc.getDiaChi());
            ps.setObject(3, ncc.getSdt());
            ps.setObject(4, ncc.getNgayLap());
            ps.setObject(5, ncc.getNgaySua());
            ps.setObject(6, ncc.getTrangThai());
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return false;
    }

    @Override
    public boolean update(NhaCungCap ncc) {
        String query = "UPDATE [dbo].[NHACUNGCAP]\n"
                + "   SET [TENCC] = ?\n"
                + "      ,[DIACHI] = ?\n"
                + "      ,[SDT] = ?\n"
                + "      ,[NGAYLAP] = ?\n"
                + "      ,[NGAYSUA] = ?\n"
                + "      ,[TRANGTHAI] = ?\n"
                + " WHERE [IDNCC] = ?";
        try ( Connection con = SQLSeverConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ncc.getTenNCC());
            ps.setObject(2, ncc.getDiaChi());
            ps.setObject(3, ncc.getSdt());
            ps.setObject(4, ncc.getNgayLap());
            ps.setObject(5, ncc.getNgaySua());
            ps.setObject(6, ncc.getTrangThai());
            ps.setObject(7, ncc.getIdNcc());
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        String query = "DELETE FROM [dbo].[NHACUNGCAP]\n"
                + "      WHERE IDNCC = ?";
        try ( Connection con = SQLSeverConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return false;
    }

}
