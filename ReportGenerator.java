package com.smartqueue.services;

import com.smartqueue.models.ServiceRecord;
import com.smartqueue.storage.FileHandler;

import java.util.ArrayList;
import java.util.List;

public class ReportGenerator {
    private final FileHandler fh;

    public ReportGenerator(FileHandler fh) {
        this.fh = fh;
    }

    public List<ServiceRecord> loadRecords() {
        List<ServiceRecord> records = new ArrayList<>();
        for (String line : fh.readAllLines()) {
            ServiceRecord r = ServiceRecord.fromFileLine(line);
            if (r != null) records.add(r);
        }
        return records;
    }

    public String generateSimpleReport() {
        List<ServiceRecord> list = loadRecords();
        if (list.isEmpty()) return "No past service records found.";
        StringBuilder sb = new StringBuilder("=== Service History ===
");
        for (ServiceRecord r : list) sb.append(r).append("
");
        return sb.toString();
    }
}
