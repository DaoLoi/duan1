/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository.ipml;

import java.util.List;
import model.SanPham;

/**
 *
 * @author Dell
 */
public interface IFSanPham {

    public List<SanPham> getList();

    public boolean add(SanPham sp);

    public boolean update(SanPham sp, int idSP);

    public boolean delete(int idSP);

}
