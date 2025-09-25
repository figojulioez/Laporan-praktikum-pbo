/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading;

/**
 *
 * @author VOSTRO V131
 */
public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        int hasil1 = kalkulator.jumlahkan(5, 3);
        double hasil2 = kalkulator.jumlahkan(2.5, 3.7);
        int hasil3 = kalkulator.jumlahkan(1, 2, 3);
        System.out.println(hasil1); // Output: 8
        System.out.println(hasil2); // Output: 6.2
        System.out.println(hasil3);
        
    }
}
