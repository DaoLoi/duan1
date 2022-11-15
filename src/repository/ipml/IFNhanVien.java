/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository.ipml;

import java.util.List;
import model.NhanVien;

/**
 *
 * @author PC
 */
public interface IFNhanVien {
    List<NhanVien> getAll();
    boolean add(NhanVien nv);
    boolean update(NhanVien nv, String idNV);
    boolean delete(String idNV);
}
