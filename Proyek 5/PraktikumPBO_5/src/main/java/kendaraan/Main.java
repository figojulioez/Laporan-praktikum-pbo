/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author VOSTRO V131
 */
public class Main {
    public static void main(String[] args) {
         // SEBELUM OVERRIDING (pakai class induk Kendaraan)
        System.out.println("=== Sebelum Overriding (Kendaraan) ===");
        Kendaraan kendaraan = new Kendaraan("Kendaraan Umum", 60);
        kendaraan.tampilkanInfo();

        System.out.println("\n");

        // LEVEL MENENGAH (KendaraanDarat)
        System.out.println("=== KendaraanDarat ===");
        KendaraanDarat kendaraanDarat = new KendaraanDarat("Kendaraan Darat", 80, 4);
        kendaraanDarat.tampilkanInfo();

        System.out.println("\n");

        // SESUDAH OVERRIDING (Mobil)
        System.out.println("=== Sesudah Overriding (Mobil) ===");
        Mobil mobil = new Mobil("Toyota", 180, 4, 4);
        mobil.tampilkanInfo();

        System.out.println("\n");

        // SESUDAH OVERRIDING (Sepeda Motor)
        System.out.println("=== Sesudah Overriding (Sepeda Motor) ===");
        SepedaMotor motor = new SepedaMotor("Yamaha", 120, 2, "2-tak");
        motor.tampilkanInfo();
    }
}
