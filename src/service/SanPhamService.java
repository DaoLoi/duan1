/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.SanPham;
import repository.SanPhamRepo;
import repository.ipml.IFSanPham;

/**
 *
 * @author Dell
 */
public class SanPhamService implements IFSanPham {

    private final SanPhamRepo sanPhamRepo = new SanPhamRepo();

    @Override
    public List<SanPham> getList() {
        try {
            return sanPhamRepo.getList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean add(SanPham sp) {
        return sanPhamRepo.add(sp);
    }

    @Override
    public boolean update(SanPham sp, String idSP) {
        return sanPhamRepo.update(sp, idSP);
    }

    @Override
    public boolean delete(String idSP) {
        return sanPhamRepo.delete(idSP);
    }

}
