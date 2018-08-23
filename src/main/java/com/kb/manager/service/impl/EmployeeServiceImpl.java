package com.kb.manager.service.impl;

import com.kb.manager.dao.EmployeeDAO;
import com.kb.manager.entity.*;
import com.kb.manager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService, UserDetailsService {
    @Autowired
    private EmployeeDAO employeeDAO;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void save(Employee employee) {
        employee.setPassword(passwordEncoder.encode(employee.getPassword()));
        employeeDAO.save(employee);
    }


    public Employee findByName(String username) {
        return employeeDAO.findByUserName(username);
    }

    public Employee findOne(int id) {
        return employeeDAO.findOne(id);
    }

    @Override
    public void save(String username, String firstName, String middleName, String lastName, String birthDate, String maritalStatus, String gender, int ssn, String address, String city, String state, int zip, String email, int phoneNumber, String startDay, String password, Store store, Department department, Dependent dependent) {
        Employee employee = new Employee(username, firstName,middleName, lastName,birthDate,maritalStatus,gender,ssn,address,city,state,zip, email, phoneNumber,startDay, password,store,department,dependent);
        employee.setPassword(passwordEncoder.encode(employee.getPassword()));
        employeeDAO.save(employee);
    }


    @Override
    public void delete(int id) {
        employeeDAO.delete(id);
    }

    @Override
    public void delete(Employee employee) {
        employeeDAO.delete(employee);
    }

    @Override
    public Employee deleteById(int id) {
        return employeeDAO.deleteById(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeDAO.findById(id);
    }

    @Override
    public List<Employee> findAllWithAll() {
        return employeeDAO.findAllWithAll();
    }

    @Override
    public Employee findByIdWithStores(int id) {
        return employeeDAO.findByIdWithStores(id);
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return findByName(username);
    }
}
