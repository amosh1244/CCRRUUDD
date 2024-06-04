package com.crud.service;

import com.crud.entity.Employee;
import org.springframework.stereotype.Service;
import java.util.List;

public interface EmployeeServiceImpl {

    public Employee create(Employee employee);

    public List<Employee> read();

    public Employee getById(Long id);

    public void deleteById(Long id);

    public Employee update(Employee employee);



}
