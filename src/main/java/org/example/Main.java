package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Core> cores = new ArrayList<>();

    static void fillArr(int count){
        for (int i = 0; i < count; i++) {
            cores.add(new Core());
        }
    }

    static void startAll() throws InterruptedException {
        for (Core c: cores) {
            c.start();
        }
        for (Core c: cores){
            c.join();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        fillArr(4);
        startAll();
        System.out.println("Finished all");

        Core.printResult();
    }
}