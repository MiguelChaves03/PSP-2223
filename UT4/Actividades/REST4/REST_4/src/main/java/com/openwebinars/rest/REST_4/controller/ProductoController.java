package com.openwebinars.rest.REST_4.controller;

import org.springframework.web.bind.annotation.*;
import lombok.*;
import com.openwebinars.rest.REST_4.modelo.*;
import org.springframework.http.*;
import java.util.*;

@RestController
@RequiredArgsConstructor
public class ProductoController {

	private final ProductoRepository productoRepository;
				
	/**
	 * Obtener todos los productos
	 * 
	 * @return
	 */
	@GetMapping ("/producto")
	public ResponseEntity <?> obtenerTodos () {
		
		List <Producto> result = productoRepository.findAll ();
		
		if (result.isEmpty ()) {
			
			return ResponseEntity.notFound ().build ();
			
		} else {
			
			return ResponseEntity.ok (result);
			
		}
		
	}
	
	/**
	 * Obtener un producto dado su id
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping ("/producto/{id}")
	public ResponseEntity <?> obtenerUno (@PathVariable Long id) {
		
		Producto result = productoRepository.findById (id).orElse (null);
		
		if (result == null) {
			
			return ResponseEntity.notFound ().build ();
			
		} else {
			
			return ResponseEntity.ok (result);
			
		}
		
	}
	
	/**
	 * Insertar un producto
	 * 
	 * @param nuevo
	 * @return
	 */
	@PostMapping ("/producto")
	public ResponseEntity <Producto> nuevoProducto (@RequestBody Producto nuevo) {
		
		Producto saved = productoRepository.save (nuevo);
		
		return ResponseEntity.status (HttpStatus.CREATED).body (saved);
				
	}
	
	/**
	 * Editar un producto dado su id
	 * 
	 * @param editar
	 * @param id
	 * @return
	 */
	@PutMapping ("/producto/{id}")
	public ResponseEntity <?> editarProducto (@RequestBody Producto editar, @PathVariable Long id) {
		
		return productoRepository.findById (id)
				
			.map (p -> {
					
				p.setNombre (editar.getNombre ());
					
				p.setPrecio (editar.getPrecio ());
					
				return ResponseEntity.ok (productoRepository.save (p));
					
				})
				
			.orElseGet (() -> {
					
				return ResponseEntity.notFound ().build ();
			
		});
		
	}
	
	/**
	 * Eliminar un producto dado su id
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping ("/producto/{id}")
	public ResponseEntity <?> borrarProducto (@PathVariable Long id) {
		
		if (productoRepository.existsById (id)) {
			
			productoRepository.deleteById (id);
			
			return ResponseEntity.noContent ().build ();
			
		} else {
			
			return ResponseEntity.notFound ().build ();
			
		}
		
	}
	
}
