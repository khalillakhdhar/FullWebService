package com.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.model.entities.Employee;
import com.webservice.services.EmployeeServiceImplement;

import jakarta.validation.Valid;

@RestController
@RequestMapping("user")
public class EmployeeController {
	@Autowired
public EmployeeServiceImplement employeeService;
	
	@GetMapping
	public List<Employee> getAll()
	{
		return employeeService.findAllEmployees();
	}
	@GetMapping("/{id}")
	public Employee getOne(@PathVariable long id)
	{
		return employeeService.findOneEmployee(id);
	}
	@PostMapping
	public Employee addOne(@RequestBody @Valid Employee employee)
	{
		return employeeService.addOneEmployee(employee);
	}
	@PutMapping("/{id}")
	public Employee updateEmp(@PathVariable long id,@RequestBody @Valid Employee employee)
	{
		return employeeService.updateEmployee(id, employee);
		
	}
	@DeleteMapping("/{id}")
	public void deleteOne(@PathVariable long id)
	
	{
	employeeService.DeleteOneEmployee(id);	
	}
	
}
