/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.ChiTietSanPham;
import model.GioHang;
import model.sanPhamChiTiet;
import repository.ChiTietSanPhamRepo;
import repository.GioHangRepository;
import service.ipml.IFBanHangService;

/**
 *
 * @author PC
 */
public class BanHangServiceImpl implements IFBanHangService{
    
    ChiTietSanPhamRepo cTSPRepo = new ChiTietSanPhamRepo();

    @Override
    public List<sanPhamChiTiet> getChiTietSanPham(String tenSP) {
        
        try {
            return cTSPRepo.timKiem(tenSP);
        } catch (Exception e) {
            return null;
        }
    }
    
    

    
    
}
