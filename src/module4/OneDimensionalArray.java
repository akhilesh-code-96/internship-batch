package module4;

import java.util.Scanner;

public class OneDimensionalArray {

    private void print1DArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
//        int[] arr = new int[3]; // It is a single dimensional array
//
//
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        // Value insertion at a given position
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i + 1;
//        }
//
//        // printing the value of an array
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // Q1. Initialize an array of size 10 with the default values as false.
        // default int -> 0, boolean -> false, double -> 0.0, char -> ?, String -> null
//        String[] arr = new String[10];
//
//        OneDimensionalArray oneDimensionalArray = new OneDimensionalArray();
//        oneDimensionalArray.print1DArray(arr);

//        print1DArray(arr);

        // Q2. Find the largest number in the given array
        Scanner sc = new Scanner(System.in);
        // How to take the array input through Scanner api
        System.out.println("Please enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];


        // Taking the input value
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // finding the second-largest number
//        int result = findSecondLargestNumber(arr);
//        System.out.println("Second largest number -> " + result);

        // removing duplicates
        int length = removeDuplicates(arr);
        for (int i = 0; i <= length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    // find the second-largest number
    private static int findSecondLargestNumber(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }


    // Remove duplicates
    private static int removeDuplicates(int[] arr) {
        int k = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[k] != arr[i]) {
                k++;
                arr[k] = arr[i];
            }
        }

        return k;
    }

}
