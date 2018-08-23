package com.kb.manager.dao;

import com.kb.manager.entity.Dependent;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DependentDAO extends JpaRepository<Dependent,Integer> {

    Dependent deleteById(int id);
    Dependent findById(int id);
}
