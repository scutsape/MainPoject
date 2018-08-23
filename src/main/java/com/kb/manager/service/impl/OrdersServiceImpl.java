package com.kb.manager.service.impl;

import com.kb.manager.dao.OrdersDAO;
import com.kb.manager.entity.*;
import com.kb.manager.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersDAO ordersDAO;

    @Override
    public List<Orders> findAllWithCustEmpCit() {
        return ordersDAO.findAllWithCustEmpCit();
    }

    @Override
    public Orders findByIdWithCustEmpProdServ(int id) {
        return ordersDAO.findByIdWithCustEmpProdServ(id);
    }

    @Override
    public Orders deleteById(int id) {
        return ordersDAO.deleteById(id);
    }

    @Override
    public Orders findById(int id) {
        return ordersDAO.findById(id);
    }

    @Override
    public void save(Orders orders) {
        ordersDAO.save(orders);
    }

    @Override
    public Orders findOne(int id) {
        return ordersDAO.findOne(id);
    }

    @Override
    public void save(String orderDate, int orderNumber, String shipName, String address, String city, String state, int zip, String shipDate, int shipPhoneNumber, double unitPrice, int quantity, int discount, int saleTax, double lineTotal, Products products, Services services, Customer customer, Employee employee) {
        Orders orders = new Orders(orderDate, orderNumber,shipName,address,city,state,zip,shipDate,shipPhoneNumber,unitPrice,quantity,discount,saleTax,lineTotal,products,services,customer,employee);
        ordersDAO.save(orders);
    }

    @Override
    public void delete(int id) {
        ordersDAO.delete(id);
    }

    @Override
    public void delete(Orders orders) {
        ordersDAO.delete(orders);
    }

    @Override
    public List<Orders> findAll() {
        return ordersDAO.findAll();
    }
}
