package module3.innerClass;

public class Outer {
    private String name = "Akhilesh";

    public void method() {
        System.out.println("Method of outer class");
    }

    class Inner {
        void show() {
            System.out.println("My name is " + name);
        }
    }
}
