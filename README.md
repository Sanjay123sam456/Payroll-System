# Payroll System

This Java program implements a simple payroll management system that allows users to manage full-time and part-time employees. The system provides functionalities to add employees, remove employees, and display employee details, including their calculated salaries.

## Features

- **Add Employees**: Supports full-time and part-time employee addition.
- **Remove Employees**: Employees can be removed using their unique ID.
- **View Employees**: Displays a list of all employees along with their salaries.
- **Salary Calculation**: Computes salaries based on input details.

## Class Structure

### 1. `Employee` (Abstract Class)

- Stores `name` and `id`.
- Includes an abstract method `calculateSalary()`.
- Provides a `toString()` method for displaying details.

### 2. `FullTimeEmployee` (Extends `Employee`)

- Stores `monthlySalary`.
- Implements `calculateSalary()`.

### 3. `PartTimeEmployee` (Extends `Employee`)

- Stores `hoursWorked` and `hourlyRate`.
- Implements `calculateSalary()` by computing `hoursWorked * hourlyRate`.

### 4. `PayrollSystem`

- Manages a list of employees.
- Provides methods to add, remove, and display employees.

### 5. `Main` Class

- Contains the `main()` method with a menu-driven interface.
- Accepts user input to manage employees.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed.

### Running the Program

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/Payroll-System.git
   cd Payroll-System
   ```
2. Compile the code:
   ```bash
   javac Main.java
   ```
3. Run the program:
   ```bash
   java Main
   ```

## Usage

1. **Add Employees**: Choose option `1` or `2` and provide details.
2. **Remove Employee**: Choose option `3` and enter an employee ID.
3. **Display Employees**: Choose option `4` to see all employees.
4. **Exit**: Choose option `5`.

## Example Output

```
Payroll System Menu:
1. Add Full-Time Employee
2. Add Part-Time Employee
3. Remove Employee
4. Display Employees
5. Exit
Enter your choice: 1
Enter Full-Time Employee Name: John Doe
Enter Employee ID: 101
Enter Monthly Salary: 50000
Full-Time Employee Added Successfully!
```

## License

This project is open-source under the [MIT License](LICENSE).

---

### 👨‍💻 Developed by Sanjay 

