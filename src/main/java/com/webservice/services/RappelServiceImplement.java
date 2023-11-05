package com.webservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.webservice.model.dao.RappelRepository;
import com.webservice.model.entities.Rappel;

@Service
public class RappelServiceImplement implements RappelService {

	@Autowired // meilleur pratique pour injection des interfaces
	private RappelRepository rappelRepository;
	
	@Override
	public Rappel CreateOneRappel(Rappel rappel) {
		// TODO Auto-generated method stub
		return rappelRepository.save(rappel);
	}

	
	

	@Override
	public Rappel getOneRappel(long id) {
		// TODO Auto-generated method stub
		return rappelRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteRappel(long id) {
		// TODO Auto-generated method stub
		rappelRepository.deleteById(id);
	}


	@Override
	public Page<Rappel> getRappel(Pageable pageable) {
		// TODO Auto-generated method stub
		
			return rappelRepository.findAll(pageable);
			
	}
	public List<Rappel> findByDescription(String description)
	{
		return rappelRepository.findByDescriptionContaining(description);
	}

}
