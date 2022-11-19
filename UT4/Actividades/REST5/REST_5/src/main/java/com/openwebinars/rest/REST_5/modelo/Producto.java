package com.openwebinars.rest.REST_5.modelo;

import lombok.*;
import javax.persistence.*;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Producto {
	
	@Id @GeneratedValue
	private Long id;
	
	private String nombre;
	
	private float precio;
	
	@ManyToOne
	@JoinColumn (name = "categoria_id")
	private Categoria categoria;

}