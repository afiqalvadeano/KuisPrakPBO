/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Kuis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char ulang;
        int pilih;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("== MENU ==");
            System.out.println("1. Asisten Laboratorium");
            System.out.println("2. Admin Laboratorium");
            System.out.print("Pilih : ");
            try {
                pilih = input.nextInt();
                System.out.println("");
                switch (pilih) {
                    case 1: {
                        String nama;
                        int nim, tTulis, tCoding, tWawancara, tMTeaching;
                        int jumlah = 0;
                        System.out.println("---REGISTRASI ASISTEN LABORATORIUM---");
                        System.out.print("Masukkan banyak data calon pendaftar: ");
                        jumlah = input.nextInt();
                        for (int i = 0; i < jumlah; i++) {
                            System.out.print("Nama    : ");
                            input.nextLine();
                            nama = input.nextLine();
                            System.out.print("NIM    : ");
                            nim = input.nextInt();
                            System.out.print("Nilai Tes Tulis    : ");
                            tTulis = input.nextInt();
                            System.out.print("Nilai Praktek Coding    : ");
                            tCoding = input.nextInt();
                            System.out.print("Nilai Tes Wawancara : ");
                            tWawancara = input.nextInt();
                            System.out.print("Nilai Tes Microteaching : ");
                            tMTeaching = input.nextInt();

                            Asisten satu = new Asisten(nama, nim, tTulis, tCoding, tWawancara, tMTeaching);
                            System.out.println("Nilai Rata-rata : " + satu.nilai_rata);
                            if (satu.nilai_rata > 85) {
                                System.out.println("KETERANGAN : LOLOS");
                                System.out.println("Selamat kepada " + satu.nim + " telah diterima sebagai Aslab");
                            } else {
                                System.out.println("KETERANGAN : TIDAK LOLOS");
                                System.out.println("Mohon maaf kepada " + satu.nim + " anda tidak diterima sebagai Aslab. Coba lagi tahun depan");
                            }
                        }
                        break;
                    }

                    case 2: {
                        String nama;
                        int nim, tTulis, tCoding, tWawancara, tPraktek;
                        int jumlah = 0;
                        System.out.println("---REGISTRASI ADMIN LABORATORIUM---");
                        System.out.print("Masukkan banyak data calon pendaftar: ");
                        jumlah = input.nextInt();
                        for (int i = 0; i < jumlah; i++) {
                            System.out.print("Nama    : ");
                            input.nextLine();
                            nama = input.nextLine();
                            System.out.print("NIM    : ");
                            nim = input.nextInt();
                            System.out.print("Nilai Tes Tulis    : ");
                            tTulis = input.nextInt();
                            System.out.print("Nilai Praktek Coding    : ");
                            tCoding = input.nextInt();
                            System.out.print("Nilai Tes Wawancara : ");
                            tWawancara = input.nextInt();
                            System.out.print("Nilai Tes Praktek : ");
                            tPraktek = input.nextInt();

                            Admin dua = new Admin(nama, nim, tTulis, tCoding, tWawancara, tPraktek);
                            System.out.println("Nilai Rata-rata : " + dua.nilai_rata);
                            if (dua.nilai_rata > 85) {
                                System.out.println("KETERANGAN : LOLOS");
                                System.out.println("Selamat kepada " + dua.nim + " telah diterima sebagai Aslab");
                            } else {
                                System.out.println("KETERANGAN : TIDAK LOLOS");
                                System.out.println("Mohon maaf kepada " + dua.nim + " anda tidak diterima sebagai Aslab. Coba lagi tahun depan");
                            }
                        }

                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.err.println("Input harus berupa angka!");
                input.nextLine();
            }
            System.out.print("Kembali ke menu? (y/n) : ");
            ulang = input.next().charAt(0);
            System.out.println("");
        } while (ulang == 'y' || ulang == 'Y');
    }

}
