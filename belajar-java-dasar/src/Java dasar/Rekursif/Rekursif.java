package Rekursif;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
import java.util.*;

public class Rekursif {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        int nilai = s.nextInt();

        System.out.println("anda memasukkan nilai: " + nilai);

        printNilai(nilai);//dia membawa nilai ke parameter

        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = " + jumlah);

        int faktorial = hitungFaktorial(nilai);
        System.out.println("Hasil Faktorial = " + faktorial);

    }

//    faktorial
    private static int hitungFaktorial(int parameter) {
        System.out.println("Faktorial = " + parameter);
        
        /*
            untuk cara menghitung dia parameter kan 1 2 3 4 5 maka dia hitugn dari
            5 4 3 2 1 = maka jadi 120
        */

        if (parameter == 1) {
            return parameter;
        }

        return parameter * hitungFaktorial(parameter - 1);
    }

//  Jumlah
    private static int jumlahNilai(int parameter) {
        System.out.println("Parameter = " + parameter);

        if (parameter == 0) {
            return parameter;
        }

        return parameter + jumlahNilai(parameter - 1);
    }

//urutan nilai
    private static void printNilai(int parameter) {
        System.out.println("nilai" + parameter);

        if (parameter == 0) {
            return;
        }

        parameter--;
        printNilai(parameter);
    }
}
