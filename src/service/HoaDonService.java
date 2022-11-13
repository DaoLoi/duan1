/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.HoaDon;
import repository.HoaDonRepository;
import service.ipml.IFHoaDon;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class HoaDonService implements IFHoaDon{

    private final HoaDonRepository hoaDonRepo;
    
    public HoaDonService(){
        this.hoaDonRepo = new HoaDonRepository();
    }
            
    @Override
    public List<HoaDon> getList() {
    try {
            return hoaDonRepo.getList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean add(HoaDon hoaDon) {
    return hoaDonRepo.add(hoaDon);
    }

    @Override
    public boolean update(HoaDon hoaDon, String idHD) {
    return hoaDonRepo.update(hoaDon, idHD);
    }

    @Override
    public boolean delete(String idHD) {
    return hoaDonRepo.delete(idHD);
    }
    
}
