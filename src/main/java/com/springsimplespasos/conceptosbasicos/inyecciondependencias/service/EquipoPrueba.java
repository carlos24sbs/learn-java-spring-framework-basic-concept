package com.springsimplespasos.conceptosbasicos.inyecciondependencias.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EquipoPrueba implements CommandLineRunner {

    @Autowired
//    @Qualifier("equipos-esp")
    EquipoService service;

    @Override
    public void run(String... args) throws Exception {
        service.obtenerTodo().forEach(System.out::println);
    }
}
