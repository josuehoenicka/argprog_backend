package com.josuehoenicka.portfolio.controller;

import com.josuehoenicka.portfolio.model.People;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Controller {
    
    List<People> peopleList = new ArrayList();
    
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
    
    @PostMapping ("/new/people")
    public void addPeople(@RequestBody People p) {
        peopleList.add(p);
    }
    
    @GetMapping("/watch/peoples")
    @ResponseBody
    public List<People> watchPeople() {
        return peopleList;
    }
    
}
