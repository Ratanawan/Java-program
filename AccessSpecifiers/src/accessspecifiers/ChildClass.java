package accessspecifiers;

public class ChildClass extends ProtectedAccessSpecifiers {
    public void MyFunction()
    {
        System.out.println("I got an Apple from my parent");
    }
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.ForChild();
        obj.MyFunction();
    }
}
