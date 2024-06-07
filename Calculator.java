package org.example;

import java.util.Scanner;

public class Calculator { // Объявление класса Calculator
    public static void main (String[] args) { //
        Scanner scanner = new Scanner(System.in); // Создание объекта Scanner для ввода данных с клавиатуры

        System.out.println("Введите первое число:"); // Вывод сообщения на консоль
        double num1 = scanner.nextDouble(); // Считывание первого числа с клавиатуры и сохранение в переменную num1

        System.out.println("Выберите операцию (+, -, *, /):"); // Вывод сообщения на консоль
        char operator = scanner.next().charAt(0); // Считывание оператора (+, -, *, /) с клавиатуры и сохранение первого символа в переменную operator
                                                 //CharAt - метод класса String возвращает символ строки по индексу

        System.out.println("Введите второе число:"); // Вывод сообщения на консоль
        double num2 = scanner.nextDouble(); // Считывание второго числа с клавиатуры и сохранение в переменную num2

        double result ; // Объявление переменной result для хранения результата вычислений

        switch (operator) { // Начало блока switch-case для выполнения различных операций в зависимости от оператора
            case '+': // Если оператор '+'
                result = num1 + num2; // Выполнение сложения и сохранение результата в переменную result
                break; // Завершение выполнения операции и выход из switch-case
            case '-': // Если оператор '-'
                result = num1 - num2; // Выполнение вычитания и сохранение результата в переменную result
                break; // Завершение выполнения операции и выход из switch-case
            case '*': // Если оператор '*'
                result = num1 * num2; // Выполнение умножения и сохранение результата в переменную result
                break; // Завершение выполнения операции и выход из switch-case
            case '/': // Если оператор '/'
                if (num2 != 0) { // Проверка деления на ноль
                    result = num1 / num2; // Выполнение деления и сохранение результата в переменную result
                } else { // Если деление на ноль
                    System.out.println("Ошибка: деление на ноль."); // Вывод сообщения об ошибке
                    return; // Завершение выполнения программы   Вынести в отдельный метод функцию калькулирования оставить в мейне только вывод . добавить выбрасывание исключения *
                }
                break; // Завершение выполнения операции и выход из switch-case
            default: // Если оператор не соответствует ни одному из case
                System.out.println("Неверная операция."); // Вывод сообщения об ошибке
                return; // Завершение выполнения программы.  добавить выбрасывание исключения *
        }

        System.out.println("Результат: " + result); // Вывод результата вычислений на консоль

        scanner.close(); // Закрытие объекта Scanner
    }
}
