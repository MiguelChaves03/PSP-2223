package com.openwebinars.rest.REST_5.converter;

import org.springframework.stereotype.*;
import lombok.*;
import org.modelmapper.*;
import com.openwebinars.rest.REST_5.dto.*;
import com.openwebinars.rest.REST_5.modelo.*;

@Component @RequiredArgsConstructor
public class ProductoDTOConverter {
	
	private final ModelMapper modelMapper;
	
	public ProductoDTO convertToDTO (Producto producto) {
		
		return modelMapper.map (producto,  ProductoDTO.class);
		
	}
	
	public Producto convertToProducto (CreateProductoDTO createProductoDTO) {
		
		return modelMapper.map (createProductoDTO, Producto.class);
		
	}
	
	public Producto convertToProducto (UpdateProductoDTO  updateProductoDTO) {
		
		return modelMapper.map (updateProductoDTO, Producto.class);
		
	}

}
