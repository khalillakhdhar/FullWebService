package com.webservice.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.model.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
