/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

import java.lang.StringBuilder;

/**
 *
 * @author risky
 */
public class String_Builder {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("halo");
        printdata(builder);
        //append
        builder.append(" semuanya");
        printdata(builder);

        builder.append(" warga Surabaya");
        printdata(builder);

        //insert
        builder.insert(19, " kota");
        printdata(builder);
        
        //delete
        builder.delete(19, 24);
        printdata(builder);
        
        //merubah karakter pada index tertentu
        builder.setCharAt(14, 'W');
        printdata(builder);
        
        //replace
        builder.replace(20, 28, "Bandung");
        printdata(builder);
        
        //casting menjadi String
        String kalimat = builder.toString();
        System.out.println("");
        System.out.println(kalimat);
        int adressString = System.identityHashCode(kalimat);
        System.out.println("adress " + Integer.toHexString(adressString));
    }

    private static void printdata(StringBuilder databuilder) {
        System.out.println("");
        System.out.println("Data = " + databuilder);
        System.out.println("Panjang = " + databuilder.length());
        System.out.println("Kapasitas = " + databuilder.capacity());
        //capacity default ada di 16
        int adressBuilder = System.identityHashCode(databuilder);
        System.out.println("adress = " + Integer.toHexString(adressBuilder));
    }
}
