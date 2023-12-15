package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Task01 {

    public static void main (String[] args) {

        List<String> list = new ArrayList<>();
        list.add ("John");
        list.add ("Alice");
        list.add ("Robert");
        list.add ("Lisa");
        list.add ("David");
        list.add ("Amanda");

        for(String str : list)
            System.out.println(str);

        System.out.println("Initial list: ");
        printList(list);

        Collections.sort(list);

        System.out.println("\nSorted list: ");
        printList(list);
    }

    private static void printList(List<String> list) {
        int index = 1;
        for (String str : list) {
            System.out.println(index + ") " + str);
            index++;
        }
    }
}
