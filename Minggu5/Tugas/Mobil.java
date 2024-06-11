package Minggu5.Tugas;

public class Mobil {
    int[] kecepatan;
    String[] mobil;
    int low;
    int high;
    int med;

    Mobil (int[] top_acceleration, String[] merk) {
        this.kecepatan = top_acceleration;
        this.mobil = merk;
    }

    int temukanMax ( int [] arr, int low, int high, String [] cars){
        low = 0;
        if (low == high) {
            return high;
        }
        int mid = (low + high) / 2;
        int kiri = temukanMax(arr, cars, low, med);
        int kanan = temukanMax(arr, cars, med + 1, arr.length - 1);
        return Math.;
    }
}