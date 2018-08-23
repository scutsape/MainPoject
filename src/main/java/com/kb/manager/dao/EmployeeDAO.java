package com.kb.manager.dao;


import com.kb.manager.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDAO extends JpaRepository<Employee,Integer> {

    @Query("from Employee w where w.username =:username")
    public Employee findByUserName(@Param("username") String username);

    @Query("from Employee w join fetch w.store join fetch w.department join fetch w.dependent ")
    public List<Employee> findAllWithAll();

    @Query("from Employee w join fetch w.store join fetch w.department join fetch w.dependent where  w.id=:id")
    Employee findByIdWithStores(@Param("id") int id);

    Employee deleteById(int id);
    Employee findById(int id);
}
