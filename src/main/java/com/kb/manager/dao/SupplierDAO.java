package com.kb.manager.dao;

import com.kb.manager.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SupplierDAO extends JpaRepository<Supplier,Integer> {

    Supplier deleteById(int id);
    Supplier findById(int id);

}

