package com.webservice.services;

import java.util.List;

import com.webservice.model.entities.Conge;


public interface CongeService {
	public List<Conge> findAllConges();
	public Conge findOneConge(long id);
	public Conge addOneConge(Conge employee);
	public void DeleteOneConge(long id);
}
