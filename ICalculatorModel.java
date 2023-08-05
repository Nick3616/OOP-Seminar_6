public interface ICalculatorModel {
    double add(double num1, double num2); // Принцип разделения интерфейса
    double subtract(double num1, double num2);
    double multiply(double num1, double num2);
    double divide(double num1, double num2);
}