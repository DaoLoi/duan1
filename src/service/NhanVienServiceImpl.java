/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.NhanVien;
import repository.NhanVienRepo;
import service.ipml.IFNhanVienService;


/**
 *
 * @author PC
 */
public class NhanVienServiceImpl implements IFNhanVienService{
    NhanVienRepo repository = new NhanVienRepo();
    
    @Override
    public List<NhanVien> getAll() {
        return repository.getAll();
    }

    @Override
    public boolean them(NhanVien nv) {
        try {
            repository.add(nv);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean sua(NhanVien nv, String idNV) {
        try {
            repository.update(nv, idNV);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean xoa(String ma) {
        try {
            repository.delete(ma);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
