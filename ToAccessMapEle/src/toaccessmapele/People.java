/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toaccessmapele;

public class People {
    String name, gender;
    int age;
    
    public People(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    @Override
    public String toString()
    {
        return "\nName : " + name + "\nAge : " + age + "\nGender : " + gender;  
    }
}
