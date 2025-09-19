/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author VOSTRO V131
 */
public class SepedaMotor extends Kendaraan {

    // Constructor untuk mengisi properti yang ada pada classMobil dan class Parent Kendaraan
    public SepedaMotor(String nama, int kecepatanMaks, String jenisMesin) {
        super(nama, kecepatanMaks, jenisMesin); // Memanggil constructor dari kelas induk
    }

    // Method untuk menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        // Dapat mengakses kecepatanMaks karena protected
        System.out.println("Kecepatan Maksimum Motor: " + kecepatanMaks + " km/h");
    }
    
    @Override
    public String tampilkanInfo() {
        return "Nama dari kendaraan" + super.getNama() + "\nKecepatan Maksimum " 
                + super.kecepatanMaks + "\nJenis mesin " + super.jenisMesin;
                
    }

}