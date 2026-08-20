class Student {

    String name;
    int rollNo;

    // Default Constructor
    Student() {
        name = "Apurva";
        rollNo = 1;
    }

    // Parameterized Constructor
    Student(String n, int r) 
    {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println();
    }

    public static void main(String[] args) {

        // Object using default constructor
        Student s1 = new Student();

        // Object using parameterized constructor
        Student s2 = new Student("Rahul", 2);

        s1.display();
        s2.display();
    }
}