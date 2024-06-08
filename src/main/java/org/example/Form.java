package org.example;

import lombok.ToString;

import java.util.Random;


@ToString
public class Form {
    private Door door1;
    private Door door2;
    private Door door3;
    private Random r = new Random();

    public Form(){
        this.door1 = new Door(r.nextBoolean());
        this.door2 = new Door(r.nextBoolean());
        this.door3 = new Door(true);
    }
}
