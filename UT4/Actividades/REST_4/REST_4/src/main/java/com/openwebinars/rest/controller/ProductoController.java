package com.openwebinars.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.openwebinars.rest.modelo.Producto;
import com.openwebinars.rest.modelo.ProductoRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProductoController {

	private final ProductoRepository productoRepository;
	
	public ResponseEntity <?> obtenerTodos () {
		
		List <Producto> result = productoRepository.findAll ();
		
		
		if (result.isEmpty ()) {
			
			return ResponseEntity.notFound ().build ();
			
		} else {
			
			return ResponseEntity.ok (result);
			
		}
		
	}
	
	public ResponseEntity <?> obtenerUno (@PathVariable Long id) {
		
		Producto result = productoRepository.findById (id).orElse (null);
		
		if (result == null) {
			
			return ResponseEntity.notFound ().build ();
			
		} else {
			
			return ResponseEntity.ok (result);
			
		}
		
	}
	
	public ResponseEntity <Producto> nuevoProducto (@RequestBody Producto nuevo) {
		
		Producto saved = productoRepository.save (nuevo);
		
		return ResponseEntity.status (HttpStatus.CREATED).body (saved);
		
	}
	
	public ResponseEntity <?> editarProducto (@RequestBody Producto editar, @PathVariable Long id) {
		
		return productoRepository.findById (id).map(
				
				p -> {
					
					p.setNombre (editar.getNombre ());
					
					p.setPrecio (editar.getPrecio ());
					
					return ResponseEntity.ok (productoRepository.save (p));
					
				})
				
		.orElseGet (() -> {
			
			return ResponseEntity.notFound ().build ();
			
		});
		
	}
	
	public ResponseEntity <?> borrarProducto (@PathVariable Long id) {
		
		if (productoRepository.existsById (id)) {
			
			productoRepository.deleteById (id);
			
			return ResponseEntity.noContent ().build ();
			
		} else {
			
			return ResponseEntity.notFound ().build ();
			
		}
		
	}
	
}
