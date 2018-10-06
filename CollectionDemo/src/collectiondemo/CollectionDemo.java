package collectiondemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionDemo {

    static int a=10,b=0,c;
    String name = new String("wann");
    
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        LinkedList hs = new LinkedList();
        
        hs.add("SAlaza1");
            hs.add("index1");
            hs.add(212); //throw exception
            hs.add("SaLaza2");
            hs.add("Salaza2");
            hs.add("Salaza2");
            hs.add("Salaza3");
            hs.add("Salaza4");
            hs.add("Salaza5");
            hs.add("Kid");
            
            al.add("SAlaza1");
            al.add(212); //throw exception
            al.add("SaLaza2");
            al.add("Salaza2");
            al.add("Salaza2");
            al.add("Salaza3");
            al.add("Salaza4");
            al.add("Salaza5");
            al.add("Kid");
            
            System.out.println(hs);
            System.out.println(al);
            
//        try{ //check condition
//            
//        }
//        catch(ClassCastException cce){
//            try{
//                c = b/a;
//            }
//            catch(ArithmeticException e){
//                System.out.println("ArithmeticException");
//            }
//            System.out.println("ClassCastException");
//        }
//        
    }
    
}
