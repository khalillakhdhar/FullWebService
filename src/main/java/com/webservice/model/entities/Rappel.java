package com.webservice.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Rappel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(unique = true,nullable = false)
private String titre;
@Column(nullable = false)
private String lieu;
@Column(nullable = false,unique = true)
private String dateHeure;
private String description;
}
