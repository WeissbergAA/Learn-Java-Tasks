package org.example;

import java.util.Scanner;

public class Calculator3 { // Объявление класса Calculator
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

        System.out.println("Вычисления: " + num1 + " " + operator + " " + num2 + " = " + result); // логирование вычислений

        scanner.close(); // Закрытие объекта Scanner
    }

    public static double calculate(double num1, char operator, double num2) { // Метод для выполнения операции
        double result = Double.NaN; /* Инициализация переменной результата.Double.NaN позволяет обработать случаи деления на ноль или выполнения недопустимой операции.
                                    Когда результат вычислений не определен из-за деления на ноль или из-за неверной операции (например, деление на символ или умножение на букву), возвращение Double.NaN вместо реального числового значения помогает программе обозначить, что результат некорректен или неопределен.
                                    В методе main после вызова метода calculate, проверяется, является ли результат Double.NaN. Если да, то выводится сообщение об ошибке, иначе выводится результат вычислений.
                            */

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            }
        }

     return result; // Возвращаем результат вычислений

    }
}

//как залогировать любые калькуляции которые этот метод делает, нужна ли переменная relult и обьяснить почему
