package collectionofcollection;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MyMainClass {

    public static void main(String[] args) {
         Map <Integer, LinkedList> map = new  LinkedHashMap <Integer, LinkedList>();
         
         LinkedList <Student>list1 = new LinkedList<Student>();
         LinkedList <Teacher>list2 = new LinkedList<Teacher>();
         
         list1.add(new Student(123, "Wann"));
         list1.add(new Student(124, "Lynan"));
         list1.add(new Student(125, "Sothea"));
         list1.add(new Student(126, "Chhay"));
         list1.add(new Student(127, "Dane"));
         
         list2.add(new Teacher(123, "Mr. Vignesh"));
         list2.add(new Teacher(124, "Mr. Leo"));
         list2.add(new Teacher(125, "Mr. Shiraz"));
         list2.add(new Teacher(126, "Ms. Sheryl"));
         list2.add(new Teacher(127, "Mr. Dinesh"));
         list2.add(new Teacher(128, "Mr. Krish"));
         
         map.put(1, list1);
         map.put(2, list2);
         
         System.out.println(map);
    }
    
}
