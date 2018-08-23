package com.kb.manager.service;

import com.kb.manager.entity.Department;
import com.kb.manager.entity.Store;

import java.util.List;

public interface DepartmentService {
    List<Department> findAll();
    Department findOne(int i);
    void save(Department department);
    void save(String name, String position);
    void delete(int id);
    void delete(Department department);
    Department deleteById(int id);
    Department findById(int id);

}
