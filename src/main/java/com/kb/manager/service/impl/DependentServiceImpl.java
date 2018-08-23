package com.kb.manager.service.impl;



import com.kb.manager.dao.DependentDAO;
import com.kb.manager.entity.Cities;
import com.kb.manager.entity.Dependent;
import com.kb.manager.service.DependentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DependentServiceImpl implements DependentService {

    @Autowired
    private DependentDAO dependentDAO;

    @Override
    public void save(Dependent dependent) {
        dependentDAO.save(dependent);
    }


    @Override
    public Dependent findOne(int id) {
        return dependentDAO.findOne(id);
    }

    @Override
    public void save(String firstName, String middleName, String lastName, String address, String city, String state, int zip, String email, int phoneNumber) {
        Dependent dependents = new Dependent(firstName, middleName, lastName, address,city,state,zip, email, phoneNumber);
    }

    @Override
    public void delete(int id) {
        dependentDAO.delete(id);
    }

    @Override
    public void delete(Dependent dependent) {
        dependentDAO.delete(dependent);
    }

    @Override
    public Dependent deleteById(int id) {
        return dependentDAO.deleteById(id);
    }

    @Override
    public List<Dependent> findAll() {
        return dependentDAO.findAll();
    }

    @Override
    public Dependent findById(int id) {
        return dependentDAO.findById(id);
    }



}
