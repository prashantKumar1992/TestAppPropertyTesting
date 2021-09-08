package com.example.TestAppPropertiesTesting.Service;

//import org.junit.jupiter.api.Test;
import com.example.TestAppPropertiesTesting.config.TestConfig;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
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
@EnableConfigurationProperties({TestConfig.class})
public class TestPropertiesServiceTest {

    MockMvc mockMvc;

    @InjectMocks
    TestPropertiesService testPropertiesService;

    @Mock
    private TestConfig testConfig;

    @Autowired
    private TestConfig actual;

    @BeforeEach
    public void setup() {
        Mockito.when(testConfig.getData()).thenReturn("my property value");
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(testPropertiesService).build();

    }

    @Test
    public void testMethod() {
        Mockito.when(testConfig.getData()).thenReturn(actual.getData());
//        Here, we are getting the properties values from application-test.properties file.
        String result = testPropertiesService.testMethod();
        System.out.println("result"+result);
//        assertNotNull(result);
//        assertEquals("demo", result);
    }
}
