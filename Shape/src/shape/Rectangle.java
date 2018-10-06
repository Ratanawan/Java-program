package shape;

import java.util.Scanner;

public class Rectangle extends Shapes
{
    @Override
    public void area()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Finding area of rectangle.");
        System.out.println("Input the width: ");
        width = s.nextFloat();
        System.out.println("Input the height: ");
        height = s.nextFloat();
        area = width * height;
        System.out.println("The area of rectangle is: " + area);
    }
//  Main function is in MainClass
}
