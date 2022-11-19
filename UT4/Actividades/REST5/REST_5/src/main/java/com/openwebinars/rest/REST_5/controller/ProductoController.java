package com.openwebinars.rest.REST_5.controller;

import org.springframework.web.bind.annotation.*;
import lombok.*;
import com.openwebinars.rest.REST_5.modelo.*;
import com.openwebinars.rest.REST_5.converter.*;
import org.springframework.http.*;
import java.util.*;
import com.openwebinars.rest.REST_5.dto.*;
import java.util.stream.*;

@RestController
@RequiredArgsConstructor
public class ProductoController {

	private final ProductoRepository productoRepository;
	
	private final CategoriaRepository categoriaRepository;
				
	private final ProductoDTOConverter productoDTOConverter;
	
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
			
			List <ProductoDTO> dtoList = 
					result.stream ().map (productoDTOConverter::convertToDTO)
					.collect (Collectors.toList ());
			
			return ResponseEntity.ok (dtoList);
			
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
	public ResponseEntity <?> nuevoProducto (@RequestBody CreateProductoDTO nuevo) {
		
		Producto nuevoProducto = new Producto ();
		
		nuevoProducto.setNombre (nuevo.getNombre ());
		nuevoProducto.setPrecio (nuevo.getPrecio ());
		
		Categoria categoria = categoriaRepository.findById (nuevo.getCategoriaID ()).orElse (null);
		
		nuevoProducto.setCategoria (categoria);
		
		return ResponseEntity.status (HttpStatus.CREATED).body (productoRepository.save (nuevoProducto));
				
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
		
		productoRepository.deleteById (id);
		
		return ResponseEntity.noContent ().build ();
		
	}
	
}
