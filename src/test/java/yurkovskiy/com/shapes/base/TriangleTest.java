package yurkovskiy.com.shapes.base;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class TriangleTest extends TestCase {
    public TriangleTest(String testName)
    {
        super(testName);
    }

    public static Test suite()
    {
        return new TestSuite(TriangleTest.class);
    }

    public void testTriangleLength()
    {
        Triangle T = new Triangle(3.0, 4.0, 5.0);
        assertEquals(12.0, T.length(), 0.0);
    }

    public void testTriangleSquare()
    {
        Triangle T = new Triangle(3.0, 4.0, 5.0);
        assertEquals(6.0, T.square(), 0.0);
    }
}
