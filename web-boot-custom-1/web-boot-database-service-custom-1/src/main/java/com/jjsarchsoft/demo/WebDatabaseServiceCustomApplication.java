package com.jjsarchsoft.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class WebDatabaseServiceCustomApplication {

    public static void main(String[] args) {
        log.info("Starting custom database web service");
        SpringApplication.run(WebDatabaseServiceCustomApplication.class, args);
    }

}
