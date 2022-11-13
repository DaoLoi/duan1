/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.GioHang;
import repository.GioHangRepository;
import service.ipml.IFGioHang;
import java.util.List;


/**
 *
 * @author ASUS
 */
public class GioHangService implements IFGioHang{

    private final GioHangRepository gioHangRepo;
    
    public GioHangService() {
        this.gioHangRepo = new GioHangRepository();
    }
    @Override
    public List<GioHang> getList() {
        try {
            return gioHangRepo.getList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
     }

    @Override
    public boolean add(GioHang gioHang) {
    return gioHangRepo.add(gioHang);
    }

    @Override
    public boolean update(GioHang gioHang, String idGH) {
        return gioHangRepo.update(gioHang, idGH);
    }

    @Override
    public boolean delete(String idGH) {
        return gioHangRepo.delete(idGH);
    }
    
}
