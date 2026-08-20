package Assement7;

class Shape {

    void area() {
        System.out.println("Area of Shape");
    }
}

class Circle extends Shape {

    double radius = 5;

    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {

    double length = 10;
    double width = 5;

    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

public class ShapeApplication {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.area();

        Rectangle r = new Rectangle();
        r.area();
    }
}
