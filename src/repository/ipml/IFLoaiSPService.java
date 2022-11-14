/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository.ipml;

import model.LoaiSanPham;
import java.util.List;

/**
 *
 * @author VU TUAN
 */
public interface IFLoaiSPService {

    List<LoaiSanPham> getLSP();

    public void add(LoaiSanPham list);

}
