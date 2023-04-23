// Реализовать простой калькулятор (введите первое число, 
// введите второе число, введите требуемую операцию, ответ)

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber, secondNumber, answer;
        char operation;

        System.out.print("Введите первое число: ");
        firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        secondNumber = scanner.nextInt();
        System.out.print("Введите оперцию(+,-,*,/):");
        operation = scanner.next().charAt(0);

        boolean correct = true;
        switch (operation) {
            case '+':
                answer = firstNumber + secondNumber;
                break;
            case '-':
                answer = firstNumber - secondNumber;
                break;
            case '*':
                answer = firstNumber * secondNumber;
                break;
            case '/':
                answer = firstNumber / secondNumber;
                break;
            default:
                answer = 0;
                correct = false;
        }

        System.out.println(correct ? "Ответ: " + answer : "Неверная операция!");
        scanner.close();
    }
}
