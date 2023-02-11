package com.gadde.helloworld.service;

import com.gadde.helloworld.web.model.GreetingDto;

public interface GreetService {
    GreetingDto greet(String name);
}
