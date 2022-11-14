/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.LoaiSanPham;
import java.util.List;
import repository.LoaiSPRepo;
import service.ipml.IFLoaiSPService;
import model.LoaiSanPham;
import java.util.List;
import repository.LoaiSPRepo;
import service.ipml.IFLoaiSPService;

/**
 *
 * @author VU TUAN
 */
public class LoaiSPService implements IFLoaiSPService{
    private LoaiSPRepo lsprepo = new LoaiSPRepo();
    public List<LoaiSanPham> getLSP(){
        try {
            return  lsprepo.getLSP();
        } catch (Exception e) {
            
        }
        return null;
    }

    @Override
    public void add(LoaiSanPham list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
