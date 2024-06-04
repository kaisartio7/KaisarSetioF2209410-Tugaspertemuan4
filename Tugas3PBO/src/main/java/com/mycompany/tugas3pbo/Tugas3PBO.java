/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas3pbo;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class Tugas3PBO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca nilai N
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();
        
        // Mengulang menuliskan teks sebanyak N kali
        for (int i = 0; i < N; i++) {
            System.out.println("Saya senang belajar bahasa Java");
        }
        
        scanner.close();
    }
}


    
