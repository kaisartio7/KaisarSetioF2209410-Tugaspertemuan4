/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas3pbo;

/**
 *
 * @author Acer
 */
 import java.util.Scanner;
public class Tugas31PBO {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca batas awal dan batas akhir
        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();
        
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();
        
        // Inisialisasi variabel untuk menyimpan jumlah deret bilangan genap
        int jumlahGenap = 0;
        
        // Menghitung jumlah deret bilangan genap
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                jumlahGenap += i;
            }
        }
        
        // Menampilkan hasil
        System.out.println("Jumlah deret bilangan genap dari " + batasAwal + " hingga " + batasAkhir + " adalah: " + jumlahGenap);
        
        scanner.close();
    }
}

