package Assement8;

class Vehicle {

    String vehicleNumber = "MH12AB1234";
    String vehicleName = "Car";

    void displayVehicle() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Name: " + vehicleName);
    }
}

class CarInsurance extends Vehicle {

    double insuranceAmount = 15000;

    void displayInsurance() {

        System.out.println("Car Insurance");

        System.out.println("Vehicle Number: " + super.vehicleNumber);
        System.out.println("Vehicle Name: " + super.vehicleName);
        System.out.println("Insurance Amount: Rs. " + insuranceAmount);
    }
}

class BikeInsurance extends Vehicle {

    double insuranceAmount = 8000;

    void displayInsurance() {

        System.out.println("Bike Insurance");

        System.out.println("Vehicle Number: " + super.vehicleNumber);
        System.out.println("Vehicle Name: " + super.vehicleName);
        System.out.println("Insurance Amount: Rs. " + insuranceAmount);
    }
}

public class VehicleInsurance {

    public static void main(String[] args) {

        CarInsurance car = new CarInsurance();
        BikeInsurance bike = new BikeInsurance();

        car.displayInsurance();

        System.out.println();

        bike.displayInsurance();
    }
}