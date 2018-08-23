package com.kb.manager.service;



import com.kb.manager.entity.Cities;
import com.kb.manager.entity.Dependent;

import java.util.List;

public interface DependentService {
    void save(Dependent dependent);
    Dependent findOne(int id);
    void save(String firstName, String middleName, String lastName, String address, String city, String state, int zip, String email, int phoneNumber);
    void delete(int id);
    void delete(Dependent dependent);
    Dependent deleteById(int id);
    Dependent findById(int id);
    List<Dependent> findAll();



}
