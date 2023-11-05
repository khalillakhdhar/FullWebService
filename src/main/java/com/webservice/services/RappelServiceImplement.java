package com.webservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.webservice.model.dao.RappelRepository;
import com.webservice.model.entities.Rappel;

public class RappelServiceImplement implements RappelService {

	@Autowired // meilleur pratique pour injection des interfaces
	private RappelRepository rappelRepository;
	
	@Override
	public Rappel CreateOneRappel(Rappel rappel) {
		// TODO Auto-generated method stub
		return rappelRepository.save(rappel);
	}

	@Override
	public Page<Rappel> getRappel(String description,int page,int size,String sort ) {
		Pageable pageable=PageRequest.of(page, size,Sort.by(Sort.Order.desc(sort.split(",")[0])));
		if(description==null)
		return rappelRepository.findAll(pageable);
		else
			return rappelRepository.findByDescriptionContaining(description);
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

}
