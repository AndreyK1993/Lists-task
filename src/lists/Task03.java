package lists;

import java.util.LinkedList;

public class Task03 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("orange");
        list.add("grape");
        list.add("apple");
        list.add("lemon");

        System.out.println("Initial list: ");
        printList(list);

        // Додання елемента в першу позицію
        list.addFirst("plum");
        // Додання елемента в останню позицію
        list.addLast("mango");

        System.out.println("\nEdited list:");
        printList(list);
    }
    // Метод для вывода списка
    private static void printList(LinkedList<String> list) {
        int index = 1;
        for (String str : list) {
            System.out.println(index + ") " + str);
            index++;
        }
    }
}
