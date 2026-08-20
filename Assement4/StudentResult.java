package Assement4;
import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks of Java: ");
        String javaMarks = sc.nextLine();

        System.out.print("Enter marks of Python: ");
        String pythonMarks = sc.nextLine();

        System.out.print("Enter marks of Database: ");
        String databaseMarks = sc.nextLine();

        int m1 = Integer.parseInt(javaMarks);
        int m2 = Integer.parseInt(pythonMarks);
        int m3 = Integer.parseInt(databaseMarks);

        int total = m1 + m2 + m3;

        System.out.println("\n--- Student Result ---");
        System.out.println("Student Name: " + name);
        System.out.println("Java Marks: " + m1);
        System.out.println("Python Marks: " + m2);
        System.out.println("Database Marks: " + m3);
        System.out.println("Total Marks: " + total);

        sc.close();
    }
}