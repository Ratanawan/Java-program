package studentconstructor;

public class StudentConstructor
{
    private int id;
    private String name;
    private int age;
    private String email; //instance variable
    
    public StudentConstructor(int id,   name, int age, String email)//automatic variable
            
    {
        this.id = id;
        this.name = name;
        this.age =  age;
        this.email = email; //local variable
    }
    
    public void print()
    {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Email: " + this.email);
    }
    
    public static void main(String[] args)
    {
        StudentConstructor s = new StudentConstructor(212, "Thepanom Ratanawan", 19, "thepanomratanawan17@kit.edu.kh");
        s.print();
    }
}
