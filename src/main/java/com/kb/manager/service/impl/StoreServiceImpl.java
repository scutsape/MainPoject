package com.kb.manager.service.impl;

import com.kb.manager.dao.StoreDAO;
import com.kb.manager.entity.Store;
import com.kb.manager.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreDAO storeDAO;



    @Override
    public void save(Store store) {
        storeDAO.save(store);
    }

    @Override
    public void save(String name, String address, String city, String state, int zip, int phone, int fax, String email) {
        Store store = new Store(name,address,city,state,zip,phone,fax,email);
        storeDAO.save(store);
    }


    @Override
    public void delete(int id) {
        storeDAO.delete(id);
    }

    @Override
    public void delete(Store store) {
        storeDAO.delete(store);
    }

    @Override
    public Store deleteById(int id) {
        return storeDAO.deleteById(id);
    }

    @Override
    public List<Store> findAll() {
        return storeDAO.findAll();
    }

    @Override
    public Store findOne(int i) {
        return storeDAO.findOne(i);
    }

    @Override
    public Store findById(int id) {
        return storeDAO.findById(id);
    }


}
