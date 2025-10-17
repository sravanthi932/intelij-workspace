package basic_programming;

public class FunctionalInterfaceWithLambda {
    public static void main(String[] args) {
        MyInterface mi = () -> {
            System.out.println("my name is sravs");
        };
        mi.myMethod();

    }
}

