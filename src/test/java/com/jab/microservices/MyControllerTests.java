package com.jab.microservices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyControllerTests {

    @Autowired
    private MyController myController;

    @Test
    void testGreeting() {
        Assertions.assertEquals("Hello, World", myController.greeting());
    }

}
