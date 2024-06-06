package uts;

import java.util.Scanner;

import Minggu8.Barang11;

public class barang11 {
    barang11[] data = new barang11[3];
    int kodeObat11[];
    String namaObat11[];
    int stock11[];

    barang11(int[] k, String[] n, int[] s){
        kodeObat11 = k;
        namaObat11 = n;
        stock11 = s;
    }

    void tampil11 (){
        System.out.println("kode obat: " + kodeObat11);
        System.out.println("nama obat " + namaObat11);
        System.out.println("stock : " + stock11);
    }

    void tambah11 (){
         
    }

    void bubbleSortAsc(){
        for (int i = 0; i < data.length-1; i++) {
           for (int j = 1; j < data.length; j++) {
                
           } 
        }
    }

    
}
