/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import utilities.SQLSeverConnection;
import repository.ipml.IFNhanVien;

/**
 *
 * @author PC
 */
public class NhanVienRepo implements IFNhanVien{

    @Override
    public List<NhanVien> getAll() {
        List<NhanVien> nvs = new ArrayList<>();
        String sql = "SELECT TENNV,ChucVu,TENDN,MK,NGAYSINH,QUEQUAN,SDT,CMND,NGAYLAP,NGAYSUA,TRANGTHAI,IDNV from NHANVIEN";
        try {
            Connection connnect = SQLSeverConnection.getConnection();
            PreparedStatement ps = connnect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String ten = rs.getString("TENNV");
                String chuVu = rs.getString("ChucVu");
                String tenDangNhap= rs.getString("TENDN");
                String matKhau = rs.getString("MK");
                String ngaySinh = rs.getString("NGAYSINH");
                String queQuan = rs.getString("QUEQUAN");
                String SDT = rs.getString("SDT");
                String CMND = rs.getString("CMND");
                String ngayLap = rs.getString("NGAYLAP");
                String ngaySua = rs.getString("NGAYSUA");
                int trangThai = rs.getInt("TRANGTHAI");
                String IDNV = rs.getString("IDNV");
                
                NhanVien nv = new NhanVien(ten, chuVu, tenDangNhap, matKhau, ngaySinh, queQuan, SDT, CMND, ngayLap, ngaySua, trangThai, IDNV);
                
                nvs.add(nv);
                
            }
            rs.close();
            ps.close();
            connnect.close();
            return nvs;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi");
        }
        
        return null;

    }

    @Override
    public boolean add(NhanVien nv){
        String sql="INSERT INTO NHANVIEN(TENNV,ChucVu,TENDN,MK,NGAYSINH,QUEQUAN,SDT,CMND,NGAYLAP,NGAYSUA,TRANGTHAI)values(?,?,?,?,?,?,?,?,?,?,?)";
        try ( Connection con = SQLSeverConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nv.getTen());
            ps.setString(2, nv.getChuVu());
            ps.setString(3, nv.getTenDangNhap());
            ps.setString(4, nv.getMatKhau());
            ps.setString(5, nv.getNgaySinh());
            ps.setString(6, nv.getQueQuan());
            ps.setString(7, nv.getSDT());
            ps.setString(8, nv.getCMND());
            ps.setString(9, nv.getNgayLap());
            ps.setString(10, nv.getNgaySua());
            ps.setInt(11, nv.getTrangThai());
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
    public boolean update(NhanVien nv, String idNV) {
        String sql = "UPDATE NHANVIEN SET TENNV=?,ChucVu=?,TENDN=?,MK=?,NGAYSINH=?,QUEQUAN=?,SDT=?,CMND=?,NGAYLAP=?,NGAYSUA=?,TRANGTHAI=? WHERE IDNV=?";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nv.getTen());
            ps.setString(2, nv.getChuVu());
            ps.setString(3, nv.getTenDangNhap());
            ps.setString(4, nv.getMatKhau());
            ps.setString(5, nv.getNgaySinh());
            ps.setString(6, nv.getQueQuan());
            ps.setString(7, nv.getSDT());
            ps.setString(8, nv.getCMND());
            ps.setString(9, nv.getNgayLap());
            ps.setString(10, nv.getNgaySua());
            ps.setInt(11, nv.getTrangThai());
            ps.setString(12, idNV);
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
    public boolean delete(String idNV) {
        String sql = "DELETE FROM NHANVIEN WHERE IDNV=?";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idNV);
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
