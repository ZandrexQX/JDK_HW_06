package org.example;

import lombok.Getter;

@Getter
public class Door {
    private boolean isWin;
    private static boolean oneTrue = false;

    public Door(boolean value){
        if (oneTrue) isWin = false;
        else {
            isWin = value;
            if (value) oneTrue = true;
        }
    }
}
