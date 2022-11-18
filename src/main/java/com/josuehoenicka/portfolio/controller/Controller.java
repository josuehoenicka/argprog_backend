package com.josuehoenicka.portfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Controller {
    
    @GetMapping ("/hi/{name}/{lastname}")
    public String SayHi(@PathVariable String name,
                           @PathVariable String lastname) {
        return "Hi " + name + " " + lastname + ", welcome!";
    }
        
    @GetMapping ("/bye")
    public String SayBye(@RequestParam String name,
                         @RequestParam String lastname) {
       return "Bye " + name + " " + lastname + ", see you later!";  
    }
}
