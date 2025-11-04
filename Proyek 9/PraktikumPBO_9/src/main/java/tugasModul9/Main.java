/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasModul9;

/**
 *
 * @author VOSTRO V131
 */
public class Main {
    public static void main(String[] args) {
        // Inisiasi class anjing dan kucing dengan mereferensi pada hewan
        Hewan anjing = new Anjing();
        Hewan kucing = new Kucing();
        
        // Menjalankan method suara dan info pada objek anjing
        anjing.suara();
        anjing.info();
        
        // Menjalankan method berjalan dan info pada objek kucing
        kucing.suara();
        kucing.info();
        
    }
}
