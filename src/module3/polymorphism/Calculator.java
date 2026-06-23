package module3.polymorphism;

public class Calculator {

    double add(double a, int b) {
        return a + b;
    }

    double add(int a,  double other) {
        return a + other;
    }
}
