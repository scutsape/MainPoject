package com.kb.manager.dao;

import com.kb.manager.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentDAO extends JpaRepository <Department,Integer> {

    Department deleteById(int id);
    Department findById(int id);




}
