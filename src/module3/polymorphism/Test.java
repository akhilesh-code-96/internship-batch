package module3.polymorphism;

public class Test {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double addition = calculator.add(10, 2.2);
        System.out.println("Addition: " + addition);
    }
}
