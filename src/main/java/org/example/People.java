package org.example;

import java.util.Random;

public class People {
    private Form f;
    private Random r = new Random();

    public People(Form f){
        this.f = f;
    }

    public boolean choicePeople(){
        firstInt();
        return f.choiceDoor(secondInt());
    }

    public int firstInt(){
        int first = r.nextInt(3)+1;
        f.firstChoice(first);
        return first;
    }

    public int secondInt(){
        int second = r.nextInt(3)+1;
        while (second == f.getOpenDoor()){
            second = r.nextInt(3)+1;
        }
        return second;
    }


}
