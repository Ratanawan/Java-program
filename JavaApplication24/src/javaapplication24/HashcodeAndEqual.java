package javaapplication24;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashcodeAndEqual 
{
    public static void main(String[] args) 
    {
        Set <Student> set = new LinkedHashSet<Student>();
        // b obj = new a();
        
        
        
        Student s1 = new Student(1, "Moonlight");
        Student s2 = new Student(1, "Moonlight");
        Student s3 = new Student(1234, "Moonlight");
        Student s4 = new Student(12, "Sunlight");
        
        
        
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        
        
        s1.equals(s2);
        System.out.println(set.toString());
    }
}