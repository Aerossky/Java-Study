/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;

/**
 *
 * @author MSI
 */
public class recursiveMethod {

    public static void main(String[] args) {
        System.out.println(faktorial(5));

        System.out.println("Recursive " + faktorialRecursive(5));
        
        loop(10000);
    }

    static int faktorial(int value) {
        var result = 1;

        for (int counter = 1; counter <= value; counter++) {
            result *= counter;
        }

        return result;
    }

    static int faktorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * faktorial(value - 1);
        }
    }

    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }

}
