/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class Array {

    public static void main(String[] args) {

//        String[] arrayString;
//        arrayString = new String[3];
        String[] Stringarray = new String[3];

        Stringarray[0] = "Risky";
        Stringarray[1] = "oi";
        Stringarray[2] = "ei";

        System.out.println(Stringarray[0]);
        System.out.println(Stringarray[1]);
        System.out.println(Stringarray[2]); 

        String[] namaNama = {
            "risky", "ei", "oi"
        };
        System.out.println(namaNama[0]);
        
        int[] arrayInt = new int[]{
            1, 2, 3, 4, 5, 6, 7, 8
        };

        long[] arrayLong = {
            10L, 20L, 30L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        //array dalam array
        String[][] members = {
            {"Risky", "Oi"},
            {"Budi", "nugraha"},
            {"Joko"}  
        };
        System.out.println(members[2][0]);
        System.out.println(members[1][0]);
        
    }

}
