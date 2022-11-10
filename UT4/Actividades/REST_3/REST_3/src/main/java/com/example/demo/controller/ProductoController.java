package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modelo.Producto;
import com.example.demo.modelo.ProductoRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProductoController {
	
	private final ProductoRepository productoRepository;
			
	@GetMapping ("/producto")
	public List <Producto> obtenerTodos () {
		
		return productoRepository.findAll ();
		
	}
	
	@GetMapping ("/producto/{id}")
	public Producto obtenerUno (@PathVariable Long id) {
		
		return productoRepository.findById (id).orElse (null);
		
	}
	
	@PostMapping ("/producto")
	public Producto nuevoProducto (@RequestBody Producto nuevo) {
		
		return productoRepository.save (nuevo);
		
	}
	
	@PutMapping ("/producto/{id}")
	public Producto editarProducto (@RequestBody Producto editar, @PathVariable Long id) {
		
		if (productoRepository.existsById (id)) {
			
			editar.setId (id);
			
			return productoRepository.save (editar);
			
		} else {
			
			return null;
			
		}
		
	}
	
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
