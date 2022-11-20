/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.ipml;

import java.util.List;
import model.sanPhamChiTietModel;

/**
 *
 * @author ASUS
 */
public interface IFSanPhamChiTiet {
    List<sanPhamChiTietModel> getAll();
    
    public boolean add(sanPhamChiTietModel spCT);
    
    public boolean update(sanPhamChiTietModel spCT, String idCTsp);
    
    public boolean delete(String idCTsp);
}
