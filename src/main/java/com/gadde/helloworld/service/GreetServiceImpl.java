package com.gadde.helloworld.service;

import org.springframework.stereotype.Service;
import com.gadde.helloworld.web.model.GreetingDto;

@Service
public class GreetServiceImpl implements GreetService{
    @Override
    public GreetingDto greet(String name) {
        return GreetingDto.builder()
                .greeting("Good Morning")
                .name(name)
                .build();
    }
}
