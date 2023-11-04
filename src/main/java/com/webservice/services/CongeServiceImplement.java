package com.webservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.model.dao.CongeRepository;
import com.webservice.model.entities.Conge;

@Service
public class CongeServiceImplement implements CongeService {

	@Autowired
	CongeRepository congeRepository;
	
	
	@Override
	public List<Conge> findAllConges() {
		// TODO Auto-generated method stub
		return congeRepository.findAll();
	}

	@Override
	public Conge findOneConge(long id) {
		// TODO Auto-generated method stub
		return congeRepository.findById(id).orElse(null);
	}

	@Override
	public Conge addOneConge(Conge conge) {
		// TODO Auto-generated method stub
		return congeRepository.save(conge);
	}

	@Override
	public void DeleteOneConge(long id) {
		// TODO Auto-generated method stub
		congeRepository.deleteById(id);
	}

}
