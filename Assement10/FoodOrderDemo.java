package Assement10;

abstract class FoodOrder {

    double amount;

    FoodOrder(double amount) {
        this.amount = amount;
    }

    abstract void calculateBill();
}

class DineInOrder extends FoodOrder {

    DineInOrder(double amount) {
        super(amount);
    }

    void calculateBill() {
        double total = amount + 50;
        System.out.println("Dine-In Order Bill: " + total);
    }
}

class TakeAwayOrder extends FoodOrder {

    TakeAwayOrder(double amount) {
        super(amount);
    }

    void calculateBill() {
        double total = amount + 20;
        System.out.println("Take-Away Order Bill: " + total);
    }
}

public class FoodOrderDemo {

    public static void main(String[] args) {

        DineInOrder dineIn = new DineInOrder(500);
        TakeAwayOrder takeAway = new TakeAwayOrder(500);

        dineIn.calculateBill();
        takeAway.calculateBill();
    }
}