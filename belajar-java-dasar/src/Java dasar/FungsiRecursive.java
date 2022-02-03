/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
import java.util.*;

public class FungsiRecursive {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = userInput.nextInt();
        System.out.println("Anda memasukkan nilai = " + nilai);

        printNilai(nilai);//mengirim inputan scanner ke parameter printNilai
        //mengirim inputan scanner ke parameter jumlahNilai
        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = " + jumlah);
    }

    //fungsi rekursif sederhana
    private static int jumlahNilai(int parameter) {
        System.out.println("parameter = " + parameter);

        if (parameter == 0) {
            return parameter;
        }

        return parameter + jumlahNilai(parameter - 1);
    }

    private static void printNilai(int parameter) {
        System.out.println("nilai = " + parameter);

        if (parameter == 0) {
            return;
        }

        parameter--;
        printNilai(parameter);
    }
}
