/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembayaran;

/**
 *
 * @author VOSTRO V131
 */
/** Memmbuat kelas Makanan yang mengimplementasikan Pembayaran
 * yang artinya semua yang ada pada interface Pembayaran merupakan perilaku wajib dari 
 * kelas Makanan
**/ 
public class Makanan implements Pembayaran {
    // Mengubah bentuk dari interface Pembayaran dengan cara berbeda
    @Override
    public double hitungPajak(double harga) {
        return harga * 5 / 100;
    }
}
  