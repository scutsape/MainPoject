package com.kb.manager.editor;

import com.kb.manager.entity.Dependent;

import com.kb.manager.service.DependentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

@Component
public class DependentEditor extends PropertyEditorSupport {

    @Autowired
    private DependentService dependentService;

    @Override
    public void setAsText(String idDependen) throws IllegalArgumentException {
        Dependent dependent = dependentService.findOne(Integer.parseInt(idDependen));
        setValue(dependent);
    }
}

