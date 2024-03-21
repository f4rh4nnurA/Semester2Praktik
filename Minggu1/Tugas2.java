import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        while (true) {
            System.out.println("\t\t\tDaftar Rumus");
            System.out.println("1. Kecepatan" + "\n2. Jarak" + "\n3. Waktu");
            System.out.print("Pilih rumus yang akan dihitung (1/2/3) atau (ketik 4 untuk keluar):");
            int data = input.nextInt();
            if (data == 1) {
                System.out.println("Masukkan jarak : ");
                float jarak = input.nextFloat();
                System.out.println("Masukkan waktu : ");
                float waktu = input.nextFloat();
                System.out.println("kecepatan : " + menghitungKec(jarak, waktu));
                break;
            } else if (data == 2){
                System.out.println("Masukkan kecepatan : ");
                float kecepatan = input.nextFloat();
                System.out.println("Masukkan waktu");
                float waktu = input.nextFloat();
                System.out.println("jarak : " + menghitungJar(kecepatan, waktu));
                break;
            } else if (data == 3){
                System.out.println("Masukkan jarak : ");
                float jarak = input.nextFloat();
                System.out.println("Masukkan kecepatan : ");
                float kecepatan = input.nextFloat();
                System.out.println("waktu : " + menghitungWak(jarak, kecepatan));
                break;
            } else if (data == 4) {
                break;
            } else{
                System.out.println("Silakan coba lagi");
            }
        }
        input.close();
    }
    public static float menghitungKec (float jarak, float waktu){
        float kecepatan = jarak / waktu;
        return kecepatan;
    }
    public static float menghitungJar (float kecepatan, float waktu){
        float jarak = kecepatan*waktu;
        return jarak;
    }
    public static float menghitungWak (float jarak, float kecepatan){
        float waktu = jarak / kecepatan;
        return waktu;
    }
}
