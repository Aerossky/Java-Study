/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Arrays;

public class ArrayForEach {

    public static void main(String[] args) {

        int arrayAngka[] = {11, 12, 13, 14, 15, 16, 17};

        //System.out.println(Arrays.toString(arrayAngka));
        // looping standard
        System.out.println("Looping Standard");
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println("Index ke- " + i + " adalah " + arrayAngka[i]);
        }

        //looping khusus untuk collection <- array
        System.out.println("Looping Foreach");
        int satu = 1;
        for (int angka : arrayAngka) {
            System.out.println("Index ke- " + satu + " adalah " + angka);
            satu++;
        }
    }
}
