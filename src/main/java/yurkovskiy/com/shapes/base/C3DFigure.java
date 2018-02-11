package yurkovskiy.com.shapes.base;

public class C3DFigure {
    private IShape base;
    private double height;

    public C3DFigure(IShape base, double height) {
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return this.base.square() * this.height;
    }
}
