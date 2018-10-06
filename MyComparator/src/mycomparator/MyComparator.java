package mycomparator;

import java.util.Set;
import java.util.TreeSet;

public class MyComparator {

    public static void main(String[] args) {
        Set set = new TreeSet();
        
        MyConstructor member1 = new MyConstructor(1, "Chanyeol");
        MyConstructor member2 = new MyConstructor(2, "Kyungsoo");
        MyConstructor member3 = new MyConstructor(3, "Beakhyun");
        MyConstructor member4 = new MyConstructor(4, "Kai");
        MyConstructor member5 = new MyConstructor(5, "Sehun");
        MyConstructor member6 = new MyConstructor(6, "Suho");
        MyConstructor member7 = new MyConstructor(7, "Chen");
        MyConstructor member8 = new MyConstructor(8, "Xiumin");
        MyConstructor member9 = new MyConstructor(9, "Kris");
        MyConstructor member10 = new MyConstructor(10, "Tao");
        MyConstructor member11 = new MyConstructor(11, "Luhan");
        MyConstructor member12 = new MyConstructor(12, "Lay");
        
        set.add(member1);
        set.add(member2);
        set.add(member3);
        set.add(member4);
        set.add(member5);
        set.add(member6);
        set.add(member7);
        set.add(member8);
        set.add(member9);
        set.add(member10);
        set.add(member11);
        set.add(member12);
        
        System.out.println(set);
    }
    
}
