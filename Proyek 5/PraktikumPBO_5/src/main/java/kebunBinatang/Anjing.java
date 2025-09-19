/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kebunBinatang;

/**
 *
 * @author VOSTRO V131
 */
// membuat agar class Anjing melakukan pewarisan dengan class Hewan
public class Anjing extends Hewan {
    // membuat sebuah constructor untuk mengisi nilai pada atribut parent
    public Anjing (String namaAnjing, String jenisAnjing) {
        // Mengistansi class Hewan
        super(namaAnjing, jenisAnjing);
    }
    
    // Membuat sebuah method suaraKhas Kucing
    public String suaraKhas () {
        return "Wook - Wook";
    }
    
    
    // Melakukan sebuah override pada method tampilkanInfo pada class Kucing
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara khasnya anjing yaitu " + this.suaraKhas());
        
    }
}
