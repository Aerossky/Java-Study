/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class Fungsi {

    public static void main(String[] args) {
        //variable
        int x, y;

        x = 10;
        y = hitung(x);
        System.out.println("X = " + x + ",Y = " + y);

        x = 20;
        y = hitung(x);
        System.out.println("X = " + x + ",Y = " + y);

        x = 30;
        y = hitung(x);
        System.out.println("X = " + x + ",Y = " + y);

    }

    public static int hitung(int input) {
        int hasil;

        hasil = (input + 2) * input;
        return hasil;
    }
}
