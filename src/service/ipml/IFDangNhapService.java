/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.ipml;

import java.util.List;
import viewModel.DangNhap;

/**
 *
 * @author PC
 */
public interface IFDangNhapService {
    List<DangNhap> kiemTraDN(String tenDN, String MK);
    
}
