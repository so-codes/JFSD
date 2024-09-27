package Practical_3;

class Shape {
    double area;

    public double getArea() {
        return area;
    }
}

class Circle extends Shape {
    public Circle(double radius) {
        area = Math.PI * radius * radius;
    }
}

class Square extends Shape {
    public Square(double side) {
        area = side * side;
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

public class A1First {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        Square square = new Square(10);

        BoundedShape<Circle> boundedCircle = new BoundedShape<>(circle);
        BoundedShape<Square> boundedSquare = new BoundedShape<>(square);

        System.out.println("Circle area: " + boundedCircle.getArea());
        System.out.println("Square area: " + boundedSquare.getArea());
    }
}