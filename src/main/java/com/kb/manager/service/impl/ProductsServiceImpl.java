package com.kb.manager.service.impl;

import com.kb.manager.dao.ProductsDAO;
import com.kb.manager.entity.Categories;
import com.kb.manager.entity.Products;
import com.kb.manager.entity.Supplier;
import com.kb.manager.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductsServiceImpl implements ProductsService {
    @Autowired
    private ProductsDAO productsDAO;

    @Override
    public Products deleteById(int id) {
        return productsDAO.deleteById(id);
    }

    @Override
    public Products findById(int id) {
        return productsDAO.findById(id);
    }

    @Override
    public List<Products> findAllWithCategSuppl() {
        return productsDAO.findAllWithCategSuppl();
    }

    @Override
    public Products findByIdWithCategSuppl(int id) {
        return productsDAO.findByIdWithCategSuppl(id);
    }

    @Override
    public void save(Products products) {
        productsDAO.save(products);
    }

    @Override
    public Products findOne(int id) {
        return productsDAO.findOne(id);
    }

    @Override
    public void save(String brand,String productModel, String productDescription, String serialNumber, double unitPrice, Categories categories, Supplier supplier) {
        Products products = new Products(brand,productModel, productDescription, serialNumber, unitPrice, categories, supplier);
        productsDAO.save(products);
    }

    @Override
    public void delete(int id) {
        productsDAO.delete(id);
    }

    @Override
    public void delete(Products products) {
        productsDAO.delete(products);
    }

    @Override
    public List<Products> findAll() {
        return productsDAO.findAll();
    }
}
