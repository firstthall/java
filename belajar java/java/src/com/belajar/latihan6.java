package com.belajar;
import javax.swing.JOptionPane;
public class latihan6 {
    public static void main(String[] args) {
        for(int i=0; i <= 4; i++){
        String nama = "";
        nama = JOptionPane.showInputDialog("masukkan nama anda: ");
        String msg = "Hello! " + nama + "!";
        JOptionPane.showMessageDialog(null, msg);
        }
        
    }
}
