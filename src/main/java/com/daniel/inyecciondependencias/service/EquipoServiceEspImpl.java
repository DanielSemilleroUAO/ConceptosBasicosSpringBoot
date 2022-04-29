package com.daniel.inyecciondependencias.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.daniel.inyecciondependencias.domain.Equipo;

//@Primary
@Component("equipos-españa")
@ConditionalOnProperty(prefix = "app", name = "implementacion", havingValue = "espania")
public class EquipoServiceEspImpl implements EquipoService{
	
	private List<Equipo> equipos = new ArrayList<>(Arrays.asList(
			new Equipo(1,"Real Madrid", 1901, LocalDate.of(1901, 8, 25)),
			new Equipo(2,"F.C. Barcelona", 1905, LocalDate.of(1905, 9, 3)),
			new Equipo(3,"Atletico de Madrid", 1905, LocalDate.of(1905, 1, 1))
			));

	@Override
	public Optional<Equipo> obtenerEquipoPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Equipo> obtenerTodos() {
		// TODO Auto-generated method stub
		return equipos;
	}

}
