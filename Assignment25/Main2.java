package Assignment25;

class Bank {
    int balance = 1000;

    synchronized void deposit() {
        balance = balance + 500;
        System.out.println("Deposited: 500");
        System.out.println("Balance: " + balance);
    }

    synchronized void withdraw() {
        balance = balance - 300;
        System.out.println("Withdrawn: 300");
        System.out.println("Balance: " + balance);
    }
}

class DepositThread extends Thread {
    Bank b;

    DepositThread(Bank b) {
        this.b = b;
    }

    public void run() {
        b.deposit();
    }
}

class WithdrawThread extends Thread {
    Bank b;

    WithdrawThread(Bank b) {
        this.b = b;
    }

    public void run() {
        b.withdraw();
    }
}

public class Main2{
    public static void main(String[] args) {
        Bank b = new Bank();

        DepositThread t1 = new DepositThread(b);
        WithdrawThread t2 = new WithdrawThread(b);

        t1.start();
        t2.start();
    }
}
