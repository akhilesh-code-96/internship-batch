package module2;

public class ForLoop {

    public static void main(String[] args) {

        // For loop is used for the iteration purpose
        // iterate from 1 to 10
        // iterate through the entire array or string we basically for loop
        /*
        int i =0;

        while (i < 10)
         */
        for (int i = 1; i <= 10; i+=2) {
            System.out.print(i + " ");
        }

        // Enhanced
        int[] arr = {1, 2, 3, 4, 5};

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
