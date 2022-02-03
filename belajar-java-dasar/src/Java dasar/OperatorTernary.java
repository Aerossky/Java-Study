
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class OperatorTernary {
    public static void main(String[] args) {
        //ternary operator
        int input,x;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan nilai");
        input = scan.nextInt();
        
        //variable x = ekspresi ? statement true : statement false
        x = (input == 10) ? (input * input):(input/2);
        
        System.out.println("hasilnya " + x);
        
        
        
    }
}
