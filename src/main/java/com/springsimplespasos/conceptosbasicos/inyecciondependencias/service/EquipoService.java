package com.springsimplespasos.conceptosbasicos.inyecciondependencias.service;

import com.springsimplespasos.conceptosbasicos.inyecciondependencias.domain.Equipo;


import java.util.Optional;


public interface EquipoService {

    Optional<Equipo> obtenerEquipoPorId(Integer id);

    Iterable<Equipo> obtenerTodo ();
}
