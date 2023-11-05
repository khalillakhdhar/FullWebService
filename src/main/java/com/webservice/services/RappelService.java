package com.webservice.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.webservice.model.entities.Rappel;

public interface RappelService {
public Rappel CreateOneRappel(Rappel rappel);
public Page<Rappel> getRappel(Pageable pageable) ;
public Rappel getOneRappel(long id);
public void deleteRappel(long id);
}
