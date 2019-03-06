package yurkovskiy.com.shapes.base;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CircleTest extends TestCase {

    public CircleTest(String testName)
    {
        super(testName);
    }

    public static Test suite()
    {
        return new TestSuite(CircleTest.class);
    }

    public void testCircleleLength()
    {
        Circle C = new Circle(10.0);
        assertEquals(2 * Math.PI * 10.0, C.length(), 0.0);
    }

    public void testCircleSquare()
    {
        Circle C = new Circle(10.0);
        assertEquals(Math.PI * Math.pow(10.0, 2), C.square(), 0.0);
    }

}
