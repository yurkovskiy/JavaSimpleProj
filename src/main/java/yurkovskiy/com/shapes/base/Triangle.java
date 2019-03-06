package yurkovskiy.com.shapes.base;

public class Triangle implements IShape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double length() {
        return a + b + c;
    }

    @Override
    public double square() {
        double p = this.length() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
