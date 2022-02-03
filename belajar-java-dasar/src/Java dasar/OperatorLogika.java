/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class OperatorLogika {
    public static void main(String[] args) {
        
        boolean a, b, c;
        
        
        
        System.out.println("==== XOR(^)====");
        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + "^" + b + "=" + c);
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + "^" + b + "=" + c);
        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + "^" + b + "=" + c);
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + "^" + b + "=" + c);
     
    }
}
