/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author MSI
 */
import java.util.Arrays;

public class ArrayAlamat {

    public static void main(String[] args) {
        int arrayAngka1[] = {1, 2, 3, 4, 5};
        int arrayAngka2[] = new int[5];

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        arrayAngka2 = arrayAngka1;

        System.out.println("Array 1 " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 " + Arrays.toString(arrayAngka2));

        arrayAngka1[0] = 300;
        arrayAngka2[4] = 400;

        System.out.println("Array 1 " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 " + Arrays.toString(arrayAngka2));
        
        ubahArray(arrayAngka1);
        System.out.println("Array 1" + Arrays.toString(arrayAngka1));
        System.out.println("Array 2" + Arrays.toString(arrayAngka2));
    }

    private static void ubahArray(int[] dataArray) {
        dataArray[0] = 125;
    }

}
