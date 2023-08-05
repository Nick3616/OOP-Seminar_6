public class CalculatorModel implements ICalculatorModel {
    // В этом классе реализован Принцип единственной обязанности 
    // Каждый метод выполняет только одну операцию
    public double add(double num1, double num2) { 
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Деление на ноль недопустимо");
        }
    }
}

