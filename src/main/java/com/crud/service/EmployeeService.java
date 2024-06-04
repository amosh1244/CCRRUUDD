package com.crud.service;


import com.crud.entity.Employee;
import com.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeServiceImpl{

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Employee create(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }

    @Override
    public List<Employee> read() {
        List<Employee> allEmployee = employeeRepository.findAll();
        return allEmployee;
    }

    @Override
    public Employee getById(Long id) {
        Optional<Employee> employeeById = employeeRepository.findById(id);
        return employeeById.get();
    }

    @Override
    public void deleteById(Long id) {
         employeeRepository.deleteById(id);
    }

    @Override
    public Employee update(Employee employee) {
        Employee update = employeeRepository.save(employee);
        return update;
    }


}
