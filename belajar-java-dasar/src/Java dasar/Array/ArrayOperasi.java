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
public class ArrayOperasi {

    public static void main(String[] args) {
        int arrayAngka1[] = {1, 2, 3, 4, 5};

        //merubah array menjadi String
        System.out.println("\nMerubah array menjadi string\n==========");
        printArray(arrayAngka1);

        //mengcopy array
        System.out.println("\nMengcopy array\n==========");
        int arrayAngka2[] = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        System.out.println("\nMengcopy dengan loop");
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\nMecopy dengan copyOf");
        int arrayAngka3[] = Arrays.copyOf(arrayAngka1, 5);
        printArray(arrayAngka1);
        printArray(arrayAngka3);

        System.out.println("\nmencopy dengan copyOfRange");
        int arrayAngka4[] = Arrays.copyOfRange(arrayAngka1, 3, 5);
        printArray(arrayAngka1);
        printArray(arrayAngka4);

        System.out.println("\nFill array\n==========");
        int arrayAngka5[] = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 1);
        printArray(arrayAngka5);

        System.out.println("\nKomparasi array\n==========");
        int arrayAngka6[] = {1, 2, 3, 4, 5};
        int arrayAngka7[] = {1, 2, 3, 4, 10};

        System.out.println("\nmembandingkan antara dua buah array");
        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));

        if (Arrays.equals(arrayAngka6, arrayAngka7)) {
            System.out.println("Array ini sama");
        } else {
            System.out.println("Array ini beda");
        }

        System.out.println("\nmengecek mana array yang lebih besar(1 0 -1)");
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7));

        System.out.println("\nmengecek mana index yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));

        //sort array
        System.out.println("\nSort array\n==========");
        int arrayAngka8[] = {1, 2, 4, 1, 5, 7, 8};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);
        /*
            Tugas
        1.sort kebalik D
        2.operasi tambah antara 2 buah array D
        3.menggabungkan dua buah array menjadi 1
        
         */
        //1.sort array manual
        System.out.println("\nSort array kebalik\n==========");
        int arrayAngka9[] = {4, 1, 5}; //panjang 7

        int temp = 0;
        for (int i = 0; i < arrayAngka9.length; i++) {

            for (int j = 0; j < arrayAngka9.length - 1; j++) {

                if (arrayAngka9[j + 1] < arrayAngka9[j]) {
                    temp = arrayAngka9[j + 1];// 1 
                    arrayAngka9[j + 1] = arrayAngka9[j];// 4 ditukar dengan 1
                    arrayAngka9[j] = temp; // 4 ditukar dengan 1
                }
            }
        }
     
        printArray(arrayAngka9);
        //2.koding dari yang besar

        for (int i = arrayAngka9.length - 1; i >= 0; i--) {
            System.out.print(arrayAngka9[i] + ", ");
        }

        //3.Menggabungkan 2 array jadi 1
        System.out.println("");
        System.out.println("\n2 Array jadi 1\n==========");
        printArray(gabungArray(arrayAngka9, arrayAngka9));
        //tambah
        System.out.println("");
        System.out.println("\nTambah array\n==========");
        System.out.println("hasil " + hitungArray(arrayAngka9, arrayAngka9));

        //menggabungkan 2 buah array
        //search array
        System.out.println("\nSearch array\n==========");

        int angka = 1;
        int posisi = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println("Angka " + angka + " ada di index " + posisi);

    }

    private static void printArray(int dataArray[]) {
        System.out.println("Array = " + Arrays.toString(dataArray));
    }

    private static int hitungArray(int value1[], int value2[]) {
        int a = 0;
        int b = 0;
        for (int i = 0; i <= value1.length - 1; i++) {
            a += value1[i];
        }
        for (int i = 0; i <= value2.length - 1; i++) {
            b += value2[i];
        }

        return a + b;

    }

    private static int[] gabungArray(int array1[], int array2[]) {
        int a = array1.length;
        int b = array2.length;
        int result = a + b;

        int hasil[] = new int[result];

        System.arraycopy(array1, 0, hasil, 0, a);
        System.arraycopy(array2, 0, hasil, a, b);

        Arrays.toString(hasil);

//        int arrayAngka3[] = Arrays.copyOf(arrayAngka1, 5);
        return hasil;

    }
}
