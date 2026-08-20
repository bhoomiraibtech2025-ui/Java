class Cal {

    static int count = 0;

    // Method for addition of integers
    int add(int a, int b) {
        count++;
        return a + b;
    }

   
    double add(double a, double b) {
        count++;
        return a + b;
    }

    public static void main(String[] args) {

        Cal c = new Cal();

        // Integer addition
        int result1 = c.add(10, 20);

        // Decimal addition
        double result2 = c.add(10.5, 20.5);

        System.out.println("Addition of integers = " + result1);
        System.out.println("Addition of decimals = " + result2);

        System.out.println("Total calculations performed = " + count);
    }
}