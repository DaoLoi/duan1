/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.HoaDonChiTiet;
import repository.HoaDonChiTietRepo;
import service.ipml.IFHoaDonChiTiet;
import java.util.List;

/**
 *
 * @author Dell
 */
public class HoaDonChiTietService implements IFHoaDonChiTiet {

    private final HoaDonChiTietRepo chiTietRepo;

    public HoaDonChiTietService() {
        this.chiTietRepo = new HoaDonChiTietRepo();
    }

    @Override
    public List<HoaDonChiTiet> getList() {
        try {
            return chiTietRepo.getList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean add(HoaDonChiTiet chiTiet) {
        return chiTietRepo.add(chiTiet);
    }

    @Override
    public boolean update(HoaDonChiTiet chiTiet, String idGHCT) {
        return chiTietRepo.update(chiTiet, idGHCT);
    }

    @Override
    public boolean delete(String idGHCT) {
        return chiTietRepo.delete(idGHCT);
    }

}
