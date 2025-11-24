package com.smartqueue.models;

public class Customer {
    private final int token;
    private final String name;
    private final String serviceType;

    public Customer(int token, String name, String serviceType) {
        this.token = token;
        this.name = name;
        this.serviceType = serviceType;
    }

    public int getToken() { return token; }
    public String getName() { return name; }
    public String getServiceType() { return serviceType; }

    @Override
    public String toString() {
        return "[" + token + "] " + name + " (" + serviceType + ")";
    }
}
