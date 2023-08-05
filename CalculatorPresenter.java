public class CalculatorPresenter {
    private ICalculatorModel  model;  // Принцип инверсии зависимостей
    private ICalculatorView  view;

    public CalculatorPresenter(ICalculatorModel  model, ICalculatorView  view) {
        this.model = model; // Принцип инверсии зависимостей
        this.view = view;
        this.view.setPresenter(this);
    }
    public void handleUserInteraction() {
        view.displayMenu();
        view.getInput();
    }

    public void performOperation(int choice, double num1, double num2) {
        double result = 0;

        switch (choice) {
            case 1:
                result = model.add(num1, num2);
                break;
            case 2:
                result = model.subtract(num1, num2);
                break;
            case 3:
                result = model.multiply(num1, num2);
                break;
            case 4:
                result = model.divide(num1, num2);
                break;
            default:
                System.out.println("Неверный выбор!");
                return;
        }


        view.displayResult(result);
    }
}
