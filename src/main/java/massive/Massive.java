package org.example;

import java.util.Arrays;

public class Massive {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 2, 3, 5}; // Создание исходного массива
        int[] noDuplicates = removeDuplicates(originalArray); // Вызов метода removeDuplicates для удаления дубликатов

        System.out.println("Исходный массив: " + Arrays.toString(originalArray)); // Вывод исходного массива в консоль с помощью метода toString из класса Arrays
        System.out.println("Массив без дубликатов: " + Arrays.toString(noDuplicates)); // Вывод массива без дубликатов в консоль с помощью метода toString из класса Arrays

    }

    /* Метод для удаления дубликатов из массива */
    public static int[] removeDuplicates(int[] arr) {
        int length = arr.length; // Получаем начальную длину массива
        for (int i = 0; i < length; i++) { // Проходим через каждый элемент массива
            for (int j = i + 1; j < length; j++) { // Проверяем каждый элемент после текущего элемента на дубликаты
                if (arr[i] == arr[j]) { // Если найден дубликат
                    arr[j] = arr[length - 1]; // Заменяем дубликат последним элементом в массиве
                    length--; // Уменьшаем размер массива на 1
                    j--; // Уменьшаем индекс j, чтобы проверить новый элемент на дубликат
                }
            }
        }
        int[] noDuplicates = Arrays.copyOf(arr, length); // Создаем новый массив с уникальными элементами путем копирования исходного массива до новой длины
        return noDuplicates; // Возвращаем массив без дубликатов
    }
}


/* Задача: Написать метод, который принимает массив целых чисел и возвращает новый массив из чисел из исходного массива без дубликатов. 
В методе main нужно вызвать этот метод, результат выполнения метода напечатать в консоль  */

