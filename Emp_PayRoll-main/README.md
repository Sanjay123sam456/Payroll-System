# Payroll System

This Java program implements a simple payroll management system that allows the user to manage full-time and part-time employees. The system provides functionalities to add employees, remove employees, and display employee details, including their calculated salaries.

## Table of Contents
- [Features](#features)
- [Class Structure](#class-structure)
  - [Employee](#employee)
  - [FullTimeEmployee](#fulltimeemployee)
  - [PartTimeEmployee](#parttimeemployee)
  - [PayrollSystem](#payrollsystem)
  - [Main Class](#main-class)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Sample Output](#sample-output)

## Features
1. **Add Full-Time and Part-Time Employees**: Users can add new employees to the payroll system.
2. **Remove Employees**: Users can remove employees by their unique ID.
3. **Display Employees**: Users can view a list of all employees and their respective salaries.
4. **Calculate Salaries**: Automatically calculates salaries for both full-time and part-time employees based on their input details.

## Class Structure

### 1. `Employee` (Abstract Class)
The `Employee` class is an abstract class that serves as the base class for all employee types. It contains:
- Private fields `name` and `id` for storing employee details.
- Constructor for initializing `name` and `id`.
- Getter methods for retrieving `name` and `id`.
- An abstract method `calculateSalary()` to be implemented by subclasses.
- A `toString()` method for displaying employee information.

### 2. `FullTimeEmployee` (Subclass of `Employee`)
The `FullTimeEmployee` class extends the `Employee` class. It represents a full-time employee and contains:
- A private field `monthlySalary` to store the monthly salary of the employee.
- A constructor to initialize the employee details and `monthlySalary`.
- An implementation of the `calculateSalary()` method that returns the `monthlySalary`.

### 3. `PartTimeEmployee` (Subclass of `Employee`)
The `PartTimeEmployee` class extends the `Employee` class. It represents a part-time employee and contains:
- Private fields `hoursWorked` and `hourlyRate` to store the number of hours worked and the hourly rate.
- A constructor to initialize the employee details, `hoursWorked`, and `hourlyRate`.
- An implementation of the `calculateSalary()` method that calculates and returns the salary as `hoursWorked * hourlyRate`.

### 4. `PayrollSystem`
The `PayrollSystem` class manages the list of employees and contains:
- A private `employeeList` field to store a list of employees.
- `addEmployee(Employee employee)` method to add an employee to the list.
- `removeEmployee(int id)` method to remove an employee from the list by their ID.
- `displayEmployees()` method to display the list of employees along with their details.

### 5. `Main` Class
The `Main` class contains the `main()` method, which provides a command-line interface (CLI) for interacting with the payroll system. It allows users to:
1. Add full-time and part-time employees.
2. Remove employees by their ID.
3. Display the list of all employees.
4. Exit the application.

The `Main` class uses a `Scanner` to read user input and performs operations based on user choices.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your system.

### Running the Program
1. Copy the source code into a file named `Main.java`.
2. Open a terminal and navigate to the directory containing `Main.java`.
3. Compile the code using the following command:
   ```bash
   javac Main.java
