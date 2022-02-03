/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Arrays;

/**
 *
 * @author risky
 */
public class Array2Dimensi {

    public static void main(String[] args) {
        int[][] array_2d = {
            {1, 2},
            {3, 4}
        };
        printArray2D(array_2d);

        //cara membuat array 2 dimensi dengan deklarasi
        // int[baris][kolom]
        int[][] arrayAngka = new int[5][4];
        printArray2D(arrayAngka);

     

        //looping foreach
        System.out.println("Foreach");
        for (int[] baris : arrayAngka) {
            for (int angka : baris) {
                System.out.print(angka + ", ");
            }
            System.out.print("\n");

        }

        //array untuk pembuktian
        System.out.println("Array Tes");
        int[][] array2d_2 = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9},
            {10, 11, 12, 13, 14, 15},
        };
        printArray2DD(array2d_2);
    }

    private static void printArray2D(int[][] dataArray) {
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }

    private static void printArray2DD(int[][] dataArray) {
        for (int[] baris : dataArray) {
            System.out.println(Arrays.toString(baris));
        }
    }
}
