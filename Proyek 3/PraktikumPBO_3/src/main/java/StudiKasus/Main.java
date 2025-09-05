/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudiKasus;

/**
 *
 * @author VOSTRO V131
 */
public class Main {
    /* membuat class main dimana method ini bukan method constructor tetapi JVM akan memilih
       method ini sebagai kode yang dijalankan di awal*/
    // method diberi modifer public agar bisa dijalankan diluar class dan dimana saja 
    // method tidak mengembalikan nilai ditandai dengan void
    // String[] args akan menampung argument - argument dari command line
    
    public static void main(String[] args) {
        // instansi sebuah class menjadi sebuah objek
        Mobil ferrari = new Mobil("Ferrari", "Ferrari 488", 2015, "Merah");
        Mobil bugatti = new Mobil("Bugatti", "Bugati Veyron", 2005, "Coklat");
        
        // Untuk menampilkan detail info dari kedua objek
        ferrari.detailInfo();
        System.out.println("");
        bugatti.detailInfo();
        System.out.println("");
        
        // Menyalakan mesin mobil ferrari
        ferrari.startEngine();
              
        // Menyalakan mesin mobil bugatti
       bugatti.startEngine(); 
    }
}
