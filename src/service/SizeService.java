/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.Size;
import repository.SizeRepo;
import service.ipml.IFSize;

/**
 *
 * @author Dell
 */
public class SizeService implements IFSize {

    private final SizeRepo SizeRepo;

    public SizeService() {
        this.SizeRepo = new SizeRepo();
    }

    @Override
    public List<Size> getAll() {
        try {
            return SizeRepo.getAll();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean add(Size sz) {
        return SizeRepo.add(sz);
    }

    @Override
    public boolean update(Size sz, String idSize) {
        return SizeRepo.update(sz, idSize);
    }

    @Override
    public boolean delete(String idSize) {
        return SizeRepo.delete(idSize);
    }

}
