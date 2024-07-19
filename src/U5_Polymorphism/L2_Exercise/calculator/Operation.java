package U5_Polymorphism.L2_Exercise.calculator;

public interface Operation {
    void addOperand(int operand);
    int getResult();
    boolean isCompleted();
}