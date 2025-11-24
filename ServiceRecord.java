package com.smartqueue.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ServiceRecord {
    private final int token;
    private final String name;
    private final String serviceType;
    private final LocalDateTime servedAt;

    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public ServiceRecord(Customer c) {
        this.token = c.getToken();
        this.name = c.getName();
        this.serviceType = c.getServiceType();
        this.servedAt = LocalDateTime.now();
    }

    public ServiceRecord(int token, String name, String serviceType, LocalDateTime servedAt) {
        this.token = token;
        this.name = name;
        this.serviceType = serviceType;
        this.servedAt = servedAt;
    }

    @Override
    public String toString() {
        return "Token: " + token + " | Name: " + name + " | Service: " + serviceType +
               " | Time: " + servedAt.format(FORMAT);
    }

    public String toFileLine() {
        return token + "|" + name + "|" + serviceType + "|" + servedAt.format(FORMAT);
    }

    public static ServiceRecord fromFileLine(String line) {
        try {
            String[] parts = line.split("\|", 4);
            if (parts.length != 4) return null;
            int token = Integer.parseInt(parts[0]);
            String name = parts[1];
            String serviceType = parts[2];
            LocalDateTime ts = LocalDateTime.parse(parts[3], FORMAT);
            return new ServiceRecord(token, name, serviceType, ts);
        } catch (Exception e) {
            return null;
        }
    }
}
