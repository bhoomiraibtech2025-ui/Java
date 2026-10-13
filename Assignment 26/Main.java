package Assignment26;
class MyTask implements Runnable {
    String name;

    MyTask(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

public class Main{
    public static void main(String[] args) {
        MyTask task1 = new MyTask("Thread 1");
        MyTask task2 = new MyTask("Thread 2");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }
}
