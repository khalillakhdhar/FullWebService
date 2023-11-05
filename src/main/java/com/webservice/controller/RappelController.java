package com.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.model.entities.Rappel;
import com.webservice.services.RappelService;

@RestController
@RequestMapping("/rappels")
public class RappelController {
	@Autowired
  RappelService rappelService; // injection des dependences
/*
 public RappelController(RappelService rappelService) {
	super();
	this.rappelService = rappelService;
}
*/
	@PostMapping
public Rappel createRappel(@RequestBody Rappel rappel)
{
return rappelService.CreateOneRappel(rappel);	
}
	@GetMapping
public Page<Rappel> getRappels(Pageable pageable)
{
				//Pageable pageable=PageRequest.of(page, size,Sort.by(Sort.Order.desc(sort.split(",")[0])));

	return rappelService.getRappel(pageable);
}
	@GetMapping("/{id}")
public Rappel getOne(@PathVariable long id)
{
	return rappelService.getOneRappel(id);
}
	@DeleteMapping("/{id}")
public void deleteOne(@PathVariable long id)
{
rappelService.deleteRappel(id);	
}

	
	
}
