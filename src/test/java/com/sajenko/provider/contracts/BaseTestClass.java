package com.sajenko.provider.contracts;

import com.sajenko.provider.ProviderApplication;
import com.sajenko.provider.restservice.UserService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ProviderApplication.class)
public class BaseTestClass {

    @Autowired
    private UserService userService;

    @BeforeEach
    void setUp() {
        RestAssuredMockMvc.standaloneSetup(userService);
    }
}
