package com.webservice.services;

import java.util.List;

import com.webservice.model.entities.Employee;

public interface EmployeeService {
public List<Employee> findAllEmployees();
public Employee findOneEmployee(long id);
public Employee addOneEmployee(Employee employee);
public void DeleteOneEmployee(long id);
public Employee updateEmployee(long id,Employee employee);


}
