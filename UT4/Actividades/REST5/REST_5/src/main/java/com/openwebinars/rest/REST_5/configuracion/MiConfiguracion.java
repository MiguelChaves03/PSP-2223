package com.openwebinars.rest.REST_5.configuracion;

import org.springframework.context.annotation.*;
import org.modelmapper.*;

@Configuration
public class MiConfiguracion {
	
	@Bean
	public ModelMapper modelMapper () {
		
		return new ModelMapper ();
		
	}

}
