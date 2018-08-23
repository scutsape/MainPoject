package com.kb.manager.editor;

import com.kb.manager.entity.Customer;

import com.kb.manager.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.beans.PropertyEditorSupport;

@Component
public class CustomerEditor extends PropertyEditorSupport {
    @Autowired
    private CustomerService customerService;
    @Override
    public void setAsText(String idCustomer) throws IllegalArgumentException {
       Customer customer = customerService.findOne(Integer.parseInt(idCustomer));
        setValue(customer);
    }
}
