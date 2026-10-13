package Assignment26;

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

class DepositTask implements Runnable {
    Bank b;

    DepositTask(Bank b) {
        this.b = b;
    }

    public void run() {
        b.deposit();
    }
}

class WithdrawTask implements Runnable {
    Bank b;

    WithdrawTask(Bank b) {
        this.b = b;
    }

    public void run() {
        b.withdraw();
    }
}

public class Main2 {
    public static void main(String[] args) {
        Bank b = new Bank();

        Thread t1 = new Thread(new DepositTask(b));
        Thread t2 = new Thread(new WithdrawTask(b));

        t1.start();
        t2.start();
    }
}
