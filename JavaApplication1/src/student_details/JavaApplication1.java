package student_details;

public class Student {
    
    private int id;
    private int age;
    private int phone;
    private String name; 
    public static String school = "KIT";
    public static String country = "Cambodia";
    
    void input()
    {
        System.out.println("Ask user for input...");
    }
    void output()
    {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phone);
        System.out.println("School: " + school);
        System.out.println("Country: " + country);
    }
}
   
