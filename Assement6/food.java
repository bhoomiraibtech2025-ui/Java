package Assement6;

public class food {

    String restName = "Pizza Hut, Bavdhan";
    String foodName = "UNLIMITED Pizza";
    double price = 300;

    // Inner class
    class orderDetails {

        void displayDetails() {
            System.out.println("Restaurant Name: " + restName);
            System.out.println("Food Name: " + foodName);
            System.out.println("Price: " + price);
        }
    }

    // Interface
    interface deliveryDetails {
        void status();
    }

    // Anonymous class
    void deliveryStatus() {

        deliveryDetails d = new deliveryDetails() {

            public void status() {
                System.out.println("Food is out for delivery.");
            }
        };

        d.status();
    }

    public static void main(String[] args) {

        food f = new food();

        orderDetails order = f.new orderDetails();
        order.displayDetails();

        f.deliveryStatus();
    }
}