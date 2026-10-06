/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.selviproject;

/**
 *
 * @author taqin
 */
public class Selviproject {

    public static void biodata(String nama, String prodi) { 
        System.out.println("Nama : " + nama); 
        System.out.println("Prodi : " + prodi); 
    } 
    
    public static int penjumlahan(int a, int b, int c) { 
        return a + b + c; 
    } 
    public static int pengurangan(int a, int b) { 
        return a - b; 
    } 
    public static int perkalian(int a, int b) { 
        return a * b; 
    } 
    public static double pembagian(double a, double b) {
        return a / b; 
    } 
    public static void main(String[] args) {
        String nama = "Dwi Selvia Putri Ramadhani"; 
        String prodi = "Teknik Informatika 3-C"; 
        biodata(nama, prodi); 
        
        int hasil = penjumlahan(24, 9, 6); 
        System.out.println("Penjumlahan : " + hasil); 
        hasil = pengurangan(2006, 2000); 
        System.out.println("Pengurangan : " + hasil); 
        hasil = perkalian(9, 6); 
        System.out.println("Perkalian : " + hasil); 
        double hasilBagi = pembagian(24, 4); 
        System.out.println("Pembagian : " + hasilBagi); 

// Kombinasi operasi 
        hasil = 9 * 6 + 10; 
        System.out.println("Perkalian lalu penjumlahan : " + hasil); 
        hasil = 9 * 6 - 10; 
        System.out.println("Perkalian lalu pengurangan : " + hasil); 
        hasil = 20 / 4 * 5; 
        System.out.println("Pembagian lalu perkalian : " + hasil); 
        hasil = 9 * 6 + 10 - 5; 
        System.out.println("Perkalian, penjumlahan, pengurangan : " + hasil); 
        hasil = 20 / 4 * 5 + 10; 
        System.out.println("Pembagian, perkalian, penjumlahan : " + hasil);
        
    }
}
