package com.smartqueue.storage;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private final Path filePath;

    public FileHandler(String fileName) {
        this.filePath = Paths.get(fileName);
        ensureFile();
    }

    public FileHandler() {
        this("records.txt");
    }

    private void ensureFile() {
        try {
            if (!Files.exists(filePath)) Files.createFile(filePath);
        } catch (IOException e) {
            System.err.println("Error creating file: " + e.getMessage());
        }
    }

    public synchronized void appendRecord(Object record) {
        try (BufferedWriter bw = Files.newBufferedWriter(filePath, StandardOpenOption.APPEND)) {
            bw.write(record.toString());
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Write error: " + e.getMessage());
        }
    }

    public synchronized List<String> readAllLines() {
        try {
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }
}
