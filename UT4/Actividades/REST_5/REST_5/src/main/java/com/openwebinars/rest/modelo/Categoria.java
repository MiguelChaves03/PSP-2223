package com.openwebinars.rest.modelo;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Categoria {
	
	@Id @GeneratedValue
	private Long id;
	
	private String nombre;
	
}