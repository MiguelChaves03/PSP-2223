package com.openwebinars.rest.REST_5.modelo;

import lombok.*;
import javax.persistence.*;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Categoria {
	
	@Id @GeneratedValue
	private Long id;
	
	private String nombre;
	
}