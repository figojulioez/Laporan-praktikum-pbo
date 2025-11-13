/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembayaran;

/**
 *
 * @author VOSTRO V131
 */
/** Memmbuat kelas Elektronik yang mengimplementasikan Pembayaran
 * yang artinya semua yang ada pada interface Pembayaran merupakan perilaku wajib dari 
 * kelas Elektronik
**/ 
public class Elektronik implements Pembayaran {
    // Mengubah bentuk dari interface Pembayaran dengan cara berbeda
    @Override
    public double hitungPajak(double harga) {
        return harga * 10 / 100;
    }
}
    