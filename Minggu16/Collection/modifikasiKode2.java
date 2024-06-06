package Minggu16.Collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class modifikasiKode2 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(); // Gunakan Integer sebagai tipe data spesifik
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.remove(0);
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %d\n",
            intList.get(0), intList.size(), intList.get(intList.size() - 1));

        List<String> stringList = new ArrayList<>(); 
        stringList.add("Cireng"); 

        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n",
            stringList.get(0), stringList.size(), stringList.get(stringList.size() - 1));

        List<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");

        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n",
            names.get(0), names.size(), names.get(names.size() - 1));
        names.set(0, "My kid");
        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n",
            names.get(0), names.size(), names.get(names.size() - 1));
        System.out.printf("Names: " + names.toString());
    }
}
