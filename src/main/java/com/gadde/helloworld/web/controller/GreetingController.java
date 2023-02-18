package com.gadde.helloworld.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.gadde.helloworld.service.GreetService;
import com.gadde.helloworld.web.model.GreetingDto;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Validated
@RequestMapping("/api/v1/greet")
@RestController
public class GreetingController {

    private final GreetService greetService;

    public GreetingController(GreetService greetService) {
        this.greetService = greetService;
    }

    @GetMapping({"/{name}"})
    public ResponseEntity<GreetingDto> greet(@NotNull @Validated @PathVariable("name") String name) {

        return new ResponseEntity<>(greetService.greet(name), HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<GreetingDto> saveGreeting(@Validated @RequestBody GreetingDto greetingDto) {
        return new ResponseEntity<>(greetService.saveGreeting(greetingDto), HttpStatus.ACCEPTED);
    }
}
