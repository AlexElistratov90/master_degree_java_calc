import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый операнд:");
        double operand1 = scanner.nextDouble(); // Переменная для сохранения первого операнда
        System.out.println("Введите одну из поддерживаемых операций (+, -, *, /)");
        char operation = scanner.next().charAt(0); // Переменная для сохранения операции
        System.out.println("Введите второй операнд:");
        double operand2 = scanner.nextDouble(); // Переменная для сохранения второго операнда

        // Вызов метода для вычисления результата
        double result = calculate(operand1, operand2, operation);

        if (result != Double.NaN) { // Проверка, что результат не является NaN (например, из-за деления на 0)
            System.out.println("Результат: " + result);
        }
    }

    // Метод для вычисления результата в зависимости от операции
    public static double calculate(double operand1, double operand2, char operation) {
        double result = Double.NaN; // Инициализация результата как NaN (Not a Number)

        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Ошибка: деление на 0 невозможно.");
                    result = Double.NaN; // Устанавливаем NaN, чтобы показать ошибку
                } else {
                    result = operand1 / operand2;
                }
                break;
            default:
                System.out.println("Введённая операция не поддерживается, повторите ввод");
        }
        return result;
    }
}
