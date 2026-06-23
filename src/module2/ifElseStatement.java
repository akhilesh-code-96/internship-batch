package module2;

import java.util.Scanner;

public class ifElseStatement {

    public static void main(String[] args) {
        // if the provided condition is true then do something else do the other thing
        // if a < b then print hello world else print how are you?
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value below: ");

        // implicit type casting in java

        // if the provided value is of smaller data type then it will be implicitly type casted to the higher data type
//        String str = "123";
//
//        Integer valueOfInteger = Integer.parseInt(str);
//
//        System.out.println(valueOfInteger);
//        System.out.println();


//        if (sc.hasNextDouble()) {
//            System.out.println("Hello World!");
//        } else {
//            System.out.println("Invalid input");
//        }


        if (10 > 2) {
            System.out.println("Something");
        }

        else {
            System.out.println("Much greater");
        }


        if (false) {
            System.out.println("Condition is always true");
        }
    }
}
