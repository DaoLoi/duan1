/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.ipml;

import model.HoaDon;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IFHoaDon {
    
    List<HoaDon> getList();
    
    public boolean add(HoaDon hoaDon);
    
    public boolean update(HoaDon hoaDon, String idHD);
    
    public boolean delete(String idHD);
}
