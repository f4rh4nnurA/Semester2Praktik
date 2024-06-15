package UAS;

import java.util.Scanner;
public class main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BarangRental11 brr = new BarangRental11(null, null, null, 0, 0);
        boolean pilih = false;
        while (!pilih) {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraaan");
            System.out.println("2. Peminjam");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1/2/3/4/5) :");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    brr.tampilkanKendaraan();
                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
    }
}
