package com.example;

import dev.fitko.fitconnect.client.bootstrap.ClientFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FitConnectClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FitConnectClientApplication.class, args);
        var config = FCConfigLoader.loadConfigViaConfigLoader("src/main/resources/config.yml");
        var senderClient = ClientFactory.createSenderClient(config);
        senderClient.listCases();
    }
}
