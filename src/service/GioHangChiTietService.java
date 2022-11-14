/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.GioHangChiTiet;
import repository.GioHangChiTietRepo;
import service.ipml.IFGioHangChiTiet;
import java.util.List;

/**
 *
 * @author Dell
 */
public class GioHangChiTietService implements IFGioHangChiTiet {

    private final GioHangChiTietRepo chiTietRepo;

    public GioHangChiTietService() {
        this.chiTietRepo = new GioHangChiTietRepo();
    }

    @Override
    public List<GioHangChiTiet> getList() {
        try {
            return chiTietRepo.getList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean add(GioHangChiTiet chiTiet) {
        return chiTietRepo.add(chiTiet);
    }

    @Override
    public boolean update(GioHangChiTiet chiTiet, String idGHCT) {
        return chiTietRepo.update(chiTiet, idGHCT);
    }

    @Override
    public boolean delete(String idGHCT) {
        return chiTietRepo.delete(idGHCT);
    }

}
