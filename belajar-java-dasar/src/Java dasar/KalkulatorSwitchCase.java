
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MSI
 */
public class KalkulatorSwitchCase {

    public static void main(String[] args) {
        //variabel
        float a, b, hasil;
        String c;

        //scanner
        Scanner scan = new Scanner(System.in);

        //input
        System.out.print("Masukkan Bilangan Pertama: ");
        a = scan.nextFloat();

        System.out.print("Masukkan Operator(+, -, *, /): ");
        c = scan.next();

        System.out.print("Masukkan Bilangan Kedua: ");
        b = scan.nextFloat();

        //proses
        switch (c) {
            case "+" -> {
                hasil = a + b;
                System.out.println("Total: " + hasil);
            }
            case "-" -> {
                hasil = a - b;
                System.out.println("Total: " + hasil);
            }
            case "*" -> {
                hasil = a * b;
                System.out.println("Total: " + hasil);
            }
            case "/" -> {
                hasil = a / b;
                System.out.println("Total: " + hasil);
            }
            default ->
                System.out.println("Operator tidak ditemukan");

        }
    }
}
