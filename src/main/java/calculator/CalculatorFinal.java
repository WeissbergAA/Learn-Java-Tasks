package org.example;

import java.util.Scanner;

public class CalculatorFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Выберите операцию (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        try {
            double result = calculate(num1, operator, num2);
            System.out.println("Результат: " + result);
            System.out.println("Вычисления: " + num1 + " " + operator + " " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль или неверная операция.");
        }

        scanner.close();
    }

    public static double calculate(double num1, char operator, double num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Деление на ноль");
                }
            default:
                throw new IllegalArgumentException("Неверная операция");
        }
    }
}
