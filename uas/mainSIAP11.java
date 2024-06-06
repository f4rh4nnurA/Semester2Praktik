package uas;

import java.util.Scanner;

public class mainSIAP11 {
    public static void main(String[] args) {
        antrianSLL11 act = new antrianSLL11();
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat datang di Sistem Informasi Antrian Pelanggan");
        System.out.println("1. Tambah Antrian ");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Layanan");
        System.out.print("Pilih menu (1/2/3/4): ");
        int pilih = sc.nextInt();
        boolean balik = false;
        while (!balik) {
            switch (pilih) {
                case 1:
                    System.out.println("Pilih layanan");
                    System.out.println("1. Reguler (Rp 6.000)");
                    System.out.println("2. Premium (Rp 10.000)");
                    System.out.print("Masukkan jenis antrian (1/2): ");
                    int jenis = sc.nextInt();
                    while (true) {
                        if (jenis == 1) {
                            if () {
                                int tambah = sc.nextInt();
                                act.addLast (tambah);
                            }
                        }    
                        break;
                    }
                case 2:
                    act.print();
                    break;
                case 3:
                    act.removeLast();
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }
    }    
}
