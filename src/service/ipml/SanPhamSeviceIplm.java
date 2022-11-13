/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.ipml;

import java.util.List;
import model.SanPham;
import repository.SanPhamRepository;
import service.SanPhamSevice;

/**
 *
 * @author LOIDEPTRAI
 */
public class SanPhamSeviceIplm implements SanPhamSevice {

    SanPhamRepository sprp = new SanPhamRepository();

    @Override
    public List<SanPham> getAll() {
        return sprp.getAll();
    }

    @Override
    public boolean insert(SanPham sp) {
        return sprp.insert(sp);
    }

    @Override
    public boolean update(SanPham sp) {
        return sprp.update(sp);
    }

    @Override
    public boolean delete(String idsp) {
        return sprp.delete(idsp);
    }

}
