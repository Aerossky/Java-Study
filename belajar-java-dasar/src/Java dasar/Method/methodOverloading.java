/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;

/**
 *
 * @author MSI
 */
public class methodOverloading {

    public static void main(String[] args) {
        sayHello();
        sayHello("Risky");
        sayHello("Risky", "G");
        
        float hasil;
        hasil = tambah(4.5f, 5);
        
        System.out.println("hasil tambah " + hasil);
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstname, String lastname) {
        System.out.println("Hello " + firstname + " " + lastname);
    }

    private static float tambah(float a, int b) {
        return a + b;
    }

}
