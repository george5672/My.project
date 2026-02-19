package HW13;

interface Shape {
    double getArea();
}

class Circle implements Shape {
    private double radius;
    Circle(double radius) { this.radius = radius; }
    @Override public double getArea() { return Math.PI * radius * radius; }
}

class Square implements Shape {
    private double side;
    Square(double side) { this.side = side; }
    @Override public double getArea() { return side * side; }
}

class Triangle implements Shape {
    private double base, height;
    Triangle(double base, double height) { this.base = base; this.height = height; }
    @Override public double getArea() { return 0.5 * base * height; }
}

class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(7.0),
                new Square(5.0),
                new Triangle(4.0, 10.0)
        };

        System.out.println("Total area: " + calculateTotalArea(shapes));
    }

    static double calculateTotalArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
}