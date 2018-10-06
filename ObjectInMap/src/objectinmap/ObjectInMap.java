package objectinmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ObjectInMap {

    public static void main(String[] args) {
        Map <String, Student> hm = new HashMap<String, Student>();
        //creating obj for Studnet constructor
        Student s1 = new Student(1, "Lynan");
        Student s2 = new Student(2, "Sothea");
        Student s3 = new Student(3, "Panha");
        Student s4 = new Student(4, "ChekNak");
        
        //adding elements into map
        hm.put("one", s1);
        hm.put("two", s2);
        hm.put("three", s3);
        hm.put("four", s4);
        hm.put("five", new Student(5 , "Ratanawan")); //directly creating obj in the value
        
        //printing out the map
        System.out.println(hm);
        
        //converting key into the Set
        Set key = hm.keySet();
        System.out.println(key);
        
        //converting values into the Collection
        Collection value = hm.values();
        System.out.println(value);
    }
    
}
