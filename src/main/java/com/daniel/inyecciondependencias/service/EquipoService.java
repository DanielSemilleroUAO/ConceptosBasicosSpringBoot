package com.daniel.inyecciondependencias.service;

import java.util.Optional;

import com.daniel.inyecciondependencias.domain.Equipo;

public interface EquipoService {
	
	Optional<Equipo> obtenerEquipoPorId(Integer id);
	Iterable<Equipo> obtenerTodos();
	
}
