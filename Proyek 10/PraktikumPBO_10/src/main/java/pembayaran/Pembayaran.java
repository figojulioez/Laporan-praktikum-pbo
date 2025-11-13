/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pembayaran;

/**
 *
 * @author VOSTRO V131
 */
/** Membuat sebuah interface OperasiHitung dimana mendekripsikan perilaku umum tetapi wajib 
 * diterapkan pada class yang mengimplementasikannya
*/
public interface Pembayaran {
    // method umum yang akan diimplementasikan dalam bentuk berbeda - beda.
    double hitungPajak(double harga);
}

