package com.kb.manager.editor;

import com.kb.manager.entity.Categories;
import com.kb.manager.entity.Orders;
import com.kb.manager.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

@Component
public class CategoriesEditor extends PropertyEditorSupport {
    @Autowired
    private CategoriesService categoriesService;
    @Override
    public void setAsText(String idCategories) throws IllegalArgumentException {
        Categories categories = categoriesService.findOne(Integer.parseInt(idCategories));
        setValue(categories);
    }
}
