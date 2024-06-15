package coba;

public class sorting {
    
    public sorting (int [] arr){
    }

    void bubbleSort (int []arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr [j]) {
                    int temp = arr[j];
                    arr[j] = arr [i];
                    arr[i] = temp;
                }
            }
        }
    }

    void selectionSort (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int idxMin = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[idxMin] < arr[j]) {
                    idxMin = j;
                }
                int temp = arr[idxMin];
                arr[idxMin] = arr[j];
                arr[j] = temp;
            }
        }
    }

    void insertionSort (int[] arr) {
        int i, key;
        
    }
}
