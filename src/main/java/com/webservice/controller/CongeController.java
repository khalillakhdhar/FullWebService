package com.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.model.entities.Conge;
import com.webservice.model.entities.Employee;
import com.webservice.services.CongeServiceImplement;
import com.webservice.services.EmployeeService;
import com.webservice.services.EmployeeServiceImplement;

import jakarta.validation.Valid;

@RestController
@RequestMapping("conge")
public class CongeController {

	@Autowired
	CongeServiceImplement congeService;
	@Autowired
	EmployeeServiceImplement employeeService;
	@GetMapping
	public List<Conge> getConges()
	{
		return congeService.findAllConges();
	}
	@GetMapping("/{id}")
	public Conge getOneConges(@PathVariable long id)
	{
		return congeService.findOneConge(id);
	}
	@PostMapping("/{employeeId}")
	public Conge addOneConge(@RequestBody @Valid Conge conge,@PathVariable long employeeId)
	{
		Employee emp=employeeService.findOneEmployee(employeeId);
		conge.setEmployee(emp);
		return congeService.addOneConge(conge);
	}
	@DeleteMapping("/{id}")
	public String deletOneConge(@PathVariable long id)
	{
		try
		{
			congeService.DeleteOneConge(id);
			return id+" deleted successfully";
		}
		catch(Exception ex)
		{
			return ex.toString()+" error during deleting ";
		}
	}
}
