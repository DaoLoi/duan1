/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.KhachHang;
import repository.KhachHangRepo;
import java.util.List;
import service.ipml.IFKhachHang;

/**
 *
 * @author admin
 */
public class KhachHangService implements IFKhachHang{
    private final KhachHangRepo khachHangRepo;

    public KhachHangService() {
        this.khachHangRepo = new KhachHangRepo();
    }

    @Override
    public List<KhachHang> getList() {
        try {
            return khachHangRepo.getList();
            
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean add(KhachHang Kh) {
        return khachHangRepo.add(Kh);
    }

    @Override
    public boolean update(KhachHang kh, String idKH) {
        return khachHangRepo.update(kh, idKH);
    }

    @Override
    public boolean delate(String idKH) {
        return khachHangRepo.delate(idKH);
    }
    

    
}
