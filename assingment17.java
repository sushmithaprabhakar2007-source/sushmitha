abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        System.out.println("Circle area = " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    void area() {
        System.out.println("Rectangle area = " + (length * width));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();

        c.area();
        r.area();
    }
}
