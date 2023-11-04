package com.webservice.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.model.entities.Conge;
import com.webservice.model.entities.Employee;

public interface CongeRepository extends JpaRepository<Conge, Long> {
List<Conge> findByEmployee(Employee employee);
}
