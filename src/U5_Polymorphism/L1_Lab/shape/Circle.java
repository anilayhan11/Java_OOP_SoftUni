package U5_Polymorphism.L1_Lab.shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    protected double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
