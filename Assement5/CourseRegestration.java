package Assement5;
import java.util.ArrayList;
import java.util.Scanner;

class CourseRegistration {

    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. View Courses");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter course name: ");
                String course = sc.nextLine();

                courses.add(course);
                System.out.println("Course added successfully.");

            } else if (choice == 2) {

                System.out.print("Enter course name to remove: ");
                String course = sc.nextLine();

                if (courses.remove(course)) {
                    System.out.println("Course removed successfully.");
                } else {
                    System.out.println("Course not found.");
                }

            } else if (choice == 3) {

                StringBuffer list = new StringBuffer();

                list.append("Registered Courses:\n");

                if (courses.isEmpty()) {
                    list.append("No courses registered.");
                } else {
                    for (String course : courses) {
                        list.append("- " + course + "\n");
                    }
                }

                System.out.println(list);

            } else if (choice == 4) {

                System.out.println("Thank you!");
                break;

            } else {

                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}