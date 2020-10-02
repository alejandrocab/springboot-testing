package com.jab.microservices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyController2Tests {

    @InjectMocks
    private MyController2 myController2;
    @Mock
    private MyService myServiceMock;

    @BeforeEach
    public void setUp() {
        Mockito.when(myServiceMock.greet()).thenReturn("OK");
    }

    @Test
    void testGreeting() {
        Assertions.assertEquals("OK", myController2.greeting());
    }

}
