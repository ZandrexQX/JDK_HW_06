package org.example;

public class Main {
    static void startAll(){
        for (int i = 0; i < 10; i++) {
            Core c = new Core();
            c.start();
        }
    }
    public static void main(String[] args) {
        startAll();
        System.out.println("_______");
        Core.printResult();
    }
}