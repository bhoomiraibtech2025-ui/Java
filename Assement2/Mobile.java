

class Mobile {

    String brand;
    String model;
    double price;

    // Default Constructor
    Mobile() {
        brand = "Samsung";
        model = "Galaxy A15";
        price = 18000;
    }

    // Parameterized Constructor
    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Copy Constructor
    Mobile(Mobile m) {
        this.brand = m.brand;
        this.model = m.model;
        this.price = m.price;
    }

    // Display Method
    void display() {
        System.out.println("Brand  : " + brand);
        System.out.println("Model  : " + model);
        System.out.println("Price  : Rs. " + price);
    }

    public static void main(String[] args) {

        // Object using Default Constructor
        Mobile m1 = new Mobile();

        // Object using Parameterized Constructor
        Mobile m2 = new Mobile("Apple", "iPhone 15", 65000);

        // Duplicate Object using Copy Constructor
        Mobile m3 = new Mobile(m2);

        System.out.println("Mobile 1 - Default Constructor");
        m1.display();

        System.out.println();

        System.out.println("Mobile 2 - Parameterized Constructor");
        m2.display();

        System.out.println();

        System.out.println("Mobile 3 - Duplicate Record");
        m3.display();
    }
}