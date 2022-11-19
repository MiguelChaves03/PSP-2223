package com.openwebinars.rest.REST_5.dto;

import lombok.*;

@Getter @Setter
public class CreateProductoDTO {
	
	private String nombre;
	private float precio;
	private long categoriaID;

}
