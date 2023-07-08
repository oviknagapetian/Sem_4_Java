package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Создание LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Добавление элементов в конец списка
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Добавление элемента в определенную позицию
        linkedList.add(1, "Mango");

        // Получение элемента по индексу
        String firstElement = linkedList.get(0);
        String lastElement = linkedList.get(linkedList.size() - 1);

        System.out.println("Первый элемент: " + firstElement);
        System.out.println("Последний элемент: " + lastElement);

        // Итерация по элементам списка
        System.out.println("Элементы списка:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Удаление элемента по значению
        linkedList.remove("Banana");

        // Удаление элемента по индексу
        linkedList.remove(0);

        System.out.println("Список после удаления:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }
    }
}
