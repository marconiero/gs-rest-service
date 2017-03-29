package hello;

public class HelloWorld {
    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        Greeter2 greeter2 = new Greeter2();
        System.out.println(greeter.sayHello());
        System.out.println(greeter2.sayHello2());
    }
}