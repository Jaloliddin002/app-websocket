package com.dev.appwebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AppWebsocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppWebsocketApplication.class, args);
    }
}
