package org.example;

import java.util.Random;

public class People {
    private Form f;
    private Random r = new Random();

    public People(Form f){
        this.f = f;
    }

    public boolean choicePeople(){
        int first = r.nextInt(3)+1;
        f.firstChoice(first);
        System.out.println("В первый раз выбрал дверь: " + first);
        int second = r.nextInt(3)+1;
        while (second == f.getOpenDoor()){
            second = r.nextInt(3)+1;
        }
        System.out.println("Вo второй раз выбрал дверь: " + second);

        return f.choiceDoor(second);
    }

}
