/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;

/**
 *
 * @author MSI
 */
public class methodReturn {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = sum(a, b);

        System.out.println("Total " + c);

        System.out.println(hitung(100, "+", 200));
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2) {

        switch (operasi) {

            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;

        }

    }
}
