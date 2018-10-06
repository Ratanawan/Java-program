package shape;

import java.util.Scanner;

public class Circle extends Shapes 
{
    @Override
    public void area()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Finding area of circle");
        System.out.println("Input the radius of the circle: ");
        r = s.nextInt();
        area = (float)(3.14*r*r);
        System.out.println("The area of the circle: " + area);
    }
//   Main function is in MainClass
}
