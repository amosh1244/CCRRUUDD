package com.crud.controller;


import com.crud.entity.Employee;
import com.crud.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/employee")
public class EmployeeController {


    @Autowired
    private EmployeeServiceImpl employeeServiceimpl;

    @PostMapping("/create")
    public ResponseEntity<Employee> create(@RequestBody Employee employee){
        Employee savedEmployee = employeeServiceimpl.create(employee);
        return  new ResponseEntity<Employee>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/read")
    public ResponseEntity<List<Employee>> read(){
        List<Employee> allEmployee = employeeServiceimpl.read();
         return new ResponseEntity<>(allEmployee, HttpStatus.OK);

    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Employee> getById(@PathVariable("id") long id){
        Employee employeeById = employeeServiceimpl.getById(id);
        return new ResponseEntity<Employee>(employeeById, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable ("id") long id){
        employeeServiceimpl.deleteById(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> update(@RequestBody Employee employee){
        Employee update = employeeServiceimpl.update(employee);
        return  new ResponseEntity<Employee>(update, HttpStatus.CREATED);
    }


}
