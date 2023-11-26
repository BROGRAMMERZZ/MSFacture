package com.esprit.microservices.msfacture;

import com.esprit.microservices.msfacture.DAO.Repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class MsFactureApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsFactureApplication.class, args);
    }
    @Autowired
    private FactureRepository repository ;
    @Bean
    ApplicationRunner init(){
        return (args -> {

            repository.findAll().forEach(System.out::println);
        }) ;
    }
}
