/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class LoopingBersarang {

    public static void main(String[] args) {
        //looping bersarang

        //pola1
        System.out.println("Pola 1");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        //pola2  
        System.out.println("Pola 2");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }
            }
            System.out.println("");
        }
        System.out.println("");

        //pola3  
        System.out.println("Pola 3");
        for (int i = 5; i > 0; i--) {

            for (int j = 5; j > 0; j--) {
                if (i >= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("");
                }
            }
            System.out.println("");
        }

        System.out.println("");

        //pola4
        System.out.println("");
        System.out.println("Pola 4");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }
            }
            System.out.println("");
        }
        for (int i = 6; i >= 0; i--) {
            for (int j = 6; j >= 0; j--) {
                if (i >= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("");
                }
            }
            System.out.println("");
        }

        System.out.println("");
        //pola5
        System.out.println("Pola 5");
        for (int i = 5; i >= 0; i--) {

            for (int j = 0; j < 5; j++) {
                if (i <= j) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
        for (int i = 4; i >= 0; i--) {
            for (int j = 5; j > 0; j--) {
                if (i >= j) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

}
/*
i horizontal
j vertikal

dalam pola 4 yang dimainin ada di line85 dan 96

*/