package module3;

public class Test {

    public static void main(String[] args) {
        Car bmw = new Car("BMW", 240);
        Car mercedes = new Car("Mercedes", 243);


        System.out.println("Top speed of BMW -> " + bmw.getSpeed());
        System.out.println("Top speed of Mercedes -> " + mercedes.getSpeed());

        Car.CONSTANT="Changed Constant";

        System.out.println(bmw.CONSTANT);
        System.out.println(mercedes.CONSTANT);
    }
}
