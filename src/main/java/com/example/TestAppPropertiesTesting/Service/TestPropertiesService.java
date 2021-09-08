package com.example.TestAppPropertiesTesting.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestPropertiesService {

    @Value("${test.data}")
    private String propVal;

    public String testMethod() {
        //  TODO: When we run Test case for this method, then we are not able to get properties values from application-test.properties file.
        //  TODO: We are getting value as NULL here after we run the test.
        System.out.println("Prop Val in Main Service Class : " + propVal);
        return propVal;
    }
}
