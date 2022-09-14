package com.springsimplespasos.conceptosbasicos.usoyaml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PruebaYaml implements CommandLineRunner {

    @Autowired
    ReadYaml readYaml;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("###########YAML###############");
        System.out.println("server.application.name" + readYaml.getApplication().get("name") );
        readYaml.getConfig().get("ips").forEach(System.out::println);
        readYaml.getConfig().get("file-system").forEach(System.out::println);
        System.out.println("user root username: " + readYaml.getUser().get("root").getUsername());
        System.out.println("user root pass: " + readYaml.getUser().get("root").getPassword());
    }
}
