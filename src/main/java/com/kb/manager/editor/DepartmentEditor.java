package com.kb.manager.editor;

import com.kb.manager.entity.Department;
import com.kb.manager.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.beans.PropertyEditorSupport;

@Component
public class DepartmentEditor extends PropertyEditorSupport {
    @Autowired
    private DepartmentService departmentService;

    @Override
    public void setAsText(String idDepartment) throws IllegalArgumentException {
        Department department = departmentService.findOne(Integer.parseInt(idDepartment));
        setValue(department);
    }


}

