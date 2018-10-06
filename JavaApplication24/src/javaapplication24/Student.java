package javaapplication24;

import java.util.Objects;

public class Student extends Object
{
    int id;
    String name;
    
    public Student(int id, String name) //constructor
    {
        this.id = id;
        this.name = name;
    }
    
    public int hashCode()
    {
        int hash = 10;
        hash = 10 * hash + this.id;
        hash = 10 * hash + Objects.hashCode(this.name);
        return hash;
    }
    
    @Override 
    public boolean equals(Object obj)
    {
        //this s1.equal(s2);
        //s1 == s2;
        if(this == obj)
        {
            return true;
        }
        if(obj == null)
        {
            return false;
        }
        if(getClass() != obj.getClass()) //s1 == s2; s1 == s3
        {
            return false;
        }
        
        final Student other = (Student) obj;
        if(this.id != other.id)
        {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString()
    {
        return id + " : " + name;
    }
}
