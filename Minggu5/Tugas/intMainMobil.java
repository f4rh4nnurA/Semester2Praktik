package Minggu5.Tugas;
public class intMainMobil {
    public static void main(String[] args) {
        int l[] = {4360, 3921, 6816, 4058, 6255, 3700,4180,4180};
        String names[] = {"Nissan 370Z","Ford Fiesta ST","BMW M2 coupe","Subaru BRZ", "Subaru Impreza WRX STI", "Toyota AE86 Trueno","Toyota 86/GT86", "Volkswagen Golf GTI"};
        Mobil top = new Mobil(speed,names);
        System.out.print("Akselerasi tertinggi sebesar " + top.max + " diraih oleh mobil " + top.name);
    }
}
