package com.openwebinars.rest.REST_3.modelo;

import lombok.*;
import javax.persistence.*;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Producto {
	
	@Id @GeneratedValue
	private Long id;
	
	private String nombre;
	
	private float precio;

}
