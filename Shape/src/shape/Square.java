package shape;

import java.util.Scanner;

public class Square extends Shapes
{
    @Override
    public void area()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Finding area of square");
        System.out.println("Input the side of the square: ");
        a = s.nextInt();
        area = a*a;
        System.out.println("The area of square is " + area);
    }
    //main function is in the MainClass
}
