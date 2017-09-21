package com.elocation;
/**
 * Created by ahmedks on 15/09/17.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.elocation.dao")
@SpringBootApplication
public class Main {
    public static void main (String[] args){
        SpringApplication.run(Main.class, args);

    }
}
