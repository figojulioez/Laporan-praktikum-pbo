/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VOSTRO V131
 */
public class Main {
    public static void main(String[] args) {
//        Hewan kucing = new Hewan();
//        kucing.bersuara(); // Output: Hewan bersuara
//        kucing.makan("ikan"); // Memanggil metode makan() dari kelas Hewan
//        kucing.makan("ikan", 2); // Memanggil metodemakan() yang overloaded

        Hewan hewan = new Kucing();
        hewan.bersuara(); // Output: Meow
        Kucing kucing = new Kucing();
        kucing.makan("ikan"); // Memanggil metodemakan() dari kelas Hewan
        kucing.makan("ikan", 2); // Memanggil metodemakan() yang overloaded 
        Anjing anjing = new Anjing(); anjing.bersuara(); // Output: Woof
        anjing.makan("daging", 3); // Memanggil metode makan() yang overloaded pada kelas Hewan

    
    }
}
