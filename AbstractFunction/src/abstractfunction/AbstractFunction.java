/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfunction;

/**
 *
 * @author Admin
 */
public abstract class AbstractFunction {
    abstract void run();
    
    public static void main(String[] args) {
        System.out.println("This is main function");
        AbstractFunction obj = new ();
        obj.run();
    }
    
}
