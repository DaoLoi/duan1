/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.ipml;

import java.util.List;
import viewModel.BanHangHoaDon;

/**
 *
 * @author ASUS
 */
public interface IFBanHangHoaDon {
    List<BanHangHoaDon> getAll();
    
    List<BanHangHoaDon> timKiemHD(String idHoaDon);
    
    List<BanHangHoaDon> timKiemNgay(String ngayT, String ngayD);
    
    List<BanHangHoaDon> timKiemKH(String khachHang);
}
