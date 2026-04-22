package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
    @Bean(name = "cat")
    @Scope("prototype")
    public Cat cat(){
        return new Cat();
    }

}
