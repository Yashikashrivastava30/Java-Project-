package com.smartqueue.services;

import com.smartqueue.models.Customer;
import java.util.LinkedList;
import java.util.Queue;

public class QueueManager {
    private final Queue<Customer> queue = new LinkedList<>();

    public synchronized void addCustomer(Customer c) {
        queue.offer(c);
    }

    public synchronized Customer nextCustomer() {
        return queue.poll();
    }

    public synchronized boolean isEmpty() {
        return queue.isEmpty();
    }

    public synchronized String displayQueue() {
        if (queue.isEmpty()) return "Queue is empty.";
        StringBuilder sb = new StringBuilder("Current Queue (front → back):
");
        for (Customer c : queue) sb.append(" → ").append(c).append("
");
        return sb.toString();
    }
}
