package com.company;

public class dec implements Runnable {

    counter c;

    public dec() {
        c = new counter();
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            c.decrement();
        }
    }

}
