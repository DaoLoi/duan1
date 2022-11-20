/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.ipml;

import java.util.List;
import model.ChiTietSanPham;
import model.sanPhamChiTiet;

/**
 *
 * @author PC
 */
public interface IFBanHangService {
    List<sanPhamChiTiet> getChiTietSanPham(String tenSP);
    //String getMaGioHang(); 
    
}
