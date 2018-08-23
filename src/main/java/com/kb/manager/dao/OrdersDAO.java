package com.kb.manager.dao;


import com.kb.manager.entity.Orders;
import com.kb.manager.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrdersDAO extends JpaRepository <Orders,Integer>{

    @Query("from Orders w join fetch w.customer join fetch w.employee join fetch w.products join fetch w.services ")
    public List<Orders> findAllWithCustEmpCit();

    @Query("from Orders w join fetch w.customer join fetch w.employee join fetch w.products join fetch w.services  where w.id=:id")
    Orders findByIdWithCustEmpProdServ(@Param("id") int id);

    Orders deleteById(int id);
    Orders findById(int id);

}
