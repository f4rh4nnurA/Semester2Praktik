package Minggu5.Tugas;
public class Mobil {

    private String merk;
    private String tipe;
    private int tahun;
    private double topAcceleration;
    private double topPower;

    public Mobil(String merk, String tipe, int tahun, double topAcceleration, double topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }

    public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public int getTahun() {
        return tahun;
    }

    public double getTopAcceleration() {
        return topAcceleration;
    }

    public double getTopPower() {
        return topPower;
    }

    public String toString() {
        return "Mobil{" +
                "merk='" + merk + '\'' +
                ", tipe='" + tipe + '\'' +
                ", tahun=" + tahun +
                ", topAcceleration=" + topAcceleration +
                ", topPower=" + topPower +
                '}';
    }
}
