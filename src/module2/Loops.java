package module2;

import java.util.Scanner;

public class Loops {

    // do while loop

    public static void main(String[] args) {

        // it is always going to get executed once even if the condition false;

//        int i = 1;

//        do {
//            System.out.println("Something");
//
//        } while (i < 4);

        // While loop
        // 5 < 5 --> false
//        while (i < 5) {
//            System.out.println(i);
//            ++i;
//        }

        /*
        Q. Reverse a number
        Given number 1234 and expected output 4321
        Pre-requisites --> While loop and Arithmetic operators
        Tell me the approach?
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number below: ");
//        int num = sc.nextInt();
//
//        int rev = 0;
//
//        while (num > 0) {
//            int rem = num % 10; // 123 % 10 -> 3;
//            rev = rev * 10 + rem; // 4 * 10 + 3 = 43;
//            num /= 10;
//        }
//
//        System.out.println("Output: " + rev);

        /*
        Check if the number is prime.
        Pre-requisites --> While loop and if else condition.
        Given num = 7, Expected Output -> print Number is prime or else Not a Prime
        Approach?
        We shall start dividing the given number from 2 till num - 1.
         */

        Scanner sc = new Scanner(System.in);
        // Step 1
        System.out.println("Enter the number below: ");
        int num = sc.nextInt(); // taking the input
        // Step 2
        // condition? --> loop should check if the iterator is in the given range or not.
        // i++ --> counter, increment
        /*
        int i = 2;
        while (i < num)
         */
        // Step 3
        // I want to divide the num by i;
        // What should be my equation? --> (num % i == 0) if this is true that means the number is not prime
        // and if it is not divided by any of the given number then it is a prime number.

        // Take the increment
        int i = 2;
        boolean flag = true;

        // Now form the while loop or conditional loop
        while (i < num) {
            if (num % i == 0) {
                System.out.println("Not a Prime");
                flag = false;
                break;
            }
            i++;
        }

        // We should keep the "Prime Number" outside the loop.
        // Because we can assume if the loop is completed Not a Prime is not executed meaning the number is prime.

        if (flag) {
            System.out.println("Prime Number");
        }
    }
}
