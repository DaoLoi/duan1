package repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.sanPhamChiTiet;
import utilities.SQLSeverConnection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author PC
 */
public class ChiTietSanPhamRepo {

    public List<sanPhamChiTiet> timKiem(String tenSP) {
        List<sanPhamChiTiet> chiTiets = new ArrayList<>();
        String sql = "SELECT [IDCTSP],[IDSP],[IDNCC],[IDLSP],[IDGHCT],[Ten],[SIZE],[CHATLIEU],[DONGIA],[SLTON],[NGAYLAP],[NGAYSUA],[TRANGTHAI]FROM [dbo].[CHITIETSANPHAM] WHERE Ten like N'%"+tenSP+"%'";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idCTSP = rs.getString(1);
                String IDSP = rs.getString(2);
                String IDNC = rs.getString(3);
                String IDLSP = rs.getString(4);
                String IDGHCT = rs.getString(5);
                String Ten = rs.getString(6);
                String SIZE = rs.getString(7);
                String CHATLIEU = rs.getString(8);
                String DONGIA = rs.getString(9);
                int SLTON = rs.getInt(10);
                String NGAYLAP = rs.getString(11);
                String NGAYSUA = rs.getString(12);
                Boolean TRANGTHAI = rs.getBoolean(13);

                sanPhamChiTiet chiTiet = new sanPhamChiTiet(idCTSP, IDSP, IDNC, IDLSP, IDGHCT, Ten, SIZE, CHATLIEU, DONGIA, SLTON, NGAYLAP, NGAYSUA, TRANGTHAI);

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
    
    
    public static void main(String[] args) {
        List<sanPhamChiTiet> list = new ChiTietSanPhamRepo().timKiem("Ao");
        
        for (sanPhamChiTiet phamChiTiet : list) {
            System.out.println(phamChiTiet.getTen());
        }
    }
}