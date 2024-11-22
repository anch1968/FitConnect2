package com.example;

import dev.fitko.fitconnect.api.config.ApplicationConfig;
import dev.fitko.fitconnect.client.bootstrap.ApplicationConfigLoader;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;

@Getter
public class FCConfigLoader {

    private static final Logger LOGGER = LoggerFactory.getLogger(FCConfigLoader.class);
    private static ApplicationConfig applicationConfig;

    public static ApplicationConfig loadConfigViaConfigLoader(String configString) {

        final var configPath = Path.of(configString);
        applicationConfig = ApplicationConfigLoader.loadConfigFromPath(configPath);
        LOGGER.info("Loaded config {}", applicationConfig);
        return applicationConfig;
    }
}



