package yurkovskiy.com;

import yurkovskiy.com.shapes.base.Circle;
import yurkovskiy.com.shapes.base.Rectangle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        System.out.println("Playing with geometry");

        Rectangle R = new Rectangle(10.0, 10.0);
        System.out.println("The length of Rectangle with sides: w: 10, h: 10: is: "+ R.length());
        System.out.println("The square of Rectangle is: "+ R.square());

        Circle C = new Circle(10.0);
        System.out.println("The length of Circle with radius 10 is: "+ C.length());
        System.out.println("The square of Circle is: "+ C.square());


    }
}
