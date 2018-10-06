package listtest;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List list = new LinkedList();
        
        list.add(123);
        list.add(1);
        list.add("Wann");
        list.add(212);
        
        System.out.println(list);
        
        Collections.sort(list);
        
        System.out.println("list");
    }
    
}
