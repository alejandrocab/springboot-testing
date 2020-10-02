package com.jab.microservices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyServicesTests {

    @Autowired
    private MyService myService;

    @Test
    void testGreet() {
        Assertions.assertEquals("Hello, World", myService.greet());
    }

}
