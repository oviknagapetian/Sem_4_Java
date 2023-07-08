package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Пример использования методов для переворота списка и работы с очередью
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Переворачиваем список
        LinkedList<Integer> reversedList = reverseLinkedList(list);
        System.out.println("Перевернутый список: " + reversedList);

        // Работа с очередью
        QueueLinkedList<Integer> queue = new QueueLinkedList<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Первый элемент в очереди: " + queue.first());

        int dequeuedElement = queue.dequeue();
        System.out.println("Извлеченный элемент из очереди: " + dequeuedElement);

        System.out.println("Первый элемент в очереди после извлечения: " + queue.first());
    }

    // Метод для переворота LinkedList
    private static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();

        for (Integer element : list) {
            reversedList.addFirst(element);
        }

        return reversedList;
    }

    // Класс реализации очереди на основе LinkedList
    private static class QueueLinkedList<E> {
        private LinkedList<E> queue;

        public QueueLinkedList() {
            queue = new LinkedList<>();
        }

        // Добавление элемента в конец очереди
        public void enqueue(E element) {
            queue.addLast(element);
        }

        // Извлечение и удаление первого элемента из очереди
        public E dequeue() {
            return queue.pollFirst();
        }

        // Получение первого элемента из очереди без его удаления
        public E first() {
            return queue.peekFirst();
        }
    }
}
