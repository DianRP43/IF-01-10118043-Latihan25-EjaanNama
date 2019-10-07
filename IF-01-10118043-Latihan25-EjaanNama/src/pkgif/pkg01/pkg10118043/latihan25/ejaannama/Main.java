/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        char C;
        
        System.out.println("Masukan Sesuatu : ");
        Scanner scanner = new Scanner(System.in);
        nama = scanner.nextLine();
        
        for (int i = 0; i < nama.length(); i++) {
        C = nama.charAt(i);
        System.out.println("Huruf ke-"+i+" adalah"+C);
            
        }
        
        
    }
    
}
