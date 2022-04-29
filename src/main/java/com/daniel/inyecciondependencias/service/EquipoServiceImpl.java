package com.daniel.inyecciondependencias.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.daniel.inyecciondependencias.domain.Equipo;

//@Primary
@Component("equipos-argentina")
@ConditionalOnProperty(prefix = "app", name = "implementacion", havingValue = "argentina")
public class EquipoServiceImpl implements EquipoService {
	
	private List<Equipo> equipos = new ArrayList<>(Arrays.asList(
			new Equipo(1,"River Plate", 1901, LocalDate.of(1901, 8, 25)),
			new Equipo(2,"Boca Juniors", 1905, LocalDate.of(1905, 9, 3)),
			new Equipo(3,"Independiente", 1905, LocalDate.of(1905, 1, 1))
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
