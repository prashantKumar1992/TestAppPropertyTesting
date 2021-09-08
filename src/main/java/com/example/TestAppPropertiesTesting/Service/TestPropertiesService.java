package com.example.TestAppPropertiesTesting.Service;

import com.example.TestAppPropertiesTesting.config.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestPropertiesService {

    @Autowired
    public TestConfig testConfig;

    public String testMethod() {
        //  TODO: When we run Test case for this method, then we are not able to get properties values from application-test.properties file.
        //  TODO: We are getting value as NULL here after we run the test.
        System.out.println("Prop Val in Main Service Class : " + testConfig.getData());
        return testConfig.getData();
    }
}
