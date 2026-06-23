package module1.Operators;

public class UnaryOperator {

    /*
    There is only operand required to perform the operation
    ~
    !
    ++ increment
    -- decrement // most widely used in while loop and in the for loop;
     */

    public static void main(String[] args) {
        int a = 4;

        System.out.println(a--); // 4
        // There is a concept called pre-increment and post-increment in java or in other languages.

        // What should be the output?
        System.out.println(a); // 3
    }
}
