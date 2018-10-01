/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan21.rata.rata;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama  : Rizal Arif Nugraha
 * Nim   : 10117048
 * Kelas : PBO2
 * Deskripsi Program : Program ini menampilkan rata-rata nilai pada mahasiawa.
 */
public class PBO210117048Latihan21RataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumMhs;
        int i = 1;
        double rataNilai;
        double jumNilai = 0;
        double nilaiMhs;

        Scanner value = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa = ");
        jumMhs = (int) value.nextDouble();

        while (i <= jumMhs) {
            System.out.print("Nilai Mahasiswa Ke-" + i + " : ");

            nilaiMhs = value.nextDouble();
            jumNilai = jumNilai + nilaiMhs;
            i++;

        }
        System.out.print(" ");

        //menghitung rata-rata nilai mahasiswa
        rataNilai = jumNilai / jumMhs;
        System.out.println("Maka, Rata-rata nilainya adalah " + rataNilai);
        System.out.println("(Developed by : Rizal Arif Nugraha)");
    }

}
