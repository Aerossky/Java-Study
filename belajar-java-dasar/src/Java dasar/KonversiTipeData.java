/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class KonversiTipeData {

    public static void main(String[] args) {

        //program
        //int
        int nilaiInt = 450;
        System.out.println(nilaiInt);

        //long
        long nilaiLong = nilaiInt;
        System.out.println(nilaiLong);

        //byte(tidak dapat menagkap data karena maks hanya 256/2)
        byte nilaiByte = (byte) nilaiInt;
        System.out.println(nilaiByte);
        System.out.println("Nilai maks" + Byte.MAX_VALUE);
        System.out.println("Nilai min" + Byte.MIN_VALUE);

        //casting pembagian
        int a = 10;
        int b = 4;

        float c = (float) a / b;
        System.out.println("hasil " + c);
    }
}
