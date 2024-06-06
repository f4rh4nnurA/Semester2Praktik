package latihanPrak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jari-jari pada kerucut: ");
        double jariK = sc.nextDouble();
        System.out.print("\nMasukkan sisi miring pada kerucut: ");
        double sisiM = sc.nextDouble();
        System.out.print("\nMasukkan panjang sisi alas pada limas segi empat sama sisi: ");
        double panjangAlas = sc.nextDouble();
        System.out.print("\nnMasukkan tinggi limas pada limas segi empat sama sisi: ");
        double tinggiL = sc.nextDouble();
        System.out.print("\nMasukkan jari-jari bola : ");
        double jari2Bola = sc.nextDouble();

        kerucut kerucut1 = new kerucut(jariK, sisiM);
        System.out.println("Luas permukaan kerucut adalah " + kerucut1.luasPermukaan());
    }
}
