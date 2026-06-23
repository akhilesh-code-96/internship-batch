package module3.inheritance.singleInheritance;

public class Parent {

    Parent(String name) {
        System.out.println("Parent Constructor -> " + name);
    }

//    void show() {
//        System.out.println("Parent method...");
//    }
}


class Child extends Parent {

    Child() {
        super("David");
        System.out.println("Child Constructor...");
    }
//    private int age = 5;

//    @Override
//    void show() {
//        System.out.println("Parent age -> " + super.age);
//        System.out.println("Child age -> " + this.age);
//    }
}


