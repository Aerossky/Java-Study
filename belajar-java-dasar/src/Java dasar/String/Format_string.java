/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

import java.util.Formatter;

/**
 *
 * @author risky
 */
public class Format_string {

    public static void main(String[] args) {
        String nama = "udin";
        int umur = 17;

        //output : nama saya adalah Udin , umur saya 17 
        System.out.println("Nama saya adalah " + nama + " umur saya adalah " + umur);

        // cara dengan menggunakan format String
        System.out.printf("Nama saya adalah %s, umur %s adalah %d", nama, nama, umur);

        /**
         * conversion : f = floating point, d = integer c = character s = string
         * b = Boolean
         *
         */
        //struktur format = %[argumen_index$][flags][width][.precision]conversion
        //[argumen_index$]
        System.out.println("\n[argumen_index$]");

        //udin, whai udin, kemana saja kamu udin
        System.out.printf("%1$s, wahai %1$s, kemana saja kamu %1$s?\n", nama);

        //umur udin berapa?, udin menjawab: 17, wah masih muda ya umurnya 17
        System.out.printf("\numuur %1$s berapa?, \n%1$s menjawab: %2$d\nWah masih muda ya umurnya %2$d", nama, umur);

        //[flags]
        System.out.println("\n[flags]");
        int int1 = 5;
        int int2 = 8;
        int hasil = int1 - int2;
        System.out.printf("%d - %d = %+d", int1, int2, hasil);

        //[width]
        System.out.println("\n[width]");
        int int3 = 1000;
        System.out.println("INTEGER");
        System.out.printf("%d\n", int3);
        System.out.printf("%5d\n", int3);
        System.out.printf("%-5d\n", int3);// flags = "-", artinya rata kiri
        System.out.printf("%+5d\n", int3);// flags akan mengambil slot
        System.out.printf("%+-6d\n", int3);// flags bisa digabungkan
        System.out.printf("% 10d\n", int3);
        System.out.printf("%010d\n", int3);//flags = "0", jadi semua angka di depan 0
        System.out.printf("%+010d\n", int3);
        int int4 = 1000000000;
        System.out.printf("%-,10d\n", int4);//flags = ",", menandakan delimeter per seribu

        System.out.println("\nFLOATING POINT");
        float float1 = 1.543f;
        System.out.printf("%f\n", float1);
        System.out.printf("%+9f\n", float1);//floating point akan mengambil width dengan 6 desimal

        //[.precision]
        System.out.println("\n[.precision]");
        float float2 = 15.678f;
        System.out.printf("%f\n", float2);
        System.out.printf("%.1f\n", float2);
        System.out.printf("%.2f\n", float2);
        System.out.printf("%8.2f\n", float2);//gabungkan dengan width
        System.out.printf("%08.2f\n", float2);//gabungkan dengan width dan flag

        //contoh
        String nama2 = "ucup";
        float IPK = 3.7812378978914f;

        //struktur format = %[argumen_index$][flags][width][.precision]conversion
        System.out.printf("\nIPK %1$s berapa?, \n%1$s: saya dapat %2$+5.2f\n", nama, IPK);

        //kesimpulan
        //save format ini ke dalam variable string
        String info_biasa = "nama " + nama2 + ", IPK = " + IPK;
        System.out.println("biasa -> " + info_biasa);

        String info_format = String.format("nama: $s, IPK = %2$+5.2f", nama2, IPK);
        System.out.println("string format -> " + info_format);
        
        //save format ini ke dalam string builder
        StringBuilder builder_info = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder_info);
        
        formatBuilder.format("nama: %s, IPK = %2$+5.2f", nama2, IPK);
        System.out.print("string builder format -> " + builder_info);
    }
}
