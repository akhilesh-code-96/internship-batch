package module3.innerClass;

public class Test {

    public static void main(String[] args) {
//        Outer outer = new Outer() {
//            @Override
//            public void method() {
//                System.out.println("Implementation method");
//            }
//        };
//
//        outer.method();

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        inner.show();
    }
}


//class Impl extends Outer {
//    @Override
//    public void method() {
//        System.out.println("Implementation method");
//    }
//}