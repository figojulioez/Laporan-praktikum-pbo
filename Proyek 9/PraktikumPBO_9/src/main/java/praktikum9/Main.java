/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author VOSTRO V131
 */
public class Main {
    public static void main(String[] args) {
        // Inisiasi class mobil dan sepeda dengan mereferensi pada kendaraan
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        
        // Menjalankan method berjalan dan info pada objek mobil
        mobil.berjalan();
        mobil.info();
        
        // Menjalankan method berjalan dan info pada objek sepeda
        sepeda.berjalan();
        sepeda.info();
        
    }
}
