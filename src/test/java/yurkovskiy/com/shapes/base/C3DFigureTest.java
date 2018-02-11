package yurkovskiy.com.shapes.base;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class C3DFigureTest extends TestCase {

    public C3DFigureTest(String testName)
    {
        super(testName);
    }

    public static Test suite()
    {
        return new TestSuite(CircleTest.class);
    }

    public void testCylinderVolume()
    {
        C3DFigure cylinder = new C3DFigure(new Circle(10.0), 10.0);
        assertEquals(Math.PI * Math.pow(10.0, 2) * 10.0, cylinder.volume(), 0.0);
    }

    public void testCubusVolume()
    {
        C3DFigure cubus = new C3DFigure(new Rectangle(10.0, 10.0), 10.0);
        assertEquals(1000.0, cubus.volume(), 0.0);
    }

}
