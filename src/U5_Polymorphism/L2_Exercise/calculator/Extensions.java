package U5_Polymorphism.L2_Exercise.calculator;

public class Extensions {
    public static InputInterpreter buildInterpreter(CalculationEngine engine) {
        return new InputInterpreter(engine);
    }
}
