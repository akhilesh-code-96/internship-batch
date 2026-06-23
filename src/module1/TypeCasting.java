package module1;

public class TypeCasting {

    public static void main(String[] args) {

        int amount = 1500;

//        double convertedAmount = amount;

        float floatAmount = 1500.182f;
        // You cannot directly store the bigger value into the smaller data type.

//        int amountDouble = 1500.91;


        float convertedFloatAmount = amount;

        int amountConvertedToInteger = (int) floatAmount;
        System.out.println("Converted Amount -> " + amountConvertedToInteger);
        // When we do the explicit conversion of bigger data to smaller data type, we have to make a decision that whether we are okay with the possible data losses or not.
        // The float value was 1500.182 and we converted to the value of the integer that is 1500 there is a data loss of 0.182.

        // Data Overflow

        // Meaning we are trying to convert a larger value that cannot be held inside the memory storage of the smaller data type.


        long value = 10000000000000000L;

        int convertedLongValue = (int) value;
        System.out.println("Converted Integer value -> " + convertedLongValue);

        // Integer overflow
        // The value which we are trying to fit inside the integer memory is far beyond it's capacity

        char character = 'A';
        char someCharacter = 65;
        System.out.println("Ascii code value of the letter A -> " + (int) character);

//        System.out.println(convertedFloatAmount);


        // Literals
        // Hard coded values to the variable
        // Java follows camelCasing
        // this is the best practice
        // String firstName
        // Primitive Data Types
        // To understand we need to under if - else statement, conditions, switch statement, different types of loops
        // Then only we can jump to array.

        //
    }
}
