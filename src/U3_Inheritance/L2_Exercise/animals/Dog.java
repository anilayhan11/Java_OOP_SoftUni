package U3_Inheritance.L2_Exercise.animals;

public class Dog extends Animal{
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    public String produceSound(){
        return "Woof!";
    }
}
