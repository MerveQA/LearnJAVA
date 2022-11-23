package src.j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {

        /*
        Deque: Double Ended Queue -> Queue`larda FIFO Deque`lerde hem FIFO hem LIFO gecerli
        LIFO: Last in First Out
         */
        Deque<String>dq1=new LinkedList<>(Arrays.asList("Kusleme","Onkol","Bobrek Yatagi","Ezme","Haydari"));
        System.out.println("dq1 = " + dq1); // [Kusleme, Onkol, Bobrek Yatagi, Ezme, Haydari]
        dq1.add("Humus");
        System.out.println("dq1 = " + dq1); // [Kusleme, Onkol, Bobrek Yatagi, Ezme, Haydari, Humus]

        System.out.println("dq1.getFirst() = " + dq1.getFirst()); // Kusleme
        System.out.println("dq1 = " + dq1); // [Kusleme, Onkol, Bobrek Yatagi, Ezme, Haydari, Humus]

        System.out.println("dq1.getLast() = " + dq1.getLast()); // Humus
        System.out.println("dq1 = " + dq1); // [Kusleme, Onkol, Bobrek Yatagi, Ezme, Haydari, Humus]

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst()); // Kusleme
        System.out.println("dq1 = " + dq1); // [Kusleme, Onkol, Bobrek Yatagi, Ezme, Haydari, Humus]

        System.out.println("dq1.peekLast() = " + dq1.peekLast()); // Humus
        System.out.println("dq1 = " + dq1); // [Kusleme, Onkol, Bobrek Yatagi, Ezme, Haydari, Humus]

        /*
        TRICK: getFirst() meth deque coll. boş ise  NoSuchElementException firlatır
               peekFirst() math. deque boş ise null return eder.
         */

        dq1.clear();
        System.out.println("dq1 = " + dq1); // []

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst()); // null
        //System.out.println("dq1.getFirst() = " + dq1.getFirst()); // NoSuchElementException

        System.out.println("Agam Selametle devamkeee");

        Deque<String>dq2=new LinkedList<>(Arrays.asList("Havuc Dilimi","Gullac","Muhallebi","Trilece","Kazan Dibi"));

        System.out.println("dq2.pollFirst() = " + dq2.pollFirst()); //Havuc Dilimi
        System.out.println("dq2.pollLast() = " + dq2.pollLast()); // Kazan Dibi
        System.out.println("dq2.removeFirst() = " + dq2.removeFirst()); // Gullac
        System.out.println("dq2.removeLast() = " + dq2.removeLast()); // Trilece

        System.out.println("Agam Selametle devamkeee");

        dq2.clear();

        System.out.println("dq2.pollFirst() = " + dq2.pollFirst()); // null
        System.out.println("dq2.pollLast() = " + dq2.pollLast()); // null
        //System.out.println("dq2.removeFirst() = " + dq2.removeFirst()); // NoSuchElementException
        //System.out.println("dq2.removeLast() = " + dq2.removeLast()); // NoSuchElementException

        System.out.println("Agam Selametle devamkeee");

    }
}
