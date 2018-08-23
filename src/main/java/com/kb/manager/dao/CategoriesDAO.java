package com.kb.manager.dao;

import com.kb.manager.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesDAO extends JpaRepository<Categories,Integer>{
    Categories findById(int id);
    Categories deleteById(int id);
}
