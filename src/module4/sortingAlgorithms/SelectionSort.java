package module4.sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 1};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minIdx  = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx  = j;
                }
            }

            //swap
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}
