package com.kb.manager.service;



import com.kb.manager.entity.*;
import com.kb.manager.entity.Store;
import com.kb.manager.entity.Employee;
import java.util.List;

public interface EmployeeService {
    void save(Employee employee);
    Employee findByName(String username);
    Employee findOne(int id);
    void save(String username, String firstName, String middleName, String lastName, String birthDate, String maritalStatus, String gender, int ssn, String address, String city, String state, int zip, String email, int phoneNumber, String startDay, String password, Store store, Department department, Dependent dependent);
    void delete(int id);
    void delete(Employee employee);
    Employee deleteById(int id);
    List<Employee> findAll();
    Employee findById(int id);
    List<Employee> findAllWithAll();
    Employee findByIdWithStores(int id);



}
