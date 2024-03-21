package kuis;
import java.util.Scanner;

public class alatElektronikMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilih Opsi :");
        System.out.println("1. Pinjam");
        System.out.println("2. keluar");
        System.out.println("3. Menampilkan detail sewa");
        System.out.print("\nPilih opsi (1/2/3): ");
        boolean kondisi = false;
        int pilih = sc.nextInt();

        alatElektronik sewa = new alatElektronik();
        while (!kondisi) {
            switch (pilih) {
                case 1:
                    System.out.println("Input Detail Barang yang akan disewa");
                    System.out.println("\t\t\t1. HP :");
                    System.out.println("Lama peminjaman : " );
                    int lamaHP = sc.nextInt();
                    System.out.println("\t\t\t2. Laptop :");
                    System.out.println("Lama Peminjaman: ");
                    int lamaLaptop = sc.nextInt();
                    System.out.println("\t\t\t3. LCD :");
                    System.out.println("Lama Peminjaman ");
                    int lamaLCD = sc.nextInt();
                    System.out.println("ketik 1 untuk keluar ");
                    int ketik = sc.nextInt();
                    if (ketik == 1) {
                        kondisi = false;
                    }
                case 2:
                    break;
                case 3:
                    
            }
        }
    }
}
