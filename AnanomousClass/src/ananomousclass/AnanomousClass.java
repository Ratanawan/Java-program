package ananomousclass;

public class AnanomousClass 
{
    public void demo1()
    {
        System.out.println("This is demo1 function.");
    }
    public void demo2()
    {
        System.out.println("This is demo2 function.");
    }
    public static void main(String[] args) {
        AnanomousClass a = new AnanomousClass() //ananomous class
        {
           @Override
            public void demo1()
           {
               System.out.println("this is ananomous class which override demo1()");
           }
        };
        a.demo1();
        a.demo2();
        
        AnanomousClass b = new AnanomousClass()
        {
            @Override
            public void demo2()
            {
                System.out.println("This is ananomous class which override demo2()");
            }
        };
        b.demo1();
        b.demo2();
        
        a = b; //assign b address to a 
        
        a.demo1();
        a.demo2();
    }
    
}
