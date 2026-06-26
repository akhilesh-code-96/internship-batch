package module4.string;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class Test {

    public static void main(String[] args) {
        // String is non-primitive
        // Non-primitive --> Objects and arrays
        // They take space in heap memory
        // String is immutable object
        // String concatenation
        // String traversal
        // String pool

        // String traversal
//        String s = "Rupan";
//
//        String sLower = s.toUpperCase();
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch = sLower.charAt(i);
//            System.out.println(ch);
//        }
        // Object gets stored in heap
        // String pool
        //

//        String s = "Hello World";
//        String s1 = "World";

//        s = s + " " + s1; // concatenation
//
//        int indx = s.indexOf("e");
//
//        System.out.println(indx);

        // Q1. Reverse a string --> olleh
//        String result = "";
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            result += s.charAt(i);
//        }
//
//        System.out.println(result);

        // Q2. My name is Akhilesh
        // Akhilesh is name My

//        String[] arr = s.split(" ");
//        System.out.println(Arrays.toString(arr));

//        String s = "My name is Akhilesh";
//        boolean check = s.equalsIgnoreCase("my name is Akhilesh");
//        System.out.println(check);

//        String[] words = s.split(" ");
//        String result = "";
//
//        for (int i = words.length - 1; i >= 0; i--) {
//            if (i == 0) {
//                result += words[i];
//            } else {
//                result = result + words[i] + " ";
//            }
//        }
//
//        System.out.println(result);

        // Q3. How to check if the number is palindrome?
        // 121, 111
        // Check if the string is palindrome or not?
        // == and equals

//        String s = "Hello";
//        String s1 = "Hello";

        // With new keyword we are enforcing the creation of another object in the heap
//        String s2 = new String("Hello");
//        String s3 = new String("Hello");
//
//        System.out.println(s2.equals(s3));

        // StringBuilder > String
        // StringBuffer != StringBuilder
        // StringBuffer java 1.2
        // StringBuilder java 5
        // StringBuffer --> slower, because of it synchronous nature -> locks overhead
        // Thread safe, best use case --> Multi-threaded environment

        // StringBuilder --> faster, not thread safe
        // Best use case single threaded environment

//        String s = "Hello";
//        StringBuilder sb = new StringBuilder(s);

//        for (int i = s.length() - 1; i >= 0; i--) {
//            sb.append(s.charAt(i));
//        }

//        String output = sb.reverse().toString();
//
//        System.out.println(output);

    }

}
