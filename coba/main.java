package coba;

public class main {
    public static void main(String[] args) {
        int [] arr = {23,67,45,34,54,57,12};
        sorting bs = new sorting(arr);
        bs.bubbleSort(arr);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]+ "");   
        }
    }
}
