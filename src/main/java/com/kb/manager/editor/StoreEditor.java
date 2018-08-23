package com.kb.manager.editor;

import com.kb.manager.entity.Store;
import com.kb.manager.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

@Component
public class StoreEditor extends PropertyEditorSupport {
    @Autowired
    private StoreService storesService;

    @Override
    public void setAsText(String idStore) throws IllegalArgumentException {
        Store store = storesService.findOne(Integer.parseInt(idStore));
        setValue(store);
    }
}
