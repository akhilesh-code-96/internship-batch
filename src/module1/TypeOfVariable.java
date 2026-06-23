package module1;

public class TypeOfVariable {

    // instance variable that belongs to the object but it has to be declared outside the methods.

    int age;

    // static variable --> It belongs to the class, you don't have to create an instance of the class to access it.
    // To save memory if there is any variable or pre-defined which the user wants to remain same for all the objects.
    static int firstName;




    public static void main(String[] args) {
        // final --> once declared, it cannot be re-assigned.
        // this particular type of variable is used to declare constants.
        // The value PI is always going 3.14. So, it should be declared as constant.
        final double PI = 3.14;
        final int number = 129;

        // number = 128 --> this is not possible.


    }
}
