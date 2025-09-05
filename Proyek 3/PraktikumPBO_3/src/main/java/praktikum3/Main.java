/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author VOSTRO V131
 */

// Class utama bernama main
public class Main {
    
    /* membuat class main dimana method ini bukan method constructor tetapi JVM akan memilih
       method ini sebagai kode yang dijalankan di awal*/
    // method diberi modifer public agar bisa dijalankan diluar class dan dimana saja 
    // method tidak mengembalikan nilai ditandai dengan void
    // String[] args akan menampung argument - argument dari command line
    public static void main(String[] args) {
        // instansi class hewan menjadi object kucing
        Hewan kucing = new Hewan("Beny", 4);  
        // menyetel atribut atribut object kucing
//        kucing.nama = "Beny";
//        kucing.umur = 4;  
        // memanggil method suara
        kucing.suara();
        kucing.berlari();
        kucing.info();
        
        // instansi class hewan menjadi object anjing
        Hewan anjing = new Hewan("Kiko", 5);
        anjing.suara();
        anjing.berlari();
        anjing.info();
    }
    
}
