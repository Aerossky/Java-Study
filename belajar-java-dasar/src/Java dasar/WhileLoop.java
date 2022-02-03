/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class WhileLoop {

    public static void main(String[] args) {
        int a =0;
        boolean kondisi = true;
        
        while (kondisi ) {
            System.out.println("While Loop ke " + a);
            a++;
            if(a == 10){
                kondisi = false;
            }
        }
        System.out.println("Ini adalah akhir program");
    }
}
