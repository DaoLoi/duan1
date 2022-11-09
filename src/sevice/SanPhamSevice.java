/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sevice;

import java.util.List;
import model.SanPham;

/**
 *
 * @author LOIDEPTRAI
 */
public interface SanPhamSevice {

    List<SanPham> getAll();

    boolean insert(SanPham sp);

    boolean update(SanPham sp);

    boolean delete(String idsp);
}
