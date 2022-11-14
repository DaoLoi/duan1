/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.ipml;

import model.GioHangChiTiet;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface IFGioHangChiTiet {

    List<GioHangChiTiet> getList();

    public boolean add(GioHangChiTiet chiTiet);

    public boolean update(GioHangChiTiet chiTiet, String idGHCT);

    public boolean delete(String idGHCT);
    
    List<GioHangChiTiet> timKiem(String timChuoi, int so);
}
