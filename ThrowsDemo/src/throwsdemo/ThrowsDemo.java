package throwsdemo;

public class ThrowsDemo{
    public void CallSayHello(AnotherClass ac) {
        ac.demo(); //throw exception
    }
    public void demo2(AnotherClass ac) {
        CallSayHello(ac);
    }
    public void demo1(AnotherClass ac) {
        demo2(ac);
    }
    public static void main(String[] args) throws NullPointerException{
        ThrowsDemo td = new ThrowsDemo();
        AnotherClass ac = null;
        try{
            td.demo1(ac);
        }
        catch(NullPointerException n){
            System.out.println("Exception...");
        }
    }
}