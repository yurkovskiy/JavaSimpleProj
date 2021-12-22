package yurkovskiy.com.shapes.base;

public class Rectangle implements IShape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double length() {
        return 2 * (this.width + this.height);
    }

    public double square() {
        return (this.width * this.height);
    }

}
