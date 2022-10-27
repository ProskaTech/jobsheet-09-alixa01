
package com.mycompany.js9;

/**
 *
 * @author 21343040_alixa arivya tofer
 */

//Percobaan 1 pass by value

public class latihan1 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        
        test(i);
        System.out.println(i);
    }
    
    public static void test(int j){
        j = 33;
    }
}