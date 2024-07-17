package org.example;

import java.util.Scanner;

public class FaringateCelsiaFinal {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in); // Создание объекта Scanner для считывания ввода пользователя

        try {
            System.out.println("Выберите тип преобразования:"); // Вывод сообщения пользователю
            System.out.println("1. Цельсий в Фаренгейт");
            System.out.println("2. Фаренгейт в Цельсий");
            int choice = scanner.nextInt(); // Считывание выбора пользователя

            double temperature;
            double convertedTemperature;

            if (choice == 1) { // Если выбрано преобразование из Цельсия в Фаренгейт
                System.out.println("Введите температуру в градусах Цельсия(дробные через запятую):");
                temperature = scanner.nextDouble(); // Считывание температуры в градусах Цельсия
                convertedTemperature = celsiusToFahrenheit(temperature); // Вызов метода для преобразования
                System.out.println("Температура в градусах Фаренгейта: " + convertedTemperature); // Вывод результата
            } else if (choice == 2) { // Если выбрано преобразование из Фаренгейта в Цельсий
                System.out.println("Введите температуру в градусах Фаренгейта(дробные через запятую):");
                temperature = scanner.nextDouble(); // Считывание температуры в градусах Фаренгейта
                convertedTemperature = fahrenheitToCelsius(temperature); // Вызов метода для преобразования
                System.out.println("Температура в градусах Цельсия: " + convertedTemperature); // Вывод результата
            } else {
                System.out.println("Неверный выбор. Пожалуйста, выберите 1 или 2."); // Вывод сообщения об ошибке
            }
        } catch (Exception e) { // Обработка исключений
            System.out.println("Произошла ошибка ввода. Пожалуйста, введите корректное значение."); // Вывод сообщения об ошибке
        } finally {
            scanner.close(); // Закрытие объекта Scanner после использования
        }
    }

    public static double celsiusToFahrenheit(double celsius) { // Метод для преобразования температуры из Цельсия в Фаренгейт
        return (celsius * 9 / 5) + 32; // Формула для преобразования
    }

    public static double fahrenheitToCelsius(double fahrenheit) { // Метод для преобразования температуры из Фаренгейта в Цельсий
        return (fahrenheit - 32) * 5 / 9; // Формула для преобразования
    }
}
/* Задача: Дописать программу с испоьзованием Try Cath и обработки исключений */
