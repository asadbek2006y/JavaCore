package JavaLambda;

public class Main {

    public static void main(String[] args) {

        String name = "BRO";
        MyInterface myInterface = (x) -> {
            System.out.println("Hello World");
            System.out.println("It is a nice day, no?");
        };
        myInterface.message(name);
    }
}
