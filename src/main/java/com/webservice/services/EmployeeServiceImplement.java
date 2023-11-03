package com.webservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.model.dao.EmployeeRepository;
import com.webservice.model.entities.Employee;

@Service
public class EmployeeServiceImplement implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee findOneEmployee(long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).orElse(null);
	}

	@Override
	public Employee addOneEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public void DeleteOneEmployee(long id) {
		// TODO Auto-generated method stub
		if(employeeRepository.findById(id)!=null)
		employeeRepository.deleteById(id);
		
		
	}

	@Override
	public Employee updateEmployee(long id, Employee employee) {
		// TODO Auto-generated method stub
		if(employeeRepository.findById(id)!=null)
		{
			employee.setId(id);

		return employeeRepository.save(employee);
		}
		else return null;
	}

}
