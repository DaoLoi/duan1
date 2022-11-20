/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.ipml;

import java.util.List;
import model.MauSac;

/**
 *
 * @author Dell
 */
public interface IFMauSac {

    List<MauSac> getAll();

    boolean add(MauSac mauSac);

    boolean update(MauSac mauSac, String idMau);

    boolean delete(String idMau);
}
