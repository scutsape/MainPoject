package com.kb.manager.service;

import com.kb.manager.entity.Cities;
import com.kb.manager.entity.Store;

import java.util.List;

public interface StoreService {

    void save(Store store);
    void save(String name, String address, String city, String state, int zip, int phone, int fax, String email);
    void delete(int id);
    void delete(Store store);
    Store deleteById(int id);
    List<Store> findAll();
    Store findOne(int i);
    Store findById(int id);

}
