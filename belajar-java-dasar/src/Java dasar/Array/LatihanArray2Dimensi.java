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
public class LatihanArray2Dimensi {

    public static void main(String[] args) {
        int[][] matriks_a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9,},};

        int[][] matriks_b = {
            {11, 12, 13},
            {14, 15, 16},
            {17, 18, 19},};

        printArray(matriks_a);
        printArray(matriks_b);

        int[][] hasilTambah = tambah(matriks_a, matriks_b);
        printArray(hasilTambah);

        //perkalian matriks
        int[][] matriks_c = {
            {1, 2},
            {3, 4},};

        int[][] matriks_d = {
            {11, 12},
            {13, 14},};

        int[][] hasilKali = kali(matriks_c, matriks_d);
        printArray(hasilKali);
    }

    private static int[][] kali(int[][] matriks1, int[][] matriks2) {
        int baris_1 = matriks1.length;
        int kolom_1 = matriks1[0].length;

        int baris_2 = matriks2.length;
        int kolom_2 = matriks2[0].length;
        
        //jika a.b maka jumlah baris akan mengikuti matriks a, 
        //kolom akan mengikuti kolom b
        int[][] hasil = new int[baris_1][kolom_2];
        int buffer;

        for (int i = 0; i < baris_1; i++) {
            for (int j = 0; j < kolom_2; j++) {
                buffer = 0;
                for (int k = 0; k < kolom_1; k++) {
                    buffer += matriks1[i][k] * matriks2[k][j];
                }
                hasil[i][j] = buffer;
            }
        }
        return hasil;
    }

    private static int[][] tambah(int[][] matriks1, int[][] matriks2) {
        int baris_1 = matriks1.length;
        int kolom_1 = matriks1[0].length;

        int baris_2 = matriks2.length;
        int kolom_2 = matriks2[0].length;

        int[][] hasil = new int[baris_1][kolom_1];

        if (baris_1 == baris_2 && kolom_1 == kolom_2) {
            for (int i = 0; i < baris_1; i++) {
                for (int j = 0; j < kolom_1; j++) {
                    hasil[i][j] = matriks1[i][j] + matriks2[i][j];
                }
            }
        } else {
            System.out.println("Jumlah Baris Atau Kolom Tidak Sama");
        }

        return hasil;
    }

    private static void printArray(int[][] dataArray) {
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(dataArray[i][j]);
                if (j < (kolom - 1)) {
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }

            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
