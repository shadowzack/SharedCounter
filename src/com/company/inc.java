package com.company;

public class inc implements Runnable {
    counter c;

    public inc() {
        c = new counter();
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            c.increment();
        }
    }

}


