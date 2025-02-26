import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + calculateSalary() + "]";
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class PayrollSystem {
    private List<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee employeeToRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPayroll System Menu:");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Display Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    // Add Full-Time Employee
                    System.out.print("Enter Full-Time Employee Name: ");
                    String fullTimeName = scanner.nextLine();
                    System.out.print("Enter Employee ID: ");
                    int fullTimeId = scanner.nextInt();
                    System.out.print("Enter Monthly Salary: ");
                    double monthlySalary = scanner.nextDouble();
                    payrollSystem.addEmployee(new FullTimeEmployee(fullTimeName, fullTimeId, monthlySalary));
                    System.out.println("Full-Time Employee Added Successfully!");
                    break;

                case 2:
                    // Add Part-Time Employee
                    System.out.print("Enter Part-Time Employee Name: ");
                    String partTimeName = scanner.nextLine();
                    System.out.print("Enter Employee ID: ");
                    int partTimeId = scanner.nextInt();
                    System.out.print("Enter Hours Worked: ");
                    int hoursWorked = scanner.nextInt();
                    System.out.print("Enter Hourly Rate: ");
                    double hourlyRate = scanner.nextDouble();
                    payrollSystem.addEmployee(new PartTimeEmployee(partTimeName, partTimeId, hoursWorked, hourlyRate));
                    System.out.println("Part-Time Employee Added Successfully!");
                    break;

                case 3:
                    // Remove Employee
                    System.out.print("Enter Employee ID to Remove: ");
                    int idToRemove = scanner.nextInt();
                    payrollSystem.removeEmployee(idToRemove);
                    System.out.println("Employee Removed Successfully (if ID exists).");
                    break;

                case 4:
                    // Display Employees
                    System.out.println("Employee Details:");
                    payrollSystem.displayEmployees();
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting Payroll System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
