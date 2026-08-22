package Assement12;
import java.util.Scanner;

class Student {

    String name;
    String course;
    int rollNo;

    public void displayStudent() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        name = scanner.nextLine();

        System.out.println("Enter Course: ");
        course = scanner.nextLine();

        System.out.println("Enter Roll No: ");
        rollNo = scanner.nextInt();

        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class Faculty {

    String name;
    String department;
    int experience;

    public void displayFaculty() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Faculty Name: ");
        name = scanner.nextLine();

        System.out.println("Enter Department: ");
        department = scanner.nextLine();

        System.out.println("Enter Experience in years: ");
        experience = scanner.nextInt();

        System.out.println("Faculty Details");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Experience: " + experience + " years");
    }
}

public class CollegeManagement {

    public static void main(String[] args) {

        Student s = new Student();
        Faculty f = new Faculty();

        s.displayStudent();

        System.out.println();

        f.displayFaculty();
    }
}