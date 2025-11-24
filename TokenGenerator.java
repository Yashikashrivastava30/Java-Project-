package com.smartqueue.services;

import java.util.concurrent.atomic.AtomicInteger;

public class TokenGenerator {
    private final AtomicInteger counter;

    public TokenGenerator(int start) {
        this.counter = new AtomicInteger(start);
    }

    public TokenGenerator() {
        this(100);
    }

    public int generateToken() {
        return counter.getAndIncrement();
    }

    public void setNext(int next) {
        counter.set(next);
    }
}
