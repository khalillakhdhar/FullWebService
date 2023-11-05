package com.webservice.services;

import org.springframework.data.domain.Page;

import com.webservice.model.entities.Rappel;

public interface RappelService {
public Rappel CreateOneRappel(Rappel rappel);
public Page<Rappel> getRappel(String description,int page,int size,String sort );
public Rappel getOneRappel(long id);
public void deleteRappel(long id);
}
