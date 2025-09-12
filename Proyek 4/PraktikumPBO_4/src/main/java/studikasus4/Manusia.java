/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasus4;

/**
 *
 * @author VOSTRO V131
 */
public class Manusia {
    // Modifier nama private maka hanya bisa diakses pada classnya sendiri
    private String nama;
    // Modifier usia protected maka hanya bisa diakses pada classnya dan class turunanya
    protected int usia;
    // Modifier pekerjaan public maka bisa diakses dimana saja
    public String pekerjaan;
    
    // Lalu membuat sebuah constructor yang nantinya akan mengisi nilai - nilai dari atribut tersebut
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }
    
    // membuat getter untuk atribut nama agar dalam mengakses nama dapat divalidasi terlebih dahulu
    public String getNama() {
        return this.nama;
    }
    
    // membuat setter untuk atribut nama agar dalam merubah atribut nama dapat divalidasi
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // membuat sebuah method toString yang nantinya akan di ovveride atau dirubah oleh class child
    public String toString() {
        String namaManusia = this.nama;
        String pekerjaanManusia = this.pekerjaan;
        int usiaManusia = this.usia;
        return "Nama manusia adalah " + namaManusia +
           "\nUsia berumur " + usiaManusia + " tahun" +
           "\nPekerjaannya adalah " + pekerjaanManusia;
    }
}
