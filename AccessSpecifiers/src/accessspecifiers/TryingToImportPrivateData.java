
import accessspecifiers.PrivateAccessSpecifiers;

public class TryingToImportPrivateData{
    public static void main(String args[]){
        PrivateAccessSpecifiers obj = new PrivateAccessSpecifiers();
        System.out.println(obj.msg); //compile time error
        obj.msg(); //compile time error
    }
}






