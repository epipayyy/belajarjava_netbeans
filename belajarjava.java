/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.selviproject;

/**
 *
 * @author taqin
 */
public class belajarjava {
    public static void main(String[] args) {
    biodata();
    int hasil1 = penjumlahan(24,30);
    int hasil2 = pengurangan(15,6);
    int hasil3 = perkalian(3,3);
    int hasil4 = pembagian(15,3);
            System.out.println("hasil penjumlahan =" +hasil1);
            System.out.println("hasil pengurangan =" +hasil2);
            System.out.println("hasil perkalian =" +hasil3);
            System.out.println("hasil pembagian =" +hasil4);
    }
    
    public static int penjumlahan(int a,int b){
    return a+b;
    }
    public static int pengurangan(int a,int b){
    return a-b;
    }
    public static int perkalian(int a,int b){
    return a*b;
    }
    public static int pembagian(int a,int b){
    return a/b;
    }
    
    public static void biodata(){
    System.out.println(".........");
    System.out.println("Dwi Selvia Putri Ramadhani");
    System.out.println(".........");
    } 
}
