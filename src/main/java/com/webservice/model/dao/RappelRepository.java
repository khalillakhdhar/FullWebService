package com.webservice.model.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.model.entities.Rappel;
import java.util.List;


public interface RappelRepository extends JpaRepository<Rappel, Long> {
List<Rappel>  findByDescriptionContaining(String description);

}
