/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class forEach {

    public static void main(String[] args) {

        String[] names = {
            "Risky", "Adalah", "Kenedi",
            "Programmer", "jaman", "now"
        };

        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("");
        System.out.println("FOR EACH");
        for (var name : names ) {
            System.out.println(name);
        }
    }
}
