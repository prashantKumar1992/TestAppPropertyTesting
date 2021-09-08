package com.example.TestAppPropertiesTesting.controller;

import com.example.TestAppPropertiesTesting.Service.TestPropertiesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final TestPropertiesService testPropertiesService;

    public MainController(TestPropertiesService testPropertiesService) {
        this.testPropertiesService = testPropertiesService;
    }

    @GetMapping("/getTestValue")
    public String getTestValFromPropFile() {
        return testPropertiesService.testMethod();
    }
}
