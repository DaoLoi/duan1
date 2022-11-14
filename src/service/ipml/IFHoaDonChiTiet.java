/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.ipml;

import model.HoaDonChiTiet;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface IFHoaDonChiTiet {

    List<HoaDonChiTiet> getList();

    public boolean add(HoaDonChiTiet chiTiet);

    public boolean update(HoaDonChiTiet chiTiet, String idHDCT);

    public boolean delete(String idHDCT);
}
