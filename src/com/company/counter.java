package com.company;

class counter {
    public static int count = 0;

    public counter() {
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getValue() {
        return count;
    }
}
