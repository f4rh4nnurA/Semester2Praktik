 import java.util.Scanner;

public class Tugas1 {
    static char KODE [] = {'A','B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
    static char KOTA [][] = {
        {'B', 'A', 'N', 'T', 'E', 'N'},
        {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
        {'B', 'A', 'N', 'D', 'U', 'N','G'},
        {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
        {'B', 'O', 'G', 'O', 'R'},
        {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G','A', 'N'},
        {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
        {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
        {'M', 'A', 'L', 'A', 'N', 'G'},
        {'T', 'E', 'G', 'A', 'L'}
    };
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan kode plat : " );
        char scan = input.next().charAt(0);
        mengelompokkanPlatdanKota(scan);
        input.close();    
    }
    public static void mengelompokkanPlatdanKota (char data) {
        for (int i = 0; i < KODE.length; i++) {
            if (data == KODE[i]) {
                for (int j = 0; j < KOTA[i].length; j++) {
                    System.out.print(KOTA[i][j]);
                }
                break;
            }
        }
    }
    
}