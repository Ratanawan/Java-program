/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.SequenceInputStream;
import java.util.Enumeration;

/**
 *
 * @author Admin
 */
public class maini {
    public static void main(String[] args){
        SequenceInputStream sis = new SequenceInputStream("D:\\a.txt", "D:\\b.txt");
        Enumeration e =Collections.enumeration(); 
    }
}
