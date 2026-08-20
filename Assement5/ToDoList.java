package Assement5;
import java.util.ArrayList;

class ToDoList {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<String>();

        // Add tasks
        tasks.add("Complete Java Assignment");
        tasks.add("Study for Exam");
        tasks.add("Attend Lecture");

        // Display tasks using StringBuffer
        StringBuffer list = new StringBuffer();

        list.append("TO-DO LIST\n");

        for (String task : tasks) {
            list.append("- " + task + "\n");
        }

        System.out.println(list);
    }
}
