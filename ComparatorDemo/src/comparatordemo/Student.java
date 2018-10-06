package comparatordemo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class Student extends Object{

    static int id, age;
    static String name;
    
    //create student constructor
    public Student(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    @Override 
    public String toString()
    {
        return id + " : " + name;
    }
    
    public static void main(String[] args) {
        List <Student>list = new LinkedList <Student>();
        
        Student s1 = new Student(123, "Thepanom Ratanawan", 19);
        Student s2 = new Student(234, "Yok Sakmonysothea", 17);
        
        list.add(s1);
        list.add(s2);
        list.add(s1);
        
        //CompareById
        Comparator<Student> cbi = new CompareById();
        Collections.sort(list, cbi);
        for(Student l: list){
            System.out.println(l);
        }
        
        //CompareByLength
        Comparator cbl = new CompareByLength();
        Collections.sort(list, cbl);
        for(Student l: list)
        {
            System.out.println("List CompareByLength: " + l);
        }
        
        //CompareByName
        Comparator cbn = new CompareByName();
        Collections.sort(list, cbn);
        for(Student l: list)
        {
            System.out.println("List CompareByName: " + l);
        }
    
    }
}
