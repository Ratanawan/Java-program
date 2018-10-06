package accessingmapelements;

import java.util.HashMap;
import java.util.Map;

public class AccessingMapElements {

    public static void main(String[] args) {
        Map <Integer, String> map = new HashMap<Integer, String>();
        
        map.put(1, "Wann");
        map.put(2, "Lynan");
        map.put(3, "Sothea");
        
        for(Map.Entry<Integer, String> e: map.entrySet())
        {
            System.out.println(e);
            System.out.println("________________________");
        }
    }
    /*
    public interface Map
    {
        public interface Entry<Integer, String>
        {
            Entry e = map.entrySet();
        }
    }
    */
}
    

