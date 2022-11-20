/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.ipml;

import java.util.List;
import model.Size;

/**
 *
 * @author Dell
 */
public interface IFSize {
    List<Size> getAll();
    boolean add(Size sz);
    boolean update(Size sz, String idSize);
    boolean delete(String idSize);
}
