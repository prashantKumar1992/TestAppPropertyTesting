package com.example.TestAppPropertiesTesting.Service;

//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest(classes = TestPropertiesService.class)
@TestPropertySource(locations = "classpath:application-test.properties")
public class TestPropertiesServiceTest {

    MockMvc mockMvc;

    @InjectMocks
    TestPropertiesService testPropertiesService;

    @Value("${test.data}")
    private String propVal;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(testPropertiesService).build();
    }

    @Test
    public void testMethod() {
//        Here, we are getting the properties values from application-test.properties file.
        System.out.println("Prop Val in Test Class : " + propVal);
        String result = testPropertiesService.testMethod();
        assertNotNull(result);
        assertEquals("demo", result);
    }
}