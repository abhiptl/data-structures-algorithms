package DataStructures.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListIterator {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        ListIterator<Integer> iterator = list.listIterator();


        int i = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if(i == 2) {
                iterator.add(22);
            }
            i++;
        }
        System.out.println("List : "+list);

    }
}
