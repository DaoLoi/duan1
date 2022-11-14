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
import utilities.SQLSeverConnection;
/**
 *
 * @author VU TUAN
 */
public class LoaiSPRepo {
    public List<LoaiSanPham> getLSP() throws SQLException{
        List<LoaiSanPham> list = new ArrayList<>();
        Connection con = SQLSeverConnection.getConnection();
        String sql = "select IDLSP,TENLSP,NGAYLAP,NGAYSUA,TRANGTHAI from LoaiSanPham";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            list.add(new LoaiSanPham(rs.getString("IDLSP"),
                    rs.getString("TENLSP"),
                    rs.getString("NGAYLAP"),
                    rs.getString("NGAYSUA"),
                    rs.getInt("TRANGTHAI")
                    ));
        }
        return list;
    }
    public void add(LoaiSanPham list) throws SQLException{
        Connection con = SQLSeverConnection.getConnection();
        String sql = "INSERT INTO LOAISANPHAM(TENLSP,NGAYLAP,NGAYSUA,TRANGTHAI) VALUES (?,?,?,?,?) ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, list.getTenlsp());
        ps.setString(2, list.getNgaylap());
        ps.setString(3, list.getNgaysua());
        ps.setInt(4, list.getTrangthai());
        ps.executeUpdate();
    }
}
