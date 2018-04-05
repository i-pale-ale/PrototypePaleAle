package com.paleale.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PrototypePaleAleBoot1Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PrototypePaleAleBoot1Application.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(PrototypePaleAleBoot1Application.class, args);
    }

}

