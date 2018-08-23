package com.kb.manager.editor;


import com.kb.manager.entity.Products;
import com.kb.manager.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.beans.PropertyEditorSupport;

@Component
public class ProductsEditor extends PropertyEditorSupport{
    @Autowired
    private ProductsService productsService;
    @Override
    public void setAsText(String idProducts) throws IllegalArgumentException {
        Products products = productsService.findOne(Integer.parseInt(idProducts));
        setValue(products);
    }
}
