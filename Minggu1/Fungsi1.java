public class Fungsi1 { 
    static int stockToko [][] = {
        {10 , 5 , 15, 7 }, // RoyalGarden1
        {6  , 11, 9 , 12}, // RoyalGarden2
        {2  , 10, 10, 5 }, // RoyalGarden3
        {5  , 7 , 12, 9 }  // RoyalGarden4
    };
    static int harga [] = {75000, 50000, 60000, 10000}; 
    public static void main(String[] args) {
         
        System.out.println("Berikut merupakan pendapatan per cabang :");

        float pendapatanRG1 = tampilkanPendapatanRG1(stockToko, harga);
        System.out.println( "1. Total pendapatan Royal Garden 1 jika semua bunga habis terjual sebesar Rp "+ pendapatanRG1);
        
        float pendapatanRG2 = tampilkanPendapatanRG2(stockToko, harga);
        System.out.println( "2. Total pendapatan Royal Garden 2 jika semua bunga habis terjual sebesar Rp "+ pendapatanRG2);
    
        float pendapatanRG3 = tampilkanPendapatanRG3(stockToko, harga);
        System.out.println( "3. Total pendapatan Royal Garden 3 jika semua bunga habis terjual sebesar Rp "+ pendapatanRG3);

        float pendapatanRG4 = tampilkanPendapatanRG4(stockToko, harga);
        System.out.println( "4. Total pendapatan Royal Garden 4 jika semua bunga habis terjual sebesar Rp "+ pendapatanRG4);

        System.out.println("\nPengurangan stock pada toko Royal Garden 4");
        int totalStock = tampilkanPendapatanRG4berkurang(stockToko); 
        System.out.println("\nJumlah stock toko Royal Garden 4 apabila terjadi pengurangan stock sebesar " + totalStock );
    }
    
    public static int tampilkanPendapatanRG1 (int stockToko [][],int harga[]){
        int pendapatan = 0;
        for (int i = 0; i < harga.length; i++) {
            pendapatan += stockToko[0][i] * harga[i];
        }  
        return pendapatan;
    }
    public static int tampilkanPendapatanRG2 (int stockToko [][],int harga[]){
        int pendapatan = 0;
        for (int i = 0; i < harga.length; i++) {
            pendapatan += stockToko[1][i] * harga[i];
        }  
        return pendapatan;
    }
    public static int tampilkanPendapatanRG3 (int stockToko [][],int harga[]){
        int pendapatan = 0;
        for (int i = 0; i < harga.length; i++) {
            pendapatan += stockToko[2][i] * harga[i];
        }  
        return pendapatan;
    }
    public static int tampilkanPendapatanRG4 (int stockToko [][],int harga[]){
        int pendapatan = 0;
        for (int i = 0; i < harga.length; i++) {
            pendapatan += stockToko[3][i] * harga[i];
        }  
        return pendapatan;
    }
    public static int tampilkanPendapatanRG4berkurang (int stockToko [][]){
        stockToko[3][0] -= 1;
        stockToko[3][1] -= 2;
        stockToko[3][3] -= 5;
        int jumlahStock = 0;
        for ( int i = 0; i < harga.length; i++) {
            jumlahStock += stockToko[3][i];
        }
        return jumlahStock;
    }
}

    