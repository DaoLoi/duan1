/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import repository.BanHangHoaDonRepo;
import service.ipml.IFBanHangHoaDon;
import viewModel.BanHangHoaDon;

/**
 *
 * @author ASUS
 */
public class BanHangHoaDonService implements IFBanHangHoaDon{

    private final BanHangHoaDonRepo bhHDRepo;
    
    public BanHangHoaDonService() {
        this.bhHDRepo = new BanHangHoaDonRepo();
    }
    @Override
    public List<BanHangHoaDon> getAll() {
    try {
            return bhHDRepo.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<BanHangHoaDon> timKiemHD(String idHoaDon) {
    try {
            return bhHDRepo.timKiemHD(idHoaDon);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<BanHangHoaDon> timKiemNgay(String ngayT, String ngayD) {
    try {
            return bhHDRepo.timKiemNgay(ngayT,ngayD);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<BanHangHoaDon> timKiemKH(String khachHang) {
    try {
            return bhHDRepo.timKiemKH(khachHang);
        } catch (Exception e) {
            return null;
        }
    }
    
    
}
