/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class FungsiVoid {

    public static void main(String[] args) {
        double number = 10;
        int hasil = 0;

        for (int i = 1; i < number; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
             
                hasil = i + hasil;
               
            }

        }
         System.out.println(hasil);
    }
}
