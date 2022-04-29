package com.daniel.usoyalm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PruebaYaml implements CommandLineRunner{
	
	 @Autowired
	 ReadYaml readYaml;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("servidor.aplicacion.nombre: " + readYaml.getAplicacion().get("nombre"));
		readYaml.getConfiguracion().get("ips").forEach(System.out::println);
		readYaml.getConfiguracion().get("files-system").forEach(System.out::println);
		System.out.println("Usuario root username: " + readYaml.getUsuarios().get("root").getUsername()
				+ " \npassword: " + readYaml.getUsuarios().get("root").getPassword());
	}

}
