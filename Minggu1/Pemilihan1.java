import java.util.Scanner;

public class Pemilihan1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Program menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan nilai tugas: ");
        int tugas = scan.nextInt();
        System.out.print("\nMasukkan nilai kuis: ");
        int kuis = scan.nextInt();
        System.out.print("\nMasukkan nilai UTS: ");
        int uts = scan.nextInt();
        System.out.print("\nMasukkan nilai UAS: ");
        int uas = scan.nextInt();
        double nilaiAKhir = 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.4 * uas ;
        System.out.println("======================");
        System.out.println("======================");
        //hasil nilai akhir
        if (tugas < 0 || kuis < 0 || uas < 0 || nilaiAKhir < 0 || uas < 0 ) {
            System.out.println("nilai tidak valid");
        } else if (nilaiAKhir <= 100 && nilaiAKhir > 80) {
            System.out.println("nilai Akhir\t: " + nilaiAKhir);
            System.out.println("Nilai huruf\t: A");            
        } else if (nilaiAKhir > 73) {
            System.out.println("nilai Akhir\t: " + nilaiAKhir);
            System.out.println("Nilai huruf\t: B+");
        } else if (nilaiAKhir > 65) {
            System.out.println("nilai Akhir\t: " + nilaiAKhir);
            System.out.println("Nilai huruf\t: B");
        } else if (nilaiAKhir > 60) {
            System.out.println("nilai Akhir\t: " + nilaiAKhir);
            System.out.println("Nilai huruf\t: C+");
        } else if (nilaiAKhir > 50) {
            System.out.println("nilai Akhir\t: " + nilaiAKhir);
            System.out.println("Nilai huruf\t: C");
        } else if (nilaiAKhir > 39) {
            System.out.println("nilai Akhir\t: " + nilaiAKhir);
            System.out.println("Nilai huruf\t: D");
        } else if (nilaiAKhir <= 39){
            System.out.println("nilai Akhir\t: " + nilaiAKhir);
            System.out.println("Nilai huruf\t: E");
        }

        System.out.println("======================");
        System.out.println("======================");

        //keterangan kelulusan
        if (nilaiAKhir > 50 && nilaiAKhir <= 100){
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAKhir >=0 && nilaiAKhir <= 50) {
            System.out.println("TIDAK LULUS");
        }

        scan.close();
    }
}