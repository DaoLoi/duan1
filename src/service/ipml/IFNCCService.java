/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.ipml;

import java.util.List;
import model.NhaCungCap;

/**
 *
 * @author LOIDEPTRAI
 */
public interface IFNCCService {

    List<NhaCungCap> getAll();

    boolean insert(NhaCungCap ncc);

    boolean update(NhaCungCap ncc);

    boolean delete(String id);
}
