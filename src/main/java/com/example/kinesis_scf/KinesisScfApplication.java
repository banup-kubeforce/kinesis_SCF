package com.example.kinesis_scf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KinesisScfApplication {

    public static void main(String[] args) {
        SpringApplication.run(KinesisScfApplication.class, args);
    }

    @Bean
    public ProducerFunction producerFunction() {
        return new ProducerFunction();
    }

}
