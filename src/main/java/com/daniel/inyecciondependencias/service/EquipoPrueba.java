package com.daniel.inyecciondependencias.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EquipoPrueba implements CommandLineRunner{
	
	@Autowired
	//@Qualifier("equipos-españa")
	EquipoService equipoService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		equipoService.obtenerTodos().forEach(System.out::println);
	}

}
