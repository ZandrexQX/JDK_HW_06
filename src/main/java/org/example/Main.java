package org.example;

public class Main {
    public static void main(String[] args) {
        Form f = new Form();
        People p = new People(f);
        System.out.println(p.choicePeople());
    }
}