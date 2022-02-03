/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class Continue {

    public static void main(String[] args) {

        for (var counter = 1; counter <= 10; counter++) {
            if(counter % 2 == 0){
                continue;
            }
            System.out.println("perulangan Ganjil " + counter);
        }
    }
}
