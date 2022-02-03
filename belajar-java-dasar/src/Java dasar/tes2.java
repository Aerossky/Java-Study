
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MSI
 */
public class tes2 {

      public static void main(String[] args) {
        //scanner
        Scanner s = new Scanner(System.in);

        //variable
        int b = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        System.out.print("Angka: ");
        b = s.nextInt();
        int[] a = new int[b];
//        for (int i = 1; i <= b; ++i) {
//            if (i % 15 == 0 && a.length <= 15) {
//                System.out.println(i + " ");
//            } else if (a.length <= 15) {
//                System.out.print(i + " ");
//            }
//
//        }


//x 15
        if (a.length <= 15) {
            for (int i = 1; i <= b; ++i) {
                if (i % 15 == 0) {
                    System.out.println(i + " ");
                } else {
                    System.out.print(i + " ");
                }

            }

//y            
        } else if (a.length >= 15) {
            int spasi = 1;
            for (int i = 16; i <= b; ++i) {

                if (spasi % 12 == 0) {
                    System.out.println(i + " ");
                } else {
                    System.out.print(i + " ");
                }

                spasi++;
            }

        }

        /*    
        
        for (int i = 1; i <= b; ++i) {
            if (i % 15 == 0 && a.length <= 15) {
                System.out.println(i + " ");
            } else if (a.length <= 15) {
                System.out.print(i + " ");
            } else if (i % 12 == 0) {
                System.out.println(i + " ");
            }

           

        }*/
    }
}
