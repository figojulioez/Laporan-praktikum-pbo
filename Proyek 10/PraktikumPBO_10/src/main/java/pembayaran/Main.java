/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembayaran;

/**
 *
 * @author VOSTRO V131
 */
// Mendeklarasikan class main sebagai class yang menjadi awal program
public class Main {
    public static void main(String[] args) {
        // Mengistansi class Elektronik
        Pembayaran laptop = new Elektronik();
        // Menjalankan method hitungPajak pada class laptop
        System.out.println("Harga barang : " + 500000.00);
        System.out.println("Total pajak : " + laptop.hitungPajak(500000.00));
        
        // Mengistansi class Makanan
        Pembayaran roti = new Makanan();
        // Menjalankan method hitungPajak pada class Makanan
        System.out.println("Harga barang : " + 10000.00);
        System.out.println("Total pajak : " + roti.hitungPajak(10000.00));
        
        
    }
}

