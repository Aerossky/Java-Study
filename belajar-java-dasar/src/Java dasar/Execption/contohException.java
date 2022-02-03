/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Execption;

import java.io.FileInputStream;

/**
 *
 * @author risky
 */
public class contohException {

    public static void main(String[] args) throws Exception {

        FileInputStream inputFile = new FileInputStream("input.txt");
        System.out.println((char) inputFile.read());
    }
}
