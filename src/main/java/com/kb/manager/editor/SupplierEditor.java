package com.kb.manager.editor;

import com.kb.manager.entity.Dependent;
import com.kb.manager.entity.Supplier;
import com.kb.manager.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

@Component
public class SupplierEditor extends PropertyEditorSupport {
    @Autowired
    private SupplierService supplierService;

    @Override
    public void setAsText(String idSupplier) throws IllegalArgumentException {
        Supplier supplier = supplierService.findOne(Integer.parseInt(idSupplier));
        setValue(supplier);
    }
}
