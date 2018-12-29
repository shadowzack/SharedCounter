package com.company;

import java.util.concurrent.locks.Lock;

public class dec implements Runnable {

    Counter counter;



    public dec() {
        counter = new Counter();
    }

    public void run() {

        for (int i = 0; i < 10000; i++) {
            counter.decrement();
        }


    }

}
