import java.util.Scanner;

public class CalculatorView implements ICalculatorView{
     // В этом классе реализован Принцип единственной обязанности
    // Он занимается только отображением информации и получением ввода от пользователя
    private CalculatorPresenter presenter;
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public void setPresenter(CalculatorPresenter presenter) {
        this.presenter = presenter;
    }

    public void displayMenu() { // Принцип разделения интерфейса
        System.out.println("Меню калькулятора:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("0. Выход");
    }

    public void getInput() {
        System.out.print("Введите ваш выбор: ");
        int choice = scanner.nextInt();

        if (choice != 0) {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            presenter.performOperation(choice, num1, num2);
        }
    }

    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }
}
