/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author VOSTRO V131
 */
// Mendeklarasikan class main sebagai class yang menjadi awal program
public class Main {
    public static void main(String[] args) {
        // Mengistansi class penjumlahan
        OperasiHitung penjumlahan = new Penjumlahan();
        // Menjalankan method hitung pada class penjumlahan
        System.out.println("Penjumlahan : " + penjumlahan.hitung(10,5));
        
        // Mengistansi class penjumlahan
        OperasiHitung pengurangan = new Pengurangan();
        // Menjalankan method hitung pada class penjumlahan
        System.out.println("Pengurangan : " + pengurangan.hitung(10,5));
        
        
    }
}
