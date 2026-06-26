package module4.array.searchingAlgorithms;

public class LinearSearch {

    public static void main(String[] args) {
        // What is linear search?
        // checking the element present in the array in one direction and one by one

        int[] arr = {4, 3, 2, 6, 1, 9};

        int target = 1;
        boolean flag = false;


        // Q. Check if the target is present or not and if present print the index
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                flag = true;
                System.out.println("Target found at index -> " + i);
            }
        }

        if (!flag) {
            System.out.println("Target not found!");
        }
    }
}
