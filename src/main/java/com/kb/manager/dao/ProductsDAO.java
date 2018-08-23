package com.kb.manager.dao;

import com.kb.manager.entity.Products;
import com.kb.manager.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductsDAO extends JpaRepository<Products,Integer> {

    @Query("from Products w  join fetch w.categories join fetch w.supplier")
    public List<Products> findAllWithCategSuppl();

    @Query("from Products w join fetch w.categories join fetch w.supplier where w.id=:id")
    Products findByIdWithCategSuppl(@Param("id") int id);

    Products deleteById(int id);
    Products findById(int id);
}
