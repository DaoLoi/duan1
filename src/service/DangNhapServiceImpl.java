/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import viewModel.DangNhap;
import repository.DangNhapRepo;
import service.ipml.IFDangNhapService;

/**
 *
 * @author PC
 */
public class DangNhapServiceImpl implements IFDangNhapService{
    List<DangNhap> dns = new ArrayList<>();
    @Override
    public List<DangNhap> getAll() {
        dns = new DangNhapRepo().getAll();
        return dns;
    }
    
}
