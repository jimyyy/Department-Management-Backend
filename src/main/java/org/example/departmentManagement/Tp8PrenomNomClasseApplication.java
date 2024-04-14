package org.example.departmentManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy
public class Tp8PrenomNomClasseApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp8PrenomNomClasseApplication.class, args);
    }

}
