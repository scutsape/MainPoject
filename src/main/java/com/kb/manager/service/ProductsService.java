package com.kb.manager.service;

import com.kb.manager.entity.Categories;
import com.kb.manager.entity.Products;
import com.kb.manager.entity.Supplier;

import java.util.List;

public interface ProductsService {
    Products deleteById(int id);

    Products findById(int id);

    List<Products> findAllWithCategSuppl();

    Products findByIdWithCategSuppl(int id);

    void save(Products products);

    Products findOne(int id);

    void save(String brand, String productModel, String productDescription, String serialNumber, double unitPrice, Categories categories, Supplier supplier);

    void delete(int id);

    void delete(Products products);

    List<Products> findAll();
}
