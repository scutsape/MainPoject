package com.kb.manager.service.impl;

import com.kb.manager.dao.CategoriesDAO;
import com.kb.manager.entity.Categories;
import com.kb.manager.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoriesServiceImpl implements CategoriesService {
    @Autowired
    private CategoriesDAO categoriesDAO;


    @Override
    public Categories findOne(int id) {
        return categoriesDAO.findOne(id);
    }

    @Override
    public List<Categories> findAll() {
        return categoriesDAO.findAll();
    }

    @Override
    public Categories findById(int id) {
        return categoriesDAO.findById(id);
    }

    @Override
    public void save(Categories categories) {
        categoriesDAO.save(categories);
    }

    @Override
    public void save(String categorie) {
        Categories categories = new Categories(categorie);
        categoriesDAO.save(categories);
    }

    @Override
    public void delete(int id) {
        categoriesDAO.delete(id);
    }

    @Override
    public void delete(Categories categories) {
        categoriesDAO.delete(categories);
    }

    @Override
    public Categories deleteById(int id) {
        return categoriesDAO.deleteById(id);
    }
}
