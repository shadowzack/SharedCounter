package com.company;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Petersons implements Lock {
    private boolean[] flag = new boolean[2];
    private int victim;
    public int i;
    public int j;


    public Petersons() {

    }

    @Override
    public void lock() {
        System.out.println("locking by thread: " + i);
        j = 1 - i;
        flag[i] = true;
        System.out.println("flag[i]: " + flag[i]);
        victim = i;
        while (flag[j] && victim == i) {
        }

    }

    @Override
    public void unlock() {
        System.out.println("unlocking by thread: " + i);
        flag[i] = false;
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }


    @Override
    public Condition newCondition() {
        return null;
    }
}
