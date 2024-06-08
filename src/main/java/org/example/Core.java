package org.example;

import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Core extends Thread{
    private Form f;
    private People p;
    private static volatile HashMap<Integer, Boolean> result = new HashMap<>();
    private boolean res;
    private static AtomicInteger key = new AtomicInteger(0);

    public Core(){
        f = new Form();
        p = new People(f);
    }

    @SneakyThrows
    @Override
    public void run() {
        System.out.println(STR."Started \{Thread.currentThread().getName()}");
        process();
    }

    public void process() throws InterruptedException{
        for (int i = 0; i < 100; i++) {
            res = p.choicePeople();
            putResult(res);
        }
    }
    public synchronized void putResult(boolean res){
        int k = key.incrementAndGet();
        result.put(k, res);
    }

    public static void printResult(){
        System.out.println(result);
    }
}
