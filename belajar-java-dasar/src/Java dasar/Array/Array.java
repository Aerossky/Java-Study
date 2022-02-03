/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

//library array java
import java.util.Arrays;

/**
 *
 * @author MSI
 */
public class Array {

    public static void main(String[] args) {

        //assigment
        // tipedata [] nama = { komponen }
        System.out.println("assignment array");

        //              index 1  2  3  4
        //                    |  |  |  |
        int arrayInteger[] = {0, 1, 2, 3};

        arrayInteger[0] = 11;

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger [1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        //Deklarasi
        //TipeData[] nama = new int [JumlahArray];
        System.out.println("Deklarasi Array");
        float arrayFloat[] = new float[5];

        arrayFloat[3] = 10.5f;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);
        
        //pakai librabry untuk cek isi array
        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(Arrays.toString(arrayFloat));

    }
}
