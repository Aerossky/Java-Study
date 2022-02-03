
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MSI
 */
public class FibbonacciLoop {

    public static void main(String[] args) {
        //scanner        
        Scanner scan = new Scanner(System.in);
        //variable
        int a, b, c, d;

        //input
        System.out.print("Masukkan Nilai Fibonacci: ");
        a = scan.nextInt();

        //proses
        b = 0;
        c = 1;
        d = 1;

        for (int i = 0; i < a; i++) {
            System.out.println("Nilai ke " + (i + 1) + " adalah " + d);
            d = b + c;
            b = c;
            c = d;
            /*
                b dapat darimana, c dapat darimana
            
            */            
        }

    }
}
