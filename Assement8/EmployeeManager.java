package Assement8;

class Employee {

    String name = "Bhoomi";
    double salary = 30000;

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

class Manager extends Employee {

    double bonus = 10000;

    void displayManager() {

        super.displayEmployee();

        System.out.println("Manager Bonus: " + bonus);
        System.out.println("Total Salary: " + (super.salary + bonus));
    }
}

public class EmployeeManager {

    public static void main(String[] args) {

        Manager m = new Manager();

        m.displayManager();
    }
}
