
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MSI
 */
public class KalkulatorIfElse {

    public static void main(String[] args) {
        //variabel
        float a, b, hasil;
        char c;

        //scanner
        Scanner scan = new Scanner(System.in);

        //input
        System.out.print("Masukkan Bilangan Pertama: ");
        a = scan.nextFloat();

        System.out.print("Masukkan Operator(+, -, *, /): ");
        c = scan.next().charAt(0);

        System.out.print("Masukkan Bilangan Kedua: ");
        b = scan.nextFloat();

        //kondisi
        if (c == '+') {
            hasil = a + b;
            System.out.println("Total: " + hasil);

        } else if (c == '-') {
            hasil = a - b;
            System.out.println("Total: " + hasil);
        }else if (c == '*') {
            hasil = a * b;
            System.out.println("Total: " + hasil);
        }else if (c == '/') {
            hasil = a / b;
            System.out.println("Total: " + hasil);
        }

    }
}
