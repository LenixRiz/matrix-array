/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matriks;

import java.util.Scanner;
/**
 *
 * @author Rizky-PC
 */
public class Matriks {

    public static void main(String[] args) {
            
        //deklarasi scanner untuk input user
        Scanner keyboard = new Scanner(System.in);
        
        //deklarasi variable
        int jmlBaris, jmlKolom, operasi;
        String ulang = "";
        
        //menggunakan pengulangan
        do {
            
            System.out.println("");
            System.out.println("=== PENJUMLAHAN DAN PENGURANGAN MATRIKS ORDO DINAMIS ===");
            System.out.println("");
            
            //input jumlah baris dan kolom matriks yang diinginkan user
            System.out.print("Masukkan jumlah baris matriks : ");
            jmlBaris = keyboard.nextInt();
            System.out.print("Masukkan jumlah kolom matriks : ");
            jmlKolom = keyboard.nextInt();
            
            //deklarasi matriks //ditaruh di sini agar input-an user dapat turun ke array ini
            int matriksA[][] = new int[jmlBaris][jmlKolom];
            int matriksB[][] = new int[jmlBaris][jmlKolom];
            
            if (jmlBaris != jmlKolom){
                
                //Jika ordo yang dimasukkan tidak sama maka akan meminta user untuk mengulangi pengisian sebelumnya lagi
                System.out.println("");
                System.out.println("Maaf, jumlah baris dan jumlah kolom harus sama.");
                System.out.print("Apakah mau mengulang lagi? [Y/N] : ");
                keyboard.nextLine();
                ulang = keyboard.nextLine();
                
            } else {
                
                //memasukkan value input user untuk matriks A
                System.out.println("");
                System.out.println("Masukkan value untuk matriks A");
                for (int i = 0; i < matriksA.length; i++) {
                    for (int j = 0; j < matriksA.length; j++) {
                        System.out.print("Masukkan isi baris ke-" + i + " dan isi kolom ke-" + j + " : ");
                        matriksA[i][j] = keyboard.nextInt();
                    }
                }
                
                //memasukkan value input user untuk matriks B
                System.out.println("");
                System.out.println("Masukkan value untuk matriks B");
                for (int i = 0; i < matriksB.length; i++) {
                    for (int j = 0; j < matriksB.length; j++) {
                        System.out.print("Masukkan isi baris ke-" + i + " dan isi kolom ke-" + j + " : ");
                        matriksB[i][j] = keyboard.nextInt();
                    }
                }
                
                //untuk menampilkan setiap isi dari Matriks A secara detail
//                System.out.println("");
//                System.out.println("Berikut adalah isi array untuk Matriks A yang anda masukkan : ");
//                for (int i = 0; i < jmlBaris; i++) {
//                    for (int j = 0; i < jmlKolom; j++) {
//                        System.out.println("Isi baris ke-" + i + " dan kolom ke-" + j + " adalah : " + matriksA[i][j]);
//                    }
//                }
                
                //untuk menampilkan setiap isi dari Matriks B secara detail
//                System.out.println("");
//                System.out.println("Berikut adalah isi array untuk Matriks B yang anda masukkan : ");
//                for (int i = 0; i < jmlBaris; i++) {
//                    for (int j = 0; i < jmlKolom; j++) {
//                        System.out.println("Isi baris ke-" + i + " dan kolom ke-" + j + " adalah : " + matriksB[i][j]);
//                    }
//                }
                
                //menampilkan matriks A
                System.out.println("");
                System.out.println("=== Matriks A ===");
                for (int i = 0; i < matriksA.length; i++) {
                    for (int j = 0; j < matriksA.length; j++) {
                        System.out.print(matriksA[i][j] + "");
                    }
                    System.out.println("");
                }
                
                //menampilkan matriks B
                System.out.println("");
                System.out.println("=== Matriks B ===");
                for (int i = 0; i < matriksB.length; i++) {
                    for (int j = 0; j < matriksB.length; j++) {
                        System.out.print(matriksB[i][j] + "");
                    }
                    System.out.println("");
                }
                
                do {
                    
                    //deklarasi matriksC (untuk hasil dari operasi matriks A dan B)
                    int matriksC;
                            
                    //operasi penjumlahan atau pengurangan matriks
                    System.out.println("");
                    System.out.println("Operasi yang ingin anda lakukan ? ");
                    System.out.println("[1] Penjumalahan");
                    System.out.println("[2] Pengurangan");
                    System.out.print("Pilih [1/2] : ");
                    operasi = keyboard.nextInt();
                
                    switch (operasi) {
                        case 1 :
                            //Penjumlahan
                            System.out.println("");
                            System.out.println("Hasil Penjumlahan Matriks A dan Matriks B");
                            for (int i = 0; i < matriksA.length; i++) {
                                for (int j = 0; j < matriksA.length; j++) {
                                    matriksC = matriksA[i][j] + matriksB[i][j];
                                    System.out.print(matriksC + "");
                                }
                                System.out.println("");
                            }
                            break;
                        case 2:
                            //Pengurangan
                            System.out.println("");
                            System.out.println("Hasil Pengurangan Matriks A dan Matriks B");
                            for (int i = 0; i < matriksA.length; i++) {
                                for (int j = 0; j < matriksA.length; j++) {
                                    matriksC = matriksA[i][j] - matriksB[i][j];
                                    System.out.print(matriksC + "");
                                }
                                System.out.println("");
                            }
                            break;
                        default:
                            System.out.println("");
                            System.out.println("Maaf, opsi pilihan anda tidak tersedia.");
                    }
                    
                    System.out.print("Apakah mau mengulang lagi dengan operasi yang berbeda? [Y/N] : ");
                    keyboard.nextLine();
                    ulang = keyboard.nextLine();
                    
                } while (ulang.equalsIgnoreCase("Y"));
                
            }
            
            //memastikan apakah user ingin mengulangi program atau tidak
            System.out.println("");
            System.out.print("Apakah mau mengulang program lagi? [Y/N] : ");
            ulang = keyboard.nextLine();
            
        } while (ulang.equalsIgnoreCase("Y"));
        
        System.out.println("Terima Kasih!");
        
    }
}