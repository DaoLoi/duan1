/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.sanPhamChiTietModel;
import repository.SanPhamChiTietRepo;
import service.ipml.IFSanPhamChiTiet;

/**
 *
 * @author ASUS
 */
public class SanPhamChiTietService implements IFSanPhamChiTiet{
    private final SanPhamChiTietRepo spCTRepo;
    public SanPhamChiTietService(){
        this.spCTRepo = new SanPhamChiTietRepo();
    }
    
    @Override
    public List<sanPhamChiTietModel> getAll() {
    try {
            return spCTRepo.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean add(sanPhamChiTietModel spCT) {
    return spCTRepo.add(spCT);
    }

    @Override
    public boolean update(sanPhamChiTietModel spCT, String idCTsp) {
    return spCTRepo.update(spCT, idCTsp);
    }

    @Override
    public boolean delete(String idCTsp) {
    return spCTRepo.delete(idCTsp);
    }
    
}
