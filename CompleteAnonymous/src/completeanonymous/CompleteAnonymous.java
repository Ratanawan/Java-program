package completeanonymous;

public class CompleteAnonymous {

    void demo(){
        
    }
    public static void main(String[] args) {
        new CompleteAnonymous()
        {
            @Override 
            public void demo()
            {
                System.out.println("I am anonymous.");
            }
            public void SubClassAnonymous()
            {
                System.out.println("SubClassAnonymous.");
            }
        }.demo(); //can call only one function at a time
}
