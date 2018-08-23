package com.kb.manager.editor;

import com.kb.manager.entity.Products;
import com.kb.manager.entity.Services;
import com.kb.manager.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

@Component
public class ServicesEditor extends PropertyEditorSupport {
    @Autowired
    private ServicesService servicesService;

    @Override
    public void setAsText(String idServices) throws IllegalArgumentException {
       Services services = servicesService.findOne(Integer.parseInt(idServices));
        setValue(services);
    }
}
