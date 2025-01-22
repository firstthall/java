package com.belajar;

import java.util.Scanner;

public class pasien {
    public static void main(String[] args) {
        int Nomor, Usia;
        String Nama, Alamat;
        Scanner Input = new Scanner(System.in);
        System.out.println("DATA PASIEN"); 
        System.out.println("----------");
        
        System.out.println("Nomor : ");
        Nomor = Input.nextInt();

        System.out.println("Nama : ");
        Nama = Input.next();

        System.out.println("Alamat : ");
        Alamat = Input.next();

        System.out.println("Usia : ");
        Usia = Input.nextInt();


        // Menampilkan data
        System.out.println("DATA PASIEN"); 
        System.out.println("----------");

        System.out.println("Nomor : " + Nomor);
        System.out.println("Nama : " + Nama);
        System.out.println("Alamat : " + Alamat);
        System.out.println("Usia : " + Usia);
        
    }
}    

