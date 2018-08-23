package com.kb.manager.service;

import com.kb.manager.entity.*;

import java.util.List;

public interface OrdersService {


    List<Orders> findAllWithCustEmpCit();
    Orders findByIdWithCustEmpProdServ(int id);
    Orders deleteById(int id);
    Orders findById(int id);
    void save(Orders orders);
    Orders findOne(int id);
    void save(String orderDate, int orderNumber, String shipName, String address, String city, String state, int zip, String shipDate, int shipPhoneNumber, double unitPrice, int quantity, int discount, int saleTax, double lineTotal, Products products, Services services, Customer customer, Employee employee);
    void delete(int id);
    void delete(Orders orders);
    List<Orders> findAll();

}
