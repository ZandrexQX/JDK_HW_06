package org.example;

import lombok.Getter;
import lombok.ToString;

import java.util.Random;

import static java.lang.StringTemplate.STR;

@Getter
@ToString
public class Form {
    private Door door1;
    private Door door2;
    private Door door3;
    private Random r = new Random();
    private int openDoor;

    public Form() {
        this.door1 = new Door(r.nextBoolean());
        this.door2 = new Door(r.nextBoolean());
        this.door3 = new Door(true);
    }

    public boolean choiceDoor(int choice) {
        return switch (choice) {
            case 1 -> door1.isWin();
            case 2 -> door2.isWin();
            case 3 -> door3.isWin();
            default -> false;
        };
    }

    public void firstChoice(int choice) {
        switch (choice) {
            case 1 -> {
                if (door2.isWin()) this.openDoor = 3;
                else this.openDoor = 2;
            }
            case 2 -> {
                if (door1.isWin()) this.openDoor = 3;
                else this.openDoor = 1;
            }
            case 3 -> {
                if (door1.isWin()) this.openDoor = 2;
                else this.openDoor = 1;
            }
            default -> throw new RuntimeException("Error in first choice");
        }
    }
}
