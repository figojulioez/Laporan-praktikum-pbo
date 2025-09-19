/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kebunBinatang;

/**
 *
 * @author VOSTRO V131
 */
// Class parent Hewan
public class Hewan {
    // Modifier atribut diberi protected agar hanya bisa digunakan di package yang sama atau sub class
    // Membuat atribut nama
    protected String nama;
    // Membuat atribut jenis
    protected String jenis;
    
    // Membuat sebuah constructor method yang mana saat class Hewan di instansi akan langsung mengisi nilai atribut
    public Hewan(String namaHewan, String jenisHewan) {
        // Mengisi nilai dari atribut nama
        this.nama = namaHewan;
        // Mengisi nilai dari atribut jenis hewan
        this.jenis = jenisHewan;
    }
    
    // Membuat sebuah method tampilkanInfo() yang nantinya akan menampilkan info dari hewan
    public void tampilkanInfo() {
        System.out.println("Nama hewan " + this.nama);
        System.out.println("Jenis dari hewan " + this.jenis);
    }
}


