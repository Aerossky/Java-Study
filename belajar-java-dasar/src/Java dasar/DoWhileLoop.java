/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class DoWhileLoop {

    public static void main(String[] args) {

//        contoh1
        
//        var counter = 11;
//
//        do {
//            System.out.println("Perulangan " + counter);
//            counter++;
//        } while (counter <= 10);

//        contoh2
        int a = 4;
        boolean kondisi = true;

        do {

            System.out.println("do while ke- " + a);
            a++;
            if (a == 1) {
                kondisi = false;
            }
        } while (kondisi);

    }
}
