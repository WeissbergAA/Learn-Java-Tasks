package org.example;

import java.util.ArrayList;
import java.util.List;

class Menu { // Объявление класса Menu
    private List<Dish> dishes; // Объявление приватного списка dishes, хранящего объекты класса Dish

    public Menu() { // Конструктор класса Menu
        this.dishes = new ArrayList<>(); // Инициализация списка dishes как внутреннего массива
    }

    public void addDish(Dish dish) { // Метод добавления блюда в меню
        dishes.add(dish); // Добавление блюда в список dishes
    }

    public List<Dish> getDishes() { // Метод получения списка блюд из меню
        return dishes; // Возвращение списка блюд
    }
}

class Dish { // Объявление класса Dish
    private String name; // Объявление приватной переменной name типа String
    private double price; // Объявление приватной переменной price типа double

    public Dish(String name, double price) { // Конструктор класса Dish с параметрами name и price
        this.name = name; // Присвоение значения name
        this.price = price; // Присвоение значения price
    }

    public String getName() { // Метод получения имени блюда
        return name; // Возвращение имени блюда
    }

    public double getPrice() { // Метод получения цены блюда
        return price; // Возвращение цены блюда
    }
}

class Order { // Объявление класса Order
    private List<Dish> dishes; // Объявление приватного списка dishes, хранящего объекты класса Dish

    public Order() { // Конструктор класса Order
        this.dishes = new ArrayList<>(); // Инициализация списка dishes как нового ArrayList
    }

    public void addDish(Dish dish) { // Метод добавления блюда в заказ
        dishes.add(dish); // Добавление блюда в список dishes
    }

    public double getTotalPrice() { // Метод расчета общей стоимости заказа
        return dishes.stream().mapToDouble(Dish::getPrice).sum(); // Суммирование цен блюд в заказе
    }

    public List<Dish> getDishes() { // Метод получения списка блюд в заказе
        return dishes; // Возвращение списка блюд
    }
}

public class Restaurant { // Объявление класса Restaurant
    public static void main(String[] args) { // Главный метод программы
        Menu menu = new Menu(); // Создание объекта класса Menu

        Dish dish1 = new Dish("Карбонара", 450.30); // Создание объекта класса Dish с указанием имени и цены
        Dish dish2 = new Dish("Том ям", 860); // Создание еще одного объекта класса Dish

        menu.addDish(dish1); // Добавление первого блюда в меню
        menu.addDish(dish2); // Добавление второго блюда в меню

        Order order = new Order(); // Создание объекта класса Order

        order.addDish(dish1); // Добавление первого блюда в заказ
        order.addDish(dish2); // Добавление второго блюда в заказ

        System.out.println("Список блюд в меню:"); // Вывод сообщения о списке блюд в меню
        for (Dish dish : menu.getDishes()) { // Цикл для перебора всех блюд в меню
            System.out.println(dish.getName() + " - ₽" + dish.getPrice()); // Вывод названия и цены каждого блюда
        }

        System.out.println("Заказ:"); // Вывод сообщения о заказе
        for (Dish dish : order.getDishes()) { // Цикл для перебора всех блюд в заказе
            System.out.println(dish.getName() + " - ₽" + dish.getPrice()); // Вывод названия и цены каждого блюда в заказе
        }

        System.out.println("Общая стоимость заказа: ₽" + order.getTotalPrice()); // Вывод общей стоимости заказа
    }
}


/* Задача: Создать программу, которая моделирует ресторан, используя композицию и агрегацию. У вас могут быть такие классы, как Меню, Блюдо и Заказ. 
Меню содержит блюда, которые являются заказами блюд. Заказ содержит список блюд и может возвращать общую стоимость.*/
