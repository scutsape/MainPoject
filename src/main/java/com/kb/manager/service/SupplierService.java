package com.kb.manager.service;

import com.kb.manager.entity.Supplier;

import java.util.List;

public interface SupplierService {
    Supplier deleteById(int id);
    Supplier findById(int id);
    void save(Supplier supplier);
    Supplier findOne(int id);
    void save(String companyName, String contactName, String contactTitle, String address, String city, String state, int zip, String email, int phoneNumber, int faxNumber, String homePage);
    void delete(int id);
    void delete(Supplier supplier);
    List<Supplier> findAll();


}
