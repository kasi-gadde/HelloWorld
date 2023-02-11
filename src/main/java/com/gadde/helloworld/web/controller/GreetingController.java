package com.gadde.helloworld.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gadde.helloworld.service.GreetService;
import com.gadde.helloworld.web.model.GreetingDto;

@RequestMapping("/api/v1/greet")
@RestController
public class GreetingController {

    private final GreetService greetService;

    public GreetingController(GreetService greetService) {
        this.greetService = greetService;
    }


    @GetMapping({"/{name}"})
    public ResponseEntity<GreetingDto> greet(@PathVariable("name") String name){

        return new ResponseEntity<>(greetService.greet(name), HttpStatus.OK);

    }
}
