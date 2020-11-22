//package com.example.springboot;
//
//
//import java.net.URL;
//
//import javafx.beans.binding.BooleanExpression;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.http.ResponseEntity;
//
//import static org.junit.Assert.assertThat;
//
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class HelloControllerIntegrationTest {
//
//    @LocalServerPort
//    private int port;
//    private URL base;
//
//
//    @Autowired
//    private TestRestTemplate template;
//
//    @BeforeEach
//    public void setUp() throws  Exception{
//        this.base = new URL("http://localhost:"+port);
//
//    }
//
//    @Test
//    public void getHello() throws Exception{
//        ResponseEntity<String> response = template.getForEntity(base.toString(),String.class);
//        assertThat(response.getBody()).isEqualTo("Greetings from Spring boot Application");
//    }
//
//
//}
