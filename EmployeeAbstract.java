package assignment12;

import java.util.Scanner;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

        public abstract double calculatePay();

        public void getEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

   
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    
    @Override
    public double calculatePay() {
        return salary;
    }
}

public class EmployeeAbstract
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter details for Hourly Employee:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Hourly Rate: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Hours Worked: ");
        int hoursWorked = scanner.nextInt();

        
        HourlyEmployee hourlyEmployee = new HourlyEmployee(name, id, hourlyRate, hoursWorked);

       
        System.out.println("\nEnter details for Salaried Employee:");
        scanner.nextLine(); 
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("ID: ");
        id = scanner.nextInt();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

       
        SalariedEmployee salariedEmployee = new SalariedEmployee(name, id, salary);

        
        System.out.println("\nHourly Employee Details:");
        hourlyEmployee.getEmployeeDetails();
        System.out.println("Pay:" + hourlyEmployee.calculatePay());

        System.out.println("\nSalaried Employee Details:");
        salariedEmployee.getEmployeeDetails();
        System.out.println("Pay:" + salariedEmployee.calculatePay());

        scanner.close();
    }
}