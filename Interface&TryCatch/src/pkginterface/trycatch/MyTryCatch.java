package pkginterface.trycatch;

import static java.lang.Math.pow;

public class MyTryCatch implements MyInterface {
    public static int num, i, digit, len, bin, binary, n;
    @Override
    public void MyFunction(int num){
        n = num;
        for(len=0 ; num!=0 ; len++){
            num = num/10;
        }
        System.out.println("There are " + len + " binary digits");
       
        for(i=0; n!=0 && i<len; i++){
            digit = n%10;
            bin = digit*((int)pow(2,i));
            binary += bin;
            n /= 10;
        }
        System.out.println("The decimal value is " + binary);
    }
}
