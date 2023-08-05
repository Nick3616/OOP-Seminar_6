public interface ICalculatorView {
    void setPresenter(CalculatorPresenter presenter); 
    void displayMenu(); // Принцип разделения интерфейса
    void getInput();
    void displayResult(double result);
}