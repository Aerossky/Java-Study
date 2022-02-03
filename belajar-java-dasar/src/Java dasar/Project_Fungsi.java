/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
import java.util.*;

public class Project_Fungsi {

    public static void main(String[] args) {
        //scanner
        Scanner s = new Scanner(System.in);

        //variable
        int p, l;

        //tampilan
        System.out.print("Panjang: ");
        p = s.nextInt();
        System.out.print("Lebar: ");
        l = s.nextInt();

        //panggil function persegi
        Project_Fungsi obj = new Project_Fungsi();
        obj.persegi(p, l);
   
        //luas
        int luas = obj.luas(p, l);
        System.out.println("luas: " + luas);
        //keliling
        int keliling = obj.keliling(p, l);
        System.out.println("Keliling: " + keliling);
    }


    private void persegi(int panjang, int lebar) {

        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

    private int luas(int panjang, int lebar) {
        int hasil = panjang * lebar;
        return hasil;

    }

    private int keliling(int panjang, int lebar) {
        int hasil = (panjang + lebar) * 2;
        return (hasil);

    }
}
