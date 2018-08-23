package com.kb.manager.service;

import com.kb.manager.entity.Categories;
import com.kb.manager.entity.Cities;
import com.kb.manager.entity.Department;

import java.util.List;

public interface CategoriesService {
    Categories findOne(int id);
    List<Categories> findAll();
    Categories findById(int id);
    void save(Categories categories);
    void save(String categorie);
    void delete(int id);
    void delete(Categories categories);
    Categories deleteById(int id);

}
