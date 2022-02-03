
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MSI
 */
public class LatihanLoop {

    public static void main(String[] args) {
        int a, b, c = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nilai Awal: ");
        a = scan.nextInt();
        System.out.print("Masukkan Nilai Akhir: ");
        b = scan.nextInt();

        //while
//        while (a <= b) {
//            c = c + a;
//            System.out.println("ditambah " + a + "menjadi " + c);
//            a++;
//
//        }
        //dowhile
//        do {
//            c = c + a;
//            System.out.println("ditambah " + a + "menjadi " + c);
//            a++;
//
//        } while (a <= b);

        //for
        for (; a <= b; a++) {
            /*
                1,3,6,10
            */

            c = c + a;
            System.out.println("ditambah " + a + "menjadi " + c);

        }
    }
}
