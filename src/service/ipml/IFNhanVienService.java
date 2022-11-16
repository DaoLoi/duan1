/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.ipml;

import java.util.List;
import model.NhanVien;

/**
 *
 * @author PC
 */
public interface IFNhanVienService {
    List<NhanVien> getAll();
    boolean them(NhanVien nv);
    boolean sua(NhanVien nv,String idNV);
    boolean xoa(String ma);
}
