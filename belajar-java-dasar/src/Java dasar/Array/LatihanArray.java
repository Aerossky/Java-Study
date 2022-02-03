/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Arrays;

/**
 *
 * @author MSI
 */
public class LatihanArray {

    public static void main(String[] args) {
        int[] arrayAngka1 = {1, 2, 4, 5, 7, 8, 9, 1, 3};
        int[] arrayAngka2 = {3, 5, 2, 6, 7, 3, 0, 9, 10};

        //penjumlahan
        int[] arrayHasil1 = tambahArray(arrayAngka1, arrayAngka2);
        printArray(arrayAngka1, "Array 1");
        printArray(arrayAngka2, "Array 2");
        printArray(arrayHasil1, "Penjumlahan");

        //Menggabungkan 2 buah array
        int[] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];

        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayHasil2[i] = arrayAngka1[i];
        }

        //harus mulai dari 9
        for (int i = 0; i < arrayAngka2.length; i++) {
            arrayHasil2[arrayAngka1.length + i] = arrayAngka2[i];
        }
        printArray(arrayAngka1, "Array 1");
        printArray(arrayAngka2, "Array 2");
        printArray(arrayHasil2, "Penjumlahan");

        //reverse
        printArray(arrayAngka1, "Array1");
        reverse(arrayAngka1);


    }

    private static void reverse(int[] dataArray) {
        Arrays.sort(dataArray);
        System.out.print("Reverse ");
        for (int i = dataArray.length - 1; i > 0; i--) {
            System.out.print(dataArray[i] + ", ");

        }

    }

    private static void printArray(int[] dataArray, String massage) {
        System.out.println(massage + " " + Arrays.toString(dataArray));
    }

    private static int[] tambahArray(int[] arrayInt1, int[] arraysInt2) {
        int[] arrayHasil = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++) {
            arrayHasil[i] = arrayInt1[i] + arraysInt2[i];
        }
        return arrayHasil;
    }
}
