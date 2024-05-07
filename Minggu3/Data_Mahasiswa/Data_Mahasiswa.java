package Data_Mahasiswa;

import java.util.Scanner;

class Mahasiswa {
    public String nama;
    public int nim; 
    public String jenisKelamin;
    public double[] ipk = new double[3];

    public Mahasiswa(String nama, int nim, String jenisKelamin, double[] ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public void inputData() {
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan Nama: ");
            this.nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            this.nim = sc.nextInt(); 
            System.out.print("Masukkan Jenis Kelamin: ");
            this.jenisKelamin = sc.next();
            System.out.print("Masukkan IPK: ");
            this.ipk [i] = sc.nextDouble();
        }    
    }

    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("IPK: " + ipk);
        System.out.println();
    }

    public double hitungRata2Ipk (double [] ipk){
        double total = 0;
        for (int i = 0; i < ipk.length; i++) {
            total = this.ipk[i];
        }

        double rata2 = total / 3;
        return rata2;
    }



}