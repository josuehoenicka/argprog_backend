package com.josuehoenicka.portfolio.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Controller {
    
    @GetMapping ("/hello/{name}/{lastname}")
    public String SayHello(@PathVariable String name,
                           @PathVariable String lastname) {
        return "Hello " + name + " " + lastname + ", welcome!";
    }
}
