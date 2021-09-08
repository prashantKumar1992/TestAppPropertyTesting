package com.example.TestAppPropertiesTesting;

import com.example.TestAppPropertiesTesting.config.TestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({TestConfig.class})
public class TestAppPropertiesTestingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestAppPropertiesTestingApplication.class, args);
    }
}
