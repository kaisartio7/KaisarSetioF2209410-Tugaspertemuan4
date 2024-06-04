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
public class Tugas32PBO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca dua bilangan
        System.out.print("Masukkan bilangan pertama (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Masukkan bilangan kedua (b): ");
        int b = scanner.nextInt();
        
        // Menghitung GCD menggunakan Algoritma Euclidean
        int gcd = hitungGCD(a, b);
        
        // Menampilkan hasil
        System.out.println("Pembagi Bersama Terbesar (GCD) dari " + a + " dan " + b + " adalah: " + gcd);
        
        scanner.close();
    }
    
    // Fungsi untuk menghitung GCD menggunakan Algoritma Euclidean
    public static int hitungGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


