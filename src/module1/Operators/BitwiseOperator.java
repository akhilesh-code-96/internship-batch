package module1.Operators;

public class BitwiseOperator {
    // This is the part of bit manipulation
    public static void main(String[] args) {
        int a = 7;
        int b = -10;

        // I want to perform AND operation on this.
//        System.out.println(Integer.toBinaryString(b));
//        int c = ~b; // -(n + 1);
//        System.out.println(c);
//        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(b));
        int c = b >>> 1;
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));
//        int d = b >>> 1;
//        System.out.println(d);
//        System.out.println(Integer.toBinaryString(d));
    }
}
