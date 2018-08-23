package com.kb.manager.valid;

import com.kb.manager.entity.Employee;
import com.kb.manager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class LoginValid implements Validator {
    @Autowired
    private EmployeeService employeeService;

    public boolean supports(Class<?> aClass) {
        return aClass.equals(Employee.class);
    }

    public void validate(Object o, Errors errors) {
        Employee employee = (Employee) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
        if (employee.getUsername().length() < 6 || employee.getUsername().length() > 12) {
            errors.rejectValue("username", "","Error Username : Minimum 6 and Maximum 12 ");
        }
        if (employeeService.findByName(employee.getUsername()) != null) {
            errors.rejectValue("username", "","User is not Empty");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (employee.getPassword().length() < 4 || employee.getPassword().length() > 8) {
            errors.rejectValue("password", "","Error Password : Minimum 4 and Maximum 8");
        }


    }
}
