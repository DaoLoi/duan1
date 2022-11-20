/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import repository.ipml.IFMauSac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.MauSac;
import utilities.SQLSeverConnection;

/**
 *
 * @author Dell
 */
public class MauSacRepo implements IFMauSac {

    @Override
    public List<MauSac> getAll() {
        List<MauSac> mauSacs = new ArrayList<>();
        String sql = "select IDMAUSAC,TENMAU from MAUSAC";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idMau = rs.getString(1);
                String tenMau = rs.getString(2);

                MauSac mauSac = new MauSac(idMau, tenMau);

                mauSacs.add(mauSac);
            }
            rs.close();
            ps.close();
            con.close();
            return mauSacs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(MauSac mauSac) {
        String sql = "INSERT INTO MauSac(TENMAU)Values(?)";
        try ( Connection con = SQLSeverConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, mauSac.getTenMau());
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
    public boolean update(MauSac mauSac, String idMau) {
        String sql = "UPDATE MauSac SET TENMAU=? WHERE IDMAUSAC=?";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mauSac.getTenMau());
            ps.setString(2, idMau);
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
    public boolean delete(String idMau) {
        String sql = "DELETE FROM MauSac WHERE IDMAUSAC=?";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idMau);
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
