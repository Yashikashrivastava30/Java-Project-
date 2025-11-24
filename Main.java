package com.smartqueue;

import com.smartqueue.models.Customer;
import com.smartqueue.models.ServiceRecord;
import com.smartqueue.services.*;
import com.smartqueue.storage.FileHandler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QueueManager qm = new QueueManager();
        TokenGenerator tg = new TokenGenerator();
        FileHandler fh = new FileHandler("records.txt");
        ReportGenerator rg = new ReportGenerator(fh);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Smart Queue Manager ===");
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Next");
            System.out.println("3. Show Queue");
            System.out.println("4. Show History");
            System.out.println("5. Exit");
            System.out.print("Select: ");

            int ch = Integer.parseInt(sc.nextLine());

            switch (ch) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Service Type: ");
                    String service = sc.nextLine();
                    int token = tg.generateToken();
                    qm.addCustomer(new Customer(token, name, service));
                    System.out.println("Token Assigned: " + token);
                    break;

                case 2:
                    if (qm.isEmpty()) System.out.println("Queue Empty!");
                    else {
                        Customer c = qm.nextCustomer();
                        System.out.println("Serving: " + c);
                        fh.appendRecord(new ServiceRecord(c).toFileLine());
                    }
                    break;

                case 3:
                    System.out.println(qm.displayQueue());
                    break;

                case 4:
                    System.out.println(rg.generateSimpleReport());
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}
