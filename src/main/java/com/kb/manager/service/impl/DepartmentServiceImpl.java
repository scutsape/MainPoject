package com.kb.manager.service.impl;

import com.kb.manager.dao.DepartmentDAO;
import com.kb.manager.entity.Department;
import com.kb.manager.entity.Store;
import com.kb.manager.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDAO departmentDAO;

    @Override
    public List<Department> findAll() {
        return departmentDAO.findAll();
    }

    @Override
    public Department findOne(int i) {
        return departmentDAO.findOne(i);
    }

    @Override
    public void save(Department department) {
        departmentDAO.save(department);
    }

    @Override
    public void save(String name, String position) {
        Department department = new Department(name, position);
        departmentDAO.save(department);
    }

    @Override
    public void delete(int id) {
        departmentDAO.delete(id);
    }

    @Override
    public void delete(Department department) {
        departmentDAO.delete(department);
    }

    @Override
    public Department deleteById(int id) {
        return departmentDAO.deleteById(id);
    }

    @Override
    public Department findById(int id) {
        return departmentDAO.findById(id);
    }

//    @Override
//    public List<Department> findAllWithStore() {
//        return departmentDAO.findAllWithStore();
//    }
//
//    @Override
//    public Department findByIdWithStore(int id) {
//        return departmentDAO.findByIdWithStore(id);
//    }

}