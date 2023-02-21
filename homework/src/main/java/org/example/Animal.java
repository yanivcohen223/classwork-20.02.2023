package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Animal implements Greeting{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public abstract void greets();


}
