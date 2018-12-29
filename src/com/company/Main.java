package com.company;

public class Main {


    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread threadIncrement = new Thread(new inc());
        Thread threadDecrement = new Thread(new dec());
        Petersons petersons = new Petersons();

        petersons.i = 0;
        try {
            petersons.lock();
            threadIncrement.start();
        } finally {
            System.out.println(counter.getValue());
            petersons.i = 0;
            petersons.unlock();
        }
        Petersons petersons2 = new Petersons();
        petersons2.i = 1;
        try {

            petersons2.lock();
            threadDecrement.start();
        } finally {
            petersons2.i = 1;
            petersons2.unlock();
        }


        try {
            threadIncrement.join();
            threadDecrement.join();
            System.out.println(counter.getValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
