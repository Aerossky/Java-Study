/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;

/**
 *
 * @author MSI
 */
public class methodVariableArgument {

    public static void main(String[] args) {

//        int values[] = {80, 50, 50, 90};
//        sayCongrats("Risky", values);

        //Tanpa Array
        sayCongrats("Risky", 80,90,100,50,100);
    }

    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }

        var finalvalue = total / values.length;

        if (finalvalue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }

    }
}
