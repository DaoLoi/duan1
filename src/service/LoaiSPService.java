/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.SQLException;
import model.LoaiSanPham;
import java.util.List;
import repository.LoaiSPRepo;
import model.LoaiSanPham;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.LoaiSPRepo;
import service.ipml.IFLoaiSP;

/**
 *
 * @author VU TUAN
 */
public class LoaiSPService implements IFLoaiSP {

    private final LoaiSPRepo lsprepo = new LoaiSPRepo();

    public List<LoaiSanPham> getLSP() {
        try {
            return lsprepo.getLSP();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void add(LoaiSanPham list) {
        lsprepo.add(list);
    }

    @Override
    public void sua(LoaiSanPham lsp,String idlsp) {
        lsprepo.sua(lsp,idlsp);
    }

    @Override
    public void xoa(String idlsp) {
        lsprepo.xoa(idlsp);
    }

}
