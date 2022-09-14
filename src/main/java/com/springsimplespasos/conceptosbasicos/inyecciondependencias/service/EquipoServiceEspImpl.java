package com.springsimplespasos.conceptosbasicos.inyecciondependencias.service;

import com.springsimplespasos.conceptosbasicos.inyecciondependencias.domain.Equipo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//@Primary
@Component("equipos-esp")
@ConditionalOnProperty(prefix = "app", name = "implementation", havingValue = "espania")
public class EquipoServiceEspImpl implements EquipoService {

    private List<Equipo> equipos = new ArrayList<>(Arrays.asList(
            new Equipo(1, "Pumas", 1910, LocalDate.of(1909,01,01)),
            new Equipo(2, "Chivas", 1920, LocalDate.of(1919,03,02)),
            new Equipo(3, "America", 1930, LocalDate.of(1929,03,03))
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
