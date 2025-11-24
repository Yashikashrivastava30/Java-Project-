# Java-Project-
Smart Queue Manager

A lightweight Java-based queue management system designed for service centers such as hospitals, banks, clinics, billing counters, and office helpdesks. The project demonstrates core Object-Oriented Programming concepts, clean modular design, data handling, and layered software architecture.

📌 Overview

Manual queue handling often leads to confusion, delays, and inefficiency. Smart Queue Manager offers a simple, offline, menu-driven solution to manage customers, assign tokens, track the queue flow, and store service records.

The system follows a three-layered architecture:

Presentation Layer – Console-based UI for interacting with the system

Service Layer – Core logic (queue management, token generation, reporting)

Data Layer – File-based record storage

This project is ideal for coursework, demonstrations, and understanding real-world queue processing logic.

✨ Features
Functional Features

Customer registration with auto-generated token

Maintain and display the current queue

Serve next customer in real time

Store served customer records to file

Load previous records on startup

Simple reporting of completed services

Technical Features

Clean OOP design

Queue-based data structure (FIFO)

Exception handling for invalid inputs

Modular folder structure (models, services, storage)

File handling (read/write service logs)

🧱 Technology Stack

Language: Java 8+

Paradigm: Object-Oriented Programming (OOP)

Data Storage: Text-based file storage (records.txt)

Tools:

Any Java IDE (IntelliJ, Eclipse, VS Code)

Git/GitHub for version control

📁 Project Structure
src/
 └── com.smartqueue
        ├── Main.java
        ├── models/
        │      ├── Customer.java
        │      └── ServiceRecord.java
        ├── services/
        │      ├── QueueManager.java
        │      ├── TokenGenerator.java
        │      └── ReportGenerator.java
        └── storage/
               └── FileHandler.java

records.txt   ← generated automatically

🚀 How to Run the Project
1. Clone the Repository
git clone https://github.com/your-username/smart-queue-manager.git
cd smart-queue-manager

2. Compile the Java Files
javac -d out src/com/smartqueue/**/*.java

3. Run the Application
java -cp out com.smartqueue.Main

4. Using the Program

You will see an interactive menu:

1. Add Customer
2. Serve Next
3. Show Queue
4. Exit


Follow on-screen instructions to use the system.

📄 Example Output
=== Smart Queue Manager ===

1. Add Customer
2. Serve Next
3. Show Queue
4. Exit

Select: 1
Enter Name: Rohan
Service Type: Cash Deposit
Token Assigned: 101

Select: 3
Current Queue:
 → [101] Rohan (Cash Deposit)

🗂 Data Storage

All served customer information is stored in:

records.txt


Example entry:

Token: 101 | Name: Rohan | Service: Cash Deposit | Time: 2025-11-24 10:15 AM

🧪 Testing

Input validation for empty names and invalid choices

Queue operations manually verified

File writing/reading tested across multiple runs

🔧 Future Enhancements

Priority Queue (elderly/pregnant customers)

Multiple service counters

GUI version using JavaFX

Export reports as PDF

Admin login system

📘 License

This project is intended for academic and learning purposes.
Feel free to modify or extend it as needed.
