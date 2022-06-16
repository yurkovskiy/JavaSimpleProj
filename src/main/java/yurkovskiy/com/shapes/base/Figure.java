package yurkovskiy.com.shapes.base;

public class Figure {
    private IShape base;
    private double height;

    public Figure(IShape base, double height) {
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return this.base.square() * this.height;
    }
}
