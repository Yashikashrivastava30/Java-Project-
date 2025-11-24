# **Smart Queue Manager – Java Project**

A modular Java-based application designed to manage customer queues in service centers such as banks, clinics, and helpdesks. The system automates token generation, maintains a live queue using data structures, and stores served customer records through file handling.

---

## **📌 Overview**

Crowded service centers often struggle with unorganized queues. This project solves the problem by providing a simple, offline, menu-driven console application that lets staff register customers, serve them in order, and keep track of all completed services.

The project demonstrates core Java concepts including OOP, packages, file I/O, and queue operations.

---

## **✨ Features**

* Customer registration with automatic token assignment
* Queue operations using FIFO logic
* Serve next customer
* Display complete queue
* Store served customer details to a file
* Load past service history
* Clear, menu-driven user interface

---

## **🧱 Technologies Used**

* Java 8+
* Object-Oriented Programming
* Queue (LinkedList)
* File Handling (BufferedReader, FileWriter)
* Git & GitHub

---

## **📁 Project Structure**

```
src/
 └── com.smartqueue
        ├── Main.java
        │
        ├── models/
        │      ├── Customer.java
        │      └── ServiceRecord.java
        │
        ├── services/
        │      ├── QueueManager.java
        │      ├── TokenGenerator.java
        │      └── ReportGenerator.java
        │
        └── storage/
               └── FileHandler.java

records.txt   ← Generated automatically when serving customers
```

---

## **🚀 Running the Application**

### **1. Clone the Repository**

```bash
git clone https://github.com/your-username/smart-queue-manager.git
cd smart-queue-manager
```

### **2. Compile the Project**

```bash
javac -d out src/com/smartqueue/**/*.java
```

### **3. Run the Application**

```bash
java -cp out com.smartqueue.Main
```

---

## **🖥️ Usage**

When the program starts, the following menu appears:

```
1. Add Customer
2. Serve Next Customer
3. Show Queue
4. Exit
```

### **Add Customer**

Enter name and service type → system assigns token.

### **Serve Customer**

Removes the first customer (FIFO) and logs the entry.

### **Show Queue**

Displays all customers waiting in line.

---

## **🗂 Data Storage**

All completed services are saved automatically to:

```
records.txt
```

Sample entry:

```
Token: 104 | Name: Rahul Singh | Service: Cash Deposit | Time: 2025-11-24 10:21 AM
```

---

## **🧪 Testing**

* Validated queue operations
* Tested file read/write
* Checked handling of empty queue
* Verified menu input and error messages

---

## **📈 Future Enhancements**

* Priority queues
* Multi-counter support
* JavaFX GUI
* Login system
* PDF-based reporting


