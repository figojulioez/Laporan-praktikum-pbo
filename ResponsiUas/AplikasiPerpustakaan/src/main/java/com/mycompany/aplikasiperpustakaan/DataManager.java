/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasiperpustakaan;

/**
 *
 * @author VOSTRO V131
 */
// Import library untuk File I/O
import java.io.*;

// Class DataManager untuk mengelola penyimpanan data
public class DataManager {

    // Method untuk menyimpan data ke file
    public static void simpanData(Object obj, String filename) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(obj);
            System.out.println("Data berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data: " + e.getMessage());
        }
    }

    // Method untuk membaca data dari file
    public static Object bacaData(String filename) {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(filename))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Gagal membaca data: " + e.getMessage());
            return null;
        }
    }
}
