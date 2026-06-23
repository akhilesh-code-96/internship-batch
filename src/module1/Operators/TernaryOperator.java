package module1.Operators;

import java.util.Scanner;

public class TernaryOperator {
    /*
    condition ? expression1 : expression2;
     */

    // To understand ternary operator we need to understand the basics of control statements.
    // That is if-else statement

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary below: ");
        int salary = sc.nextInt();

        String output = salary > 50000 ? "Manager" : salary > 35000 && salary < 50000 ? "Technical Lead" : salary > 20000 && salary < 35000 ? "Associate Software Engineer" : "Junior Software Engineer";

        System.out.println(output);
    }
}
