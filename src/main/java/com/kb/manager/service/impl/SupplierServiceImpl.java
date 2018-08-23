package com.kb.manager.service.impl;

import com.kb.manager.dao.SupplierDAO;
import com.kb.manager.entity.Cities;
import com.kb.manager.entity.Supplier;
import com.kb.manager.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierDAO supplierDAO;

    @Override
    public Supplier deleteById(int id) {
        return supplierDAO.deleteById(id);
    }

    @Override
    public Supplier findById(int id) {
        return supplierDAO.findById(id);
    }

    @Override
    public void save(Supplier supplier) {
        supplierDAO.save(supplier);
    }

    @Override
    public Supplier findOne(int id) {
        return supplierDAO.findOne(id);
    }

    @Override
    public void save(String companyName, String contactName, String contactTitle, String address, String city, String state, int zip, String email, int phoneNumber, int faxNumber, String homePage) {
        Supplier supplier = new Supplier(companyName, contactName, contactTitle, address,city,state,zip, email, phoneNumber, faxNumber, homePage);
        supplierDAO.save(supplier);
    }

    @Override
    public void delete(int id) {
        supplierDAO.delete(id);
    }

    @Override
    public void delete(Supplier supplier) {
        supplierDAO.delete(supplier);
    }

    @Override
    public List<Supplier> findAll() {
        return supplierDAO.findAll();
    }
}
