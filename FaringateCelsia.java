package org.example;

import java.util.Scanner;

public class FaringateCelsia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Создаем объект Scanner для считывания ввода пользователя
        System.out.println("Выберите тип преобразования:"); // Вывод сообщения пользователю
        System.out.println("1. Цельсий в Фаренгейт");
        System.out.println("2. Фаренгейт в Цельсий");
        int choice = input.nextInt(); // Считывание выбора пользователя

        if (choice == 1) { // Если выбрано преобразование из Цельсия в Фаренгейт
            System.out.println("Введите температуру в градусах Цельсия(дробные через запятую) ");
            double celsius = input.nextDouble(); // Считываем температуру в Цельсиях
            double fahrenheit = celsiusToFahrenheit(celsius); // Вызываем метод для преобразования
            System.out.println("Введите температуру в градусах Фаренгейта(дробные через запятую):" + fahrenheit); // Выводим результат
        } else if (choice == 2) { // Если выбрано преобразование из Фаренгейта в Цельсий
            System.out.println("Температура в градусах Фарингейта: ");
            double fahrenheit = input.nextDouble(); // Считываем температуру в Фаренгейтах
            double celsius = fahrenheitToCelsius(fahrenheit); // Вызываем метод для преобразования
            System.out.println("Температура в градусах Цельсия: " + celsius); // Выводим результат
        } else {
            System.out.println("Неверный выбор. Пожалуйста, выберите 1 или 2."); // Выводим сообщение об ошибке при некорректном выборе
        }

        input.close(); // Закрываем Scanner после использования
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; // Формула для преобразования из Цельсия в Фаренгейт
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; // Формула для преобразования из Фаренгейта в Цельсий
    }
}


/* Задача: Написать программу, которая преобразует температуру в градусы Цельсия и Фаренгейта */
