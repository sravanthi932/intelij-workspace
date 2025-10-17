package basic_programming;

public class FunctionalInterfacePractise {
    public static void main(String[] args) {
        MyInterface myinterface = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("My name is Sravanthi");
            }
        };
        myinterface.myMethod();
    }
}
