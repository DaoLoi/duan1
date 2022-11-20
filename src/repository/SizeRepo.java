/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Size;
import repository.ipml.IFSize;
import utilities.SQLSeverConnection;

/**
 *
 * @author Dell
 */
public class SizeRepo implements IFSize {

    @Override
    public List<Size> getAll() {
        List<Size> sizes = new ArrayList<>();
        String sql = "select IDSIZE,TENSIZE from SIZE";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idSize = rs.getString(1);
                String tenSize = rs.getString(2);

                Size s = new Size(idSize, tenSize);

                sizes.add(s);
            }
            rs.close();
            ps.close();
            con.close();
            return sizes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean add(Size sz) {
        String sql = "INSERT INTO SIZE(TENSIZE)Values(?)";
        try ( Connection con = SQLSeverConnection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, sz.getTenSize());
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
    public boolean update(Size sz, String idSize) {
        String sql = "UPDATE SIZE SET TENSIZE=? WHERE IDSIZE=?";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sz.getTenSize());
            ps.setString(2, idSize);
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
    public boolean delete(String idSize) {
        String sql = "DELETE FROM SIZE WHERE IDSIZE=?";
        try {
            Connection con = SQLSeverConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idSize);
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
