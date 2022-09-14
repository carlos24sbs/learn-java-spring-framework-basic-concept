package com.springsimplespasos.conceptosbasicos.usoproperties;

import com.springsimplespasos.conceptosbasicos.usoproperties.herencia.ReadBarProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PruebaProperties implements CommandLineRunner {

    @Autowired
    ReadCommonProperties readCommonProperties;

    @Autowired
    ReadFooProperties readFooProperties;

    @Autowired
    ReadBarProperties readBarProperties;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(readCommonProperties.getBaseUrl());
        System.out.println("##################################");
        System.out.println(readFooProperties.getClientUrl());
        System.out.println(readFooProperties.getCustomClient());
        System.out.println("##################################");
        System.out.println("Bar.name:" + readBarProperties.getName());
        System.out.println("Bar.url.client:" + readBarProperties.getUrl().getClient());
        System.out.println("Bar.url.customer:" + readBarProperties.getUrl().getClient());
    }
}
