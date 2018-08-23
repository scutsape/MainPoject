package com.kb.manager.dao;

import com.kb.manager.entity.Customer;
import com.kb.manager.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerDAO extends JpaRepository<Customer,Integer> {


    Customer deleteById(int id);
    Customer findById(int id);

}
