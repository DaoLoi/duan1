/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.ipml;

import model.GioHang;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IFGioHang {
    
    List<GioHang> getList();
    
    public boolean add(GioHang gioHang);

    public boolean update(GioHang gioHang, String idGH);

    public boolean delete(String idGH);
    
}
