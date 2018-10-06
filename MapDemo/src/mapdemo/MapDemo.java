package mapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {
        Map hm = new HashMap();
        Map lm = new LinkedHashMap();
        Map <Character, String>tm = new <Character, String>TreeMap();
        
        hm.put(1, "Wann");
        hm.put(2, "Chhay");
        hm.put(2, "Sothea");
        hm.put('a', "Lynan");
        hm.put(1, "Salaza212");
        hm.put(4, "Salaza212");
        
        //printing out the map
        System.out.println(hm);
        
        //To convert the key into the set to print the key seperately
        Set <Integer> set = hm.keySet();
        System.out.println(set);
        
        //To convert the values into the collection to print the values alone
        //convert it into the collection because it allow duplicate value
        Collection <String> col = hm.values();
        
        tm.put('a', "Apple");
        tm.put('b', "Banana");
        tm.put('c', "Coconut");
        
        System.out.println(tm);
        
    }
    
}
