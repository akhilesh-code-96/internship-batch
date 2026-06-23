package module4;

public class MultiDimensionalArray {

    // print array
    public static void print2DArray(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Q1. Assign values to all the positions of the array and print the array in 3X3 matrix format
        // Ex:
        /*    0 1 2

        0 --> 1 2 3
        1 --> 4 5 6
        2 --> 7 8 9
         */
        // Input
        int[][] multiArray = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Assign values
        int counter = 1;
        for (int row = 0; row < multiArray.length; row++) {
            for (int col = 0; col < multiArray[row].length; col++) {
                multiArray[row][col] = counter;
                counter++;
            }
        }

        // Output
        print2DArray(multiArray);
    }
}
