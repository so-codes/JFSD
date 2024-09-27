package Practical_3;

interface Shape {
    double getArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}

class BoundedShape<T extends Shape> {
    private T shape;

    public BoundedShape(T shape) {
        this.shape = shape;
    }

    public double getArea() {
        return shape.getArea();
    }
}

public class A2Second {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(10);

        BoundedShape<Circle> boundedCircle = new BoundedShape<>(circle);
        BoundedShape<Square> boundedSquare = new BoundedShape<>(square);

        System.out.println("Circle area: " + boundedCircle.getArea());
        System.out.println("Square area: " + boundedSquare.getArea());
    }
}