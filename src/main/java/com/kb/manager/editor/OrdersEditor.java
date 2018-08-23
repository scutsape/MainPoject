package com.kb.manager.editor;


import com.kb.manager.entity.Orders;
import com.kb.manager.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

@Component
public class OrdersEditor extends PropertyEditorSupport {
    @Autowired
    private OrdersService ordersService;
    @Override
    public void setAsText(String idOrders) throws IllegalArgumentException {
        Orders orders = ordersService.findOne(Integer.parseInt(idOrders));
        setValue(orders);
    }

}
