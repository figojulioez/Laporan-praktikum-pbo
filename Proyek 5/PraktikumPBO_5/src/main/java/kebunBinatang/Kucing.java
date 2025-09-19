/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kebunBinatang;

/**
 *
 * @author VOSTRO V131
 */
// membuat agar class Kucing melakukan pewarisan dengan class Hewan
public class Kucing extends Hewan {
    // membuat sebuah constructor untuk mengisi nilai pada atribut parent
    public Kucing (String namaAnjing, String jenisAnjing) {
        // Mengistansi class Hewan
        super(namaAnjing, jenisAnjing);
    }
    
    // Membuat sebuah method suaraKhas Kucing
    public String suaraKhas () {
        return "Meong - Meong";
    }
    
    // Melakukan sebuah override pada method tampilkanInfo pada class Kucing
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara khasnya kucing yaitu " + this.suaraKhas());
        
    }
}