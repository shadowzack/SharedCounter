package com.company;

public class Main {


    public static void main(String[] args) {
        counter c = new counter();

        Thread t1 = new Thread(new inc());
        Thread t2 = new Thread(new dec());
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
            System.out.println(c.getValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
