package Minggu5.BruteForceDivideConquer;

import java.util.Scanner;

public class MainSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.println("Masukkan jumlah bulan: ");
        int elemen = sc.nextInt();

        Sum sum = new Sum(elemen);

        System.out.println("================================================================");
        for (int i = 0; i < sum.elemen; i++) {
            System.out.print("Masukkan keuntungan bulan ke-" + (i + 1) + " = ");
            sum.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("================================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sum.elemen + " bulan adalah = " + sum.totalBF(sum.keuntungan));

        System.out.println("================================================================");
        System.out.println("Algoritma Divide and Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sum.elemen + " bulan adalah = " + sum.totalDC(sum.keuntungan, 0, sum.elemen - 1));
    }
}
