package se.kth.execdiff.tasks.one;

public class BubbleSort {
    public static void sort(int[] arr){
        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = 0; j < i - 1; j++){
                if(arr[j + 1] < arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
