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

    public boolean choiceDoor(int choice){
        return switch (choice){
            case 1 -> door1.isWin();
            case 2 -> door2.isWin();
            case 3 -> door3.isWin();
            default -> false;
        };
    }
}
