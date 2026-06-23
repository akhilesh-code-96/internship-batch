package module3;

public class Car {
    // classes are like a blueprint on the top of which we can create objects.
    // class contains the attributes and the behavior

    // attributes
    // Instance variables
    String brand;
    private Integer speed;

    public static String CONSTANT="Constant";

    public static final String FINAL_ATTRIBUTE="Final Attribute";


    /*
    Top Level Class --> Most used, most use cases
    Member Inner Class --> barely used
    Static Inner Class --> barely used
    Local Inner Class --> You might not see it anywhere
    Anonymous Class --> This is helpful because it reduces the redundancy of creating the implementation class
    Final Class --> It is important if the user don't want the class to be extended or it's method to be not overridden by any other class.
     */

    // default constructor

    public Car() {};

    // Constructor
    public Car(String brand, Integer speed) {
        this.brand = brand;
        this.speed = speed;
    }


    // getters
    public String getBrand() {
        return brand;
    }

    public Integer getSpeed() {
        return speed;
    }


    // setters
    public void setTopSpeed(Integer speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }

    public static void staticMethod() {
        System.out.println("static method");
    }
}
