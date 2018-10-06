package userobjectintotree;

import java.util.Set;
import java.util.TreeSet;

public class UserObjectIntoTree {
    
    public static void main(String[] args) {
        Set MySet = new TreeSet();
        
//        String st1 = new String("Eh");
//        String st2 = new String("Yo");
//        String st3 = new String("GG");
        
        Student st1 = new Student(212, "Banana"); //obj from constructor
        Student st2 = new Student(234, "Apple");
        Student st3 = new Student(456, "Kiwi");
        
        MySet.add(st1);
        MySet.add(st2);
        MySet.add(st3);
        
        System.out.println(MySet.toString());
        
    }
    
}
