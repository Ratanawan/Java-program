package userobjectintotree;

public class Student implements Comparable <Student> //Student is the object, we put it as generic because we want to pass Student obj
{                                                   //user define data type
    int id;
    String name;
    
    public Student(int id, String name) //constructor
    {
        this.id = id;
        this.name = name;
    }
    
    public String toString(){
        return id + " : " + name; 
    }
    
    @Override
    //hidden code
    // str1.compareTo(str2)
    //actual process
    //if not override, it will throw ClassCastException
    //we override this because we have 2 arguements don't know what to compare.
    
    public int compareTo(Student t)  //passing obj
    {
        if(this.id > t.id){ //this.id is the id of str1 //t.id is the id of str2
            return 1;
        }
        else if(this.id < t.id)
        {
            return -1;
        }
        else 
            return 0;
    }
}
