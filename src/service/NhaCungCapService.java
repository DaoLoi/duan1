/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.NhaCungCap;
import repository.NCCRepository;
import repository.ipml.IFNCCRepository;
import service.ipml.IFNCCService;

/**
 *
 * @author LOIDEPTRAI
 */
public class NhaCungCapService implements IFNCCService {

    IFNCCRepository nccrp = new NCCRepository();

    @Override
    public List<NhaCungCap> getAll() {
        return nccrp.getAll();
    }

    @Override
    public boolean insert(NhaCungCap ncc) {
        return nccrp.insert(ncc);
    }

    @Override
    public boolean update(NhaCungCap ncc) {
        return nccrp.update(ncc);
    }

    @Override
    public boolean delete(String id) {
        return nccrp.delete(id);
    }

}
