package org.example;

import java.util.Random;

public class People {
    private Form f;
    private Random r = new Random();

    public People(Form f){
        this.f = f;
    }

    public boolean choicePeople(){
        int choice = r.nextInt(3)+1;
        f.firstChoice(choice);
        return f.choiceDoor(choice);
    }

}
