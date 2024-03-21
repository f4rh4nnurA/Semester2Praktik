import java.util.Scanner;

public class MainMobil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mobil: ");
        int n = sc.nextInt();
        Mobil[] mobil = new Mobil[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mobil ke-" + (i + 1));
            System.out.print("Merk: ");
            String merk = sc.next();
            System.out.print("Tipe: ");
            String tipe = sc.next();
            System.out.print("Tahun: ");
            int tahun = sc.nextInt();
            System.out.print("Top Acceleration: ");
            double topAcceleration = sc.nextDouble();
            System.out.print("Top Power: ");
            double topPower = sc.nextDouble();
            mobil[i] = new Mobil(merk, tipe, tahun, topAcceleration, topPower);
        }

        double topAccelerationTertinggi = findMaxTopAccelerationDC(mobil, 0, n - 1);

        double topAccelerationTerendah = findMinTopAccelerationDC(mobil, 0, n - 1);

        double rataRataTopPower = 0;
        for (Mobil m : mobil) {
            rataRataTopPower += m.getTopPower();
        }
        rataRataTopPower /= n;

        
        System.out.println("Top Acceleration Tertinggi: " + topAccelerationTertinggi);
        System.out.println("Top Acceleration Terendah: " + topAccelerationTerendah);
        System.out.println("Rata-rata Top Power: " + rataRataTopPower);
    }

    private static double findMaxTopAccelerationDC(Mobil[] mobil, int start, int end) {
        if (start == end) {
            return mobil[start].getTopAcceleration();
        }

        int mid = (start + end) / 2;
        double leftMax = findMaxTopAccelerationDC(mobil, start, mid);
        double rightMax = findMaxTopAccelerationDC(mobil, mid + 1, end);

        return Math.max(leftMax, rightMax);
    }

    private static double findMinTopAccelerationDC(Mobil[] mobil, int start, int end) {
        if (start == end) {
            return mobil[start].getTopAcceleration();
        }

        int mid = (start + end) / 2;
        double leftMin = findMinTopAccelerationDC(mobil, start, mid);
        double rightMin = findMinTopAccelerationDC(mobil, mid + 1, end);

        return Math.min(leftMin, rightMin);
    }
}
