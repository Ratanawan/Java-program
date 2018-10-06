package comparatordemo;

import java.util.Comparator;

public class CompareByLength implements Comparator <Student>{
    @Override
    public int compare(Student s1, Student s2)
    {
        return s1.name.length() - s2.name.length();
    }
}
