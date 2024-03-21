package kuis;

public class alatElektronik {
    public alatElektronik (){
        int hp ;
        int laptop;
        int lcd;
        double hargaHp = 10000.00;
        double hargaLaptop = 11000.00;
        double hargaLCD = 12000.00;
        int dayHP;
        int dayLaptop;
        int dayLCD;
    }

    double hitungHargaSewa (int hargaHP, int dayHP, int hargaLaptop, int dayLaptop, int hargaLCD, int dayLCD){
       double hargaTotal = hargaHP * dayHP + hargaLaptop * dayLaptop + hargaLCD * dayLCD;
       return hargaTotal;
    }

    void tampilkanInformasiBarangYangDisewa (int hp, int laptop, int lcd, int dayHP, int dayLaptop, int dayLCD){
        int jmlBarang = hp + laptop + lcd;
        System.out.println("\t\t\t\tToko penyewaan");
        System.out.println("Daftar Barang yang disewa dan Lama peminjaman:");
        System.out.println("1. hp : " + hp + " (" + dayHP + ")");
        System.out.println("2. laptop : " + laptop + "(" + dayLaptop + ")");
        System.out.println("3. monitor : " + lcd + "(" + dayLCD + ")");
    }

    double lamaHariPeminjaman (int dayHP , int dayLaptop, int dayLCD){
        return dayHP + dayLaptop + dayLCD;
    }

}