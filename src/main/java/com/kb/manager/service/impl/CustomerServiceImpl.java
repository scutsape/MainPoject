package com.kb.manager.service.impl;

import com.kb.manager.dao.CustomerDAO;
import com.kb.manager.entity.Customer;
import com.kb.manager.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDAO customerDAO;


    @Override
    public void save(Customer customer) {
        customerDAO.save(customer);
    }

    @Override
    public Customer findOne(int id) {
        return customerDAO.findOne(id);
    }

    @Override
    public void save(String type, String firstName, String middleName, String lastName, String address, String city, String state, int zip, String email, int phoneNumber, int creditRating, String startDate) {
        Customer customer = new Customer(type, firstName, middleName, lastName, address,city,state,zip, email, phoneNumber, creditRating, startDate);
        customerDAO.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return customerDAO.findById(id);
    }

    @Override
    public void delete(int id) {
        customerDAO.delete(id);
    }

    @Override
    public void delete(Customer customer) {
        customerDAO.delete(customer);
    }

    @Override
    public Customer deleteById(int id) {
        return customerDAO.deleteById(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerDAO.findAll();
    }


}
