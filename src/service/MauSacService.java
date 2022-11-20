/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.MauSac;
import repository.MauSacRepo;
import service.ipml.IFMauSac;

/**
 *
 * @author Dell
 */
public class MauSacService implements IFMauSac {

    private MauSacRepo mauSacRepo;

    public MauSacService() {
        mauSacRepo = new MauSacRepo();
    }

    @Override
    public List<MauSac> getAll() {
        try {
            return mauSacRepo.getAll();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean add(MauSac mauSac) {
        return mauSacRepo.add(mauSac);
    }

    @Override
    public boolean update(MauSac mauSac, String idMau) {
        return mauSacRepo.update(mauSac, idMau);
    }

    @Override
    public boolean delete(String idMau) {
        return mauSacRepo.delete(idMau);
    }
}
