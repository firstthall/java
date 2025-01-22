package com.belajar;

    import java.io.Console;

public class jika {
    public static void main(String[] args) {
        int Umur;

        Console con = System.console();

        System.out.print("Inputkan usia: ");
        Umur = Integer.parseInt(con.readLine());


        if (Umur <= 17) {
            System.out.println("anda masih kecil");
        }
        else {
            System.out.println("anda sudah dewasa");
        }
    }
}    

