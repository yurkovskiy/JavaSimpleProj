package yurkovskiy.com.shapes.base;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RectangleTest extends TestCase {

    public RectangleTest(String testName)
    {
        super(testName);
    }

    public static Test suite()
    {
        return new TestSuite(RectangleTest.class);
    }

    public void testRectangleLength()
    {
        Rectangle R = new Rectangle(10.0, 10.0);
        assertEquals(40.0, R.length(), 0.0);
    }

    public void testRectangleSquare()
    {
        Rectangle R = new Rectangle(10.0, 10.0);
        assertEquals(100.0, R.square(), 0.0);
    }

}
