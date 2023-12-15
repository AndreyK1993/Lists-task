package lists;

import java.util.ArrayList;
import java.util.List;

public class Task02 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("orange");
        list.add("mango");
        list.add("banana");
        list.add("apple");
        list.add("kiwi");
        list.add("cherry");

        System.out.println("Initial list: ");
        printList(list);

        keepListPart(list, "mango", "banana");

        System.out.println("\nList part: ");
        printList(list);
    }

    // Метод, который оставляет в списке только элементы, переданные в параметрах
    private static void keepListPart(List<String> list, String item1, String item2) {
        list.retainAll(List.of(item1, item2));  // Метод retainAll оставляет только элементы, содержащиеся в переданной коллекции
    }

    // Метод для вывода списка
    private static void printList(List<String> list) {
        int index = 1;
        for (String str : list) {
            System.out.println(index + ") " + str);
            index++;
        }
    }
}
