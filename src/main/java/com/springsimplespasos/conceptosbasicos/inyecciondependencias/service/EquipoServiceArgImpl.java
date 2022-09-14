package com.springsimplespasos.conceptosbasicos.inyecciondependencias.service;

import com.springsimplespasos.conceptosbasicos.inyecciondependencias.domain.Equipo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;

@Component ("equipos-arg")
@ConditionalOnProperty(prefix = "app", name = "implementation", havingValue = "argentina")
public class EquipoServiceArgImpl implements  EquipoService {

    private List<Equipo> equipos = new ArrayList<>(Arrays.asList(
            new Equipo(1, "River Plate", 1910, LocalDate.of(1909,01,01)),
            new Equipo(2, "Barcelo", 1920, LocalDate.of(1919,03,02)),
            new Equipo(3, "Otro", 1930, LocalDate.of(1929,03,03))
    ));

    @Override
    public Optional<Equipo> obtenerEquipoPorId(Integer id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Equipo> obtenerTodo() {
        return equipos;
    }
}
