import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый операнд:");
        double operand1 = scanner.nextDouble(); // Переменная для сохранения первого операнда. Double вместо Int для поддержки дробных операндов
        System.out.println("Введите одну из поддерживаемых операций (+, -, *, /, ^)");
        char operation = scanner.next().charAt(0); // Переменная для сохранения операции
        System.out.println("Введите второй операнд:");
        double operand2 = scanner.nextDouble(); // Переменная для сохранения второго операнда
        double result; // Переменная для сохранения результата

        switch (operation) { //При помощи оператора switch проверяем какой операнд был введён и в зависимости от этого выполняем ту или иную операцию
            case '+' -> {
                result = operand1 + operand2;
                System.out.println(operand1 + " + " + operand2 + " = " + result); // Осуществляем вывод
            }
            case '-' -> {
                result = operand1 - operand2;
                System.out.println(operand1 + " - " + operand2 + " = " + result);
            }
            case '*' -> {
                result = operand1 * operand2;
                System.out.println(operand1 + " * " + operand2 + " = " + result);
            }
            case '/' -> {
                result = operand1 / operand2;
                System.out.println(operand1 + " / " + operand2 + " = " + result);
            }
            default -> System.out.println("Введённая операция не поддерживается, повторите ввод"); // При введении некорректной операции сообщаем об этом
        }

    }
}
