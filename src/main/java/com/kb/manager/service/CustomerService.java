package com.kb.manager.service;

import com.kb.manager.entity.*;

import java.util.List;

public interface CustomerService {
    void save(Customer customer);
    Customer findOne(int id);
    void save(String type, String firstName, String middleName, String lastName, String address, String city, String state, int zip, String email, int phoneNumber, int creditRating, String startDate);
    Customer findById(int id);
    void delete(int id);
    void delete(Customer customer);
    Customer deleteById(int id);
    List<Customer> findAll();

}
