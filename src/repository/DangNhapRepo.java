/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.DangNhap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import repository.ipml.IFDangNhap;
import utilities.SQLSeverConnection;

/**
 *
 * @author PC
 */
public class DangNhapRepo implements IFDangNhap{
    
    @Override
    public List<DangNhap> getAll(){
        List<DangNhap> dns = new ArrayList<>();
        String sql="SELECT TENDN,MK,ChucVu from NHANVIEN";
        try {
            Connection connnect = SQLSeverConnection.getConnection();
            PreparedStatement ps = connnect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                
                String tenDangNhap= rs.getString("TENDN");
                String matKhau = rs.getString("MK");                
                String chuVu = rs.getString("ChucVu");
                DangNhap dn = new DangNhap(tenDangNhap, matKhau, chuVu);
                
                dns.add(dn);
                
            }
            rs.close();
            ps.close();
            connnect.close();
            return dns;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi");
        }
        
        return null;
    }
    
}
