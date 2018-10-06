package toaccessmapele;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ToAccessMapEle {

    public static void main(String[] args) {
        Map <Integer, LinkedList> MyMap = new HashMap <Integer, LinkedList>();
        
        LinkedList <People> l1 = new LinkedList <People>();
        LinkedList <People> l2 = new LinkedList <People>();
        
        People wann = new People("Thepanom Ratanawan", 19 , "Female");
        People sothea = new People("Yok Sakmonysothea", 17, "Female");
        
        l1.add(wann);
        l1.add(sothea);
        l2.add(new People("Chean Pisethpanha", 18, "Male"));
        l2.add(new People("Kang Sokheng", 17, "Male"));
        
        MyMap.put(1,l1);
        MyMap.put(2,l2);
        
//        System.out.println(MyMap);
        
        //Map is an interface
        //Entry is also an interface inside Map interface
        //entrySet() is a function inside Entry interface
        for(Map.Entry <Integer, LinkedList> e: MyMap.entrySet()) 
        {
            System.out.println(e);
            System.out.println("-------------------------");
        }
    }
    
}
