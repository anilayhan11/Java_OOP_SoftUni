package U4_Interfaces.L1_Lab.hello;

public interface Person {
    String getName();

    default String sayHello() {
        return "Hello!";
    }
}
