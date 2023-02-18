package com.gadde.helloworld.web.controller;

import com.gadde.helloworld.web.model.GreetingDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class GreetingControllerTest {

    @Autowired
    GreetingController greetingController;

    @Test
    void greet() {

        ResponseEntity<GreetingDto> responseEntity = greetingController.greet("Rahul");

        assertNotNull(responseEntity);
    }

    @Test
    void saveGreeting(){

        GreetingDto greetingDto= GreetingDto.builder()
                                          //  .name("Test Name")
                                         //   .greeting("How are you")
                                            .build();

        ResponseEntity<GreetingDto> responseEntity = greetingController.saveGreeting(greetingDto);

        assertNotNull(responseEntity);
    }

}