package com.webservice.model.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Entity
@Data
public class Conge {
/**
	 * 
	 */
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(nullable = false)
private String type,raison;
private String debut;
@Min(value = 1,message = "la durée doit être >1")
private int duree;
@ManyToOne(fetch = FetchType.LAZY,optional = false)
@JsonIgnoreProperties({"applications","hibernateLazyInitializer"})
private Employee employee;
}
