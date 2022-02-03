
import java.io.FileInputStream;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author risky
 */
public class IoStream {
    public static void main(String[] args) throws IOException{
        FileInputStream fileinput = new FileInputStream("D:/Program/input.txt");
        System.out.println((char)fileinput.read());
    }
}
