package Rekursif;

import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MSI
 */
public class rekursifBercabang {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int nilai = s.nextInt();
        int nilai_fibonacci = fibonacci(nilai, "atas");
        System.out.println("Nilai fibonacci ke -" + nilai + " adalah " + nilai_fibonacci);
    }

    private static int fibonacci(int n, String daun) {

        System.out.println("daun " + daun);
        System.out.println("Fibonacci ke - " + n);
        if (n == 1 || n == 0) {
            return n;

        } else {
            return fibonacci(n - 1, "Kiri") + fibonacci(n - 2, "Kanan");
        }
    }
}
