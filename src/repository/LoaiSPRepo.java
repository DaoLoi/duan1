/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.LoaiSanPham;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.ipml.IFLoaiSP;
import utilities.SQLSeverConnection;

/**
 *
 * @author VU TUAN
 */
public class LoaiSPRepo implements IFLoaiSP {

    @Override
    public List<LoaiSanPham> getLSP() {
        try {
            List<LoaiSanPham> list = new ArrayList<>();
            Connection con = SQLSeverConnection.getConnection();
            String sql = "select IDLSP,TENLSP,NGAYLAP,NGAYSUA,TRANGTHAI from LoaiSanPham";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new LoaiSanPham(rs.getString("IDLSP"),
                        rs.getString("TENLSP"),
                        rs.getString("NGAYLAP"),
                        rs.getString("NGAYSUA"),
                        rs.getInt("TRANGTHAI")
                ));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSPRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void add(LoaiSanPham list) {
        try {
            Connection con = SQLSeverConnection.getConnection();
            String sql = "INSERT INTO LOAISANPHAM(TENLSP,NGAYLAP,NGAYSUA,TRANGTHAI) VALUES (?,?,?,?,?) ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, list.getTenlsp());
            ps.setString(2, list.getNgaylap());
            ps.setString(3, list.getNgaysua());
            ps.setInt(4, list.getTrangthai());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSPRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void sua(LoaiSanPham lsp) {
        try {
            Connection con = SQLSeverConnection.getConnection();
            String sql = "UPDATE [dbo].[LOAISANPHAM]\n"
                    + "   SET \n"
                    + "      [TENLSP] = ?\n"
                    + "      ,[NGAYLAP] = ?\n"
                    + "      ,[NGAYSUA] = ?\n"
                    + "      ,[TRANGTHAI] = ?\n"
                    + " WHERE [IDLSP] = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, lsp.getTenlsp());
            ps.setString(2, lsp.getNgaylap());
            ps.setString(3, lsp.getNgaysua());
            ps.setInt(4, lsp.getTrangthai());
            ps.setString(5, lsp.getIdsp());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSPRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void xoa(String idlsp) {
        try {
            Connection con = SQLSeverConnection.getConnection();
            String sql = "DELETE FROM [dbo].[LOAISANPHAM]\n"
                    + "      WHERE [IDSLP] = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idlsp);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSPRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
}
