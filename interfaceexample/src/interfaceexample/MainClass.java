package InterfaceExample;

public class MainClass 
{
    public static void main(String[] args) 
    {
        Interface obj = new Class();
        obj.myRule1();
        obj.myRule2();
        //Secure coz if you press Ctrl and Click the function, it will link to interface which has only abstract function.
        
        Class obj1 = new Class(); // Not secure
        obj1.myRule1();
        obj1.myRule2();
        //if you press Ctrl and Click the functions it will link to Class which has the details of the fucntion
    }
}
