package org.example;

public class View {
    private Form f;
    private People p;

    public View(){
        f = new Form();
        p = new People(f);
    }

    public void start(){
        int first = p.firstInt();
        System.out.println("В первый раз выбрал дверь: " + first);
        int openDoor = f.getOpenDoor();
        System.out.println(STR."Открылась дверь: \{openDoor}. В ней \{f.choiceDoor(openDoor)}");
        int second = p.secondInt();
        System.out.println("Вo второй раз выбрал дверь: " + second + " и в ней -> " + f.choiceDoor(second));
    }

    public void startRes(){
        System.out.println(p.choicePeople());
    }
}
