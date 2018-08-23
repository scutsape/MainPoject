package com.kb.manager.editor;

import com.kb.manager.entity.Dependent;
import com.kb.manager.entity.Employee;
import com.kb.manager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.misc.Contended;

import java.beans.PropertyEditorSupport;

@Component
public class EmployeeEditor extends PropertyEditorSupport {
    @Autowired
    private EmployeeService employeeService;

    @Override
    public void setAsText(String idEmployee) throws IllegalArgumentException {
        Employee employee = employeeService.findOne(Integer.parseInt(idEmployee));
        setValue(employee);
    }
}
