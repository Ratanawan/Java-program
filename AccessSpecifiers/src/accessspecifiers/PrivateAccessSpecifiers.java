package accessspecifiers;

public class PrivateAccessSpecifiers {
    private final int data = 1;
    private void msg(){
        System.out.println("I am private" + data);
    }
}


