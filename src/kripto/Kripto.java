/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kripto;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author mbah
 */
public class Kripto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        algoritma al = new algoritma();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Plaintext: ");
        String pt = input.nextLine();
        System.out.println("Masukkan Key: ");
        int key = input.nextInt();
        char[] plaintext = pt.toCharArray();
        al.setPlaintext(plaintext);
        al.setKey(key);
        
        for(char out: al.getchipertext())
            System.out.print(out);
        
        
    }
    
}
