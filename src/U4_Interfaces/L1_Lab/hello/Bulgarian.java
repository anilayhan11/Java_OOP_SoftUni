package U4_Interfaces.L1_Lab.hello;

public class Bulgarian implements Person {
    private String name;

    public Bulgarian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Здравей!";
    }
}
