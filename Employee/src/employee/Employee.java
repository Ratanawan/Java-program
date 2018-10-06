package employee;

import java.util.Scanner;

public class Employee {
    private int eID;
    private String eName;
    private float basic, da, hra, gross;
    
    public static void main(String[] args)
    {
        Employee e = new Employee();
        e.input();
        e.process();
        e.output();
    }
    
    public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter eID: ");
        eID = s.nextInt();
        System.out.println("Enter Name: ");
        eName = s.next();
        System.out.println("Enter basic: ");
        basic = s.nextFloat();
    }
    
   public void process()
   {
       da = (float) (basic * 0.08);
       hra = (float) (basic * 0.16);
       gross = da + hra;
   }
   
   public void output()
   {
       System.out.println("eID: " + eID);
       System.out.println("eName: " + eName);
       System.out.println("Basic: " + basic);
       System.out.println("da: " + da);
       System.out.println("hra: " + hra);
       System.out.println("gross: " + gross);
   }
    
}
