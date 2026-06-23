package module2;

import java.util.Scanner;

public class NestedLoops {

    public static void main(String[] args) {
        // Pattern building problems
        /*
        *
        * *
        * * *
        * * * *
        * * * * *
         */
        // What should be approach?
        // int i --> row and int j --> col
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

//        for (int row = 1; row <= n; row++) {
//            int col = 1;
//            while (col <= row) {
//                System.out.print("*" + " ");
//                col++;
//            }
//            System.out.println();
//        }

        //Print the inverted right angle triangle
        /*
                 *
               * *
             * * *
           * * * *
         * * * * *
         */

        // What should be the approach?
//        for (int row = 0; row < n; row++) {
//            int col = n - row;
//            while (col > 0) {
//                System.out.print("*" + " ");
//                col--;
//            }
//            System.out.println();
//        }

//        for (int row = 1; row <= n; row++) {
//            int col = 1;
//            // spaces
//            while (col <= n - row) {
//                System.out.print(" ");
//                col++;
//            }
////            System.out.println("Col: " + col);
//            // stars
//            // Last value of col remain 3
//            while (col <= n){
//                System.out.print("*");
//                col++;
//            }
//            System.out.println();
//        }

        // Assignment
        /*
           *
         * * *
       * * * * *
     * * * * * * *
         */

        /*
        1
        2 3
        4 5 6
        7 8 9 10
         */
//        int count = 1;
//
//        for (int row = 1; row <= n; row++) {
//            int col = 1;
//            // col will begin from the row(th) number
//            while (col <= row) {
//                System.out.print(count + " ");
//                count++;
//                col++;
//            }
//            System.out.println();
//        }

        // Pyramid
        for (int row = 1; row <= n; row++) {
            // spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }

            // next line
            System.out.println();
        }


        // Diamond
        for (int row = n - 1; row >= 1; row--) {
            // spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }

            // next line
            System.out.println();
        }

    }
}
