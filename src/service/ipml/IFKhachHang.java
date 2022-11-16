/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.ipml;

import model.KhachHang;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IFKhachHang {
    List<KhachHang> getList();
     public boolean add(KhachHang Kh);
     public boolean update(KhachHang kh, String idKH);
     public boolean delate(String idKH);
}
