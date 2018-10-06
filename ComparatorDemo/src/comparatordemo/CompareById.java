package comparatordemo;

import java.util.Comparator;

public class CompareById implements Comparator <Student>{
  
    @Override 
    public int compare(Student s1, Student s2)
    {
        int a = s1.id - s2.id;
        if(a < 0)
        {
            return 1;
        }
        else if(a > 0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
