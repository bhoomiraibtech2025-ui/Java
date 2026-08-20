package Assement6;

public class Vehicle {

    String brand = "Toyota";
    String model = "Fortuner";
    int year = 2025;

    // Inner class to display vehicle details
    class VehicleDetails {

        void displayDetails() {
            System.out.println("Vehicle Details:");
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
        }
    }

    // Method using Anonymous class
    void performAction() {

        Runnable action = new Runnable() {

            public void run() {
                System.out.println("Vehicle is starting...");
            }
        };

        action.run();
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle();

        VehicleDetails details = v.new VehicleDetails();
        details.displayDetails();

        v.performAction();
    }
}