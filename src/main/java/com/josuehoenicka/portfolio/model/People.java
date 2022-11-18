package com.josuehoenicka.portfolio.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class People {
    private long id;
    private String name;
    private String lastname;
    
    public People(){
    }
    
    public People(long id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }
}
