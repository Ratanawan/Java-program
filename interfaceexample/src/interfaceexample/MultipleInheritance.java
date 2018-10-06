package interfaceexample;

public class MultipleInheritance implements Inter1, Inter2 {
    @Override
    public void Wann1(){
        System.out.println("Wann1");
    }
    @Override
    public void Wann2(){
        System.out.println("Wann2");
    }
    
    public static void main(String[] args) {
        Inter1 obj = new MultipleInheritance(); //create object reference only for parent Inter1
        obj.Wann1(); //can only access Inter1
        obj.Wann2(); //can't access Wann2() coz it's in Inter2
        
        //or create an anynomous class to override both function
        Inter1 obj1 = new Inter1(){
            @Override
            public void Wann1(){
                System.out.println("This is in ananymous class");
            }
            @Override
            public void Wann2(){
                System.out.println("This is Wann2 in ananymous class");
            }
        };
        obj1.Wann1();
        obj1.Wann2();
    }
    
}
