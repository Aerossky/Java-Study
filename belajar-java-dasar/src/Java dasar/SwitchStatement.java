/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class SwitchStatement {

    public static void main(String[] args) {

        var nilai = "e";

        switch (nilai) {

            case "A":
                System.out.println("Wow, anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
                    
            
        }
        
        //switch lambda
        switch (nilai){
            
            case "A"->System.out.println("Wow, anda lulus dengan baik");
            case "B", "C" -> System.out.println("Nilai anda cukup baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default ->{
                System.out.println("Mungkin anda salah jurusan");
                System.out.println("Tetap berjuang solusinya");
            }
        }
        
        //switch yield
         String  ucapan;
         ucapan = switch (nilai) {
            case "A":
                yield "Wow, anda lulus dengan baik1";
            case "B":
            case "C":
                yield "Nilai anda cukup baik";
            case "D":
                yield "Anda tidak lulus";
            default:
                yield "Mungkin anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}
