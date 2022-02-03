/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

import java.util.Scanner;
import java.lang.String;

/**
 *
 * @author risky
 */
public class Operasi_string {

    public static void main(String[] args) {
        String kalimat = "Saya suka makan pisang";

        //mengambil komponen dari string
        System.out.println(kalimat.charAt(5));

        //Substring
        String kata = kalimat.substring(10, 15);
        System.out.println(kata);

        //concatenation (concat)
        String kalimat2 = kata + " bakwan";
        System.out.println(kalimat2);

        kata = kata + " cireng";
        System.out.println(kata);

        //concat dengan non string
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah; //casting
        System.out.println(kalimat3);
        System.out.println(kata + " " + jumlah);

        //lower dan uppercase
        System.out.println(kalimat.toLowerCase());
        System.out.println(kalimat.toUpperCase());

        //replace
        String kalimat4 = kalimat.replace("pisang", "combro");
        System.out.println(kalimat4);
        
        //Compare
        String motor1 = "royal enfield himalaya";
        String motor2 = "kawasaki";
        System.out.println(motor1.compareTo(motor2));//klmnopqr
        System.out.println(motor2.compareTo(motor1));
        
        //equality (persamaan)
        String kataInput = "test";
        String kataTest = "test";

        System.out.println("\nPersamaan pada lokasi string pool");
        if (kataInput == kataTest) {
            System.out.println("Sama");
        } else {
            System.out.println("Tidak sama");
        }

        Scanner inputUser = new Scanner(System.in);
        System.out.print("\nMengambil input String dari user: ");
        kataInput = inputUser.next();
        System.out.println("ini adalah input user: " + kataInput);

        if (kataInput.equals(kataTest)) {
            System.out.println("Sama");
        } else {
            System.out.println("Tidak sama");
        }

    }
}
