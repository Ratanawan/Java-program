package sppedtest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpeedTest {

    public void process(List <Integer> list)
    {
        for(int i = 0; i<100000; i++){
            list.add(i);
        }
    }
    
    public static void main(String[] args) {
        
        ArrayList <Integer> al = new <Integer> ArrayList();
        LinkedList <Integer> ll = new <Integer> LinkedList();
       
        long start = System.currentTimeMillis();
        SpeedTest st = new SpeedTest();
        st.process(ll);
        long end = System.currentTimeMillis();
        
        System.out.println("Time elapse is: " + (end-start));
        
    }
    
}
