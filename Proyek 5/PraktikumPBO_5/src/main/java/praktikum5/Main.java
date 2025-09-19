/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author VOSTRO V131
 */
public class Main {
    public static void main(String[] args) {
        // Instansi class mobil menjadi objek mobil
        Mobil mobil = new Mobil("Toyota", 250,"V8" ,4);
        // Menampilkan informasi mobil
        System.out.println(mobil.tampilkanInfo());

        SepedaMotor motor = new SepedaMotor("Yamaha", 180, "2-Tak");
        System.out.println(motor.tampilkanInfo());
    }
}

