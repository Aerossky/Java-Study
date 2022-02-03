/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class OperatorUnary {

    public static void main(String[] args) {
        //unary = operasi yang dilakukan pada satu  variabel

        //unary + - 
        int angka = 1;
        System.out.printf("unary '+', %d menjadi %d\n", angka, +angka);
        System.out.printf("unary '+', %d menjadi %d\n", angka, -angka);
        
        //unary decrement dan increment
        int angka2 =10;
        angka2++;
        System.out.println("nilai dengan '++' menjadi =  " + angka2);
        
        angka2--;
        System.out.println("nilai dengan '++' menjadi =  " + angka2);
        
        //prefix dan postfix(prefix ditambah dulu, kalau post fix ditambah setelah di tampilkan)
        int a = 5;
        System.out.printf("nilai dengan '++' prefix =  %d\n", ++a);
        int b = 5;
        System.out.printf("nilai dengan '++' postfix =  %d \n", b++);
        System.out.printf("nilai hasil dari prefix menjadi =  %d \n", b);
        
                
    }
}
