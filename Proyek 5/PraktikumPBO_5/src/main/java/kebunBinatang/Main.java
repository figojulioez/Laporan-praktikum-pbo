/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kebunBinatang;

/**
 *
 * @author VOSTRO V131
 */
public class Main {
    public static void main (String[] args) {
        // Instansi class Kucing
        Kucing anggora = new Kucing("Beni", "Anggora");
        // Instansi class Anjing
        Anjing cihua = new Anjing("Lala", "Cihua - hua");
        
        
        // Menampilkan kedua informasi hewan tersebut
        cihua.tampilkanInfo();
        anggora.tampilkanInfo();
        
    }
}
