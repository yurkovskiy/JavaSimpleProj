package yurkovskiy.com.shapes.base;

public class Circle implements IShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double length() {
        return 2 * Math.PI * this.radius;
    }

    public double square() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
