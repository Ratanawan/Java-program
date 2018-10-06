package timetable;

import java.util.Scanner;

public class TimeTableClass implements TimeTableInterface
{
    public int NUM, i, Sum;
    @Override
    public void timetable(){
        System.out.println("Input a number to display time table:");
        Scanner s = new Scanner(System.in);
        NUM = s.nextInt();
        
        for(i=1; i<=10; i++){
            Sum = i*NUM;
            System.out.println(NUM + "*" + i + "=" + Sum);
        }
    }
   
}
