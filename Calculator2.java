package org.example;

import java.util.Scanner;

public class Calculator2 { // Объявление класса Calculator
    public static void main(String[] args) { // Точка входа в программу
        Scanner scanner = new Scanner(System.in); // Создание объекта Scanner для ввода данных с клавиатуры

        System.out.println("Введите первое число:"); // Вывод сообщения на консоль
        double num1 = scanner.nextDouble(); // Считывание первого числа с клавиатуры и сохранение в переменную num1

        System.out.println("Выберите операцию (+, -, *, /):"); // Вывод сообщения на консоль
        char operator = scanner.next().charAt(0); // Считывание оператора (+, -, *, /) с клавиатуры и сохранение первого символа в переменную operator

        System.out.println("Введите второе число:"); // Вывод сообщения на консоль
        double num2 = scanner.nextDouble(); // Считывание второго числа с клавиатуры и сохранение в переменную num2

        double result = calculate(num1, operator, num2); // Вызов метода calculate для выполнения операции

        if (Double.isNaN(result)) {
            System.out.println("Ошибка: деление на ноль или неверная операция."); // Вывод сообщения об ошибке
        } else {
            System.out.println("Результат: " + result); // Вывод результата вычислений на консоль
        }

        scanner.close(); // Закрытие объекта Scanner
    }

    public static double calculate(double num1, char operator, double num2) { // Метод для выполнения операции
        double result = Double.NaN; // Инициализация переменной результата

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                }
                break;
         //  default:
         //       break;
        }

        return result; // Возвращаем результат вычислений
    }
}
