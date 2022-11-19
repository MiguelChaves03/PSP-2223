package com.openwebinars.rest.REST_3controller;

import org.springframework.web.bind.annotation.*;
import com.openwebinars.rest.REST_3.modelo.*;
import lombok.*;
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
	public List <Producto> obtenerTodos () {
		
		return productoRepository.findAll ();
		
	}
	
	/**
	 * Obtener un producto dado su id
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping ("/producto/{id}")
	public Producto obtenerUno (@PathVariable Long id) {
		
		return productoRepository.findById (id).orElse (null);
		
	}
	
	/**
	 * Insertar un producto
	 * 
	 * @param nuevo
	 * @return
	 */
	@PostMapping ("/producto")
	public Producto nuevoProducto (@RequestBody Producto nuevo) {
		
		return productoRepository.save (nuevo);
		
	}
	
	/**
	 * Editar un producto dado su id
	 * 
	 * @param editar
	 * @param id
	 * @return
	 */
	@PutMapping ("/producto/{id}")
	public Producto editarProducto (@RequestBody Producto editar, @PathVariable Long id) {
		
		if (productoRepository.existsById (id)) {
			
			editar.setId (id);
			
			return productoRepository.save (editar);
			
		} else {
			
			return null;
			
		}
		
	}
	
	/**
	 * Eliminar un producto dado su id
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping ("/producto/{id}")
	public Producto borrarProducto (@PathVariable Long id) {
		
		if (productoRepository.existsById (id)) {
			
			Producto result = productoRepository.findById (id).get ();
			
			productoRepository.deleteById (id);
			
			return result;
			
		} else {
			
			return null;
			
		}
		
	}
	
}
