class Restaurant {

    static int totalOrders = 0;

    // Dine-in
    static void bill(double amount) {
        totalOrders++;
        System.out.println("Dine-in Bill - Rs. " + amount);
    }

    // Takeaway
    static void bill(double amount, double packing) {
        totalOrders++;
        System.out.println("Takeaway Bill - Rs. " + (amount + packing));
    }

    // Delivery
    static void bill(double amount, double packing, double delivery) {
        totalOrders++;
        System.out.println("Delivery Bill - Rs. " + (amount + packing + delivery));
    }

    public static void main(String[] args) {

        bill(500);                 // Dine-in
        bill(500, 30);             // Takeaway
        bill(500, 30, 50);          // Delivery

        System.out.println("Total Orders = " + totalOrders);
    }
}