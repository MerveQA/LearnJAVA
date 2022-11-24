package src.j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C03_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("javaCAN","Ebubekir", "Gülsüm","Ebubekir", "Adem", "İlker","javaCAN", "Merve"));
        System.out.println("ll1 = " + ll1); // [javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve]

        // LinkedList remove(); -> ilk node silinir ve silinen node return edilir
        System.out.println("ll1.remove() = " + ll1.remove()); //javaCAN
        System.out.println("ll1 = " + ll1); // [Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve]

        System.out.println("ll1.remove(3) = " + ll1.remove(3)); // Adem -> silinen node return eder.
        System.out.println("ll1 = " + ll1); // [Ebubekir, Gülsüm, Ebubekir, İlker, javaCAN, Merve]

        System.out.println("ll1.remove(\"Merve\") = " + ll1.remove("Merve")); // true -> olan node true return eder.
        System.out.println("ll1.remove(\"JavaTAR\") = " + ll1.remove("JavaTAR")); // false -> olmayan node false return eder.
        System.out.println("ll1 = " + ll1); // [Ebubekir, Gülsüm, Ebubekir, İlker, javaCAN]

        // removeFirstOccurrence(); -> Belirtilen öğenin bu listedeki ilk örneğini kaldırır
        System.out.println("ll1.removeFirstOccurrence(\"Ebubekir\") = " + ll1.removeFirstOccurrence("Ebubekir")); // true
        System.out.println("ll1 = " + ll1); // [Gülsüm, Ebubekir, İlker, javaCAN]

        // element(); -> ilk node`u return eder.
        System.out.println("ll1.element() = " + ll1.element()); // ilk node`u return eder. -> Gülsüm

        System.out.println("\n*****\n");
        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("javaCAN","Ebubekir", "Gülsüm","Ebubekir", "Adem", "İlker","javaCAN", "Merve"));
        LinkedList<String> ll3 = new LinkedList<>(Arrays.asList("Hasan","Harun", "Haluk","Hasmayan"));

        //addAll();
        ll2.addAll(ll3);
        System.out.println("ll2 = " + ll2); //[javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve, Hasan, Harun, Haluk, Hasmayan]

        //removeAll();
        System.out.println("ll2.removeAll(ll3) = " + ll2.removeAll(ll3)); // true
        System.out.println("ll2 = " + ll2); // [javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve]

        // LinkedList; get(), getFirst(), getLast() -> girilen index ve ilk son node return eder.
        System.out.println("ll2.get(2) = " + ll2.get(2)); // Gülsüm
        System.out.println("ll2.getFirst() = " + ll2.getFirst()); // javaCAN
        System.out.println("ll3.getLast() = " + ll3.getLast()); //  Hasmayan

        List<Integer> ll4 = new LinkedList<>(Arrays.asList(1,3,4,6,7,54,34,45));
        System.out.println("ll4 = " + ll4);
        ll4.remove(3);// remove() method'unun icine integer yazılırsa  eleman değil index olarak tanımanır .
        //Burada index'i 3 olan 6 silinir.
        //remove() method'unun icinde olmayan bir index kullanirsaniz
        //Java IndexOutOfBoundsException throw eder
        //ll1.remove(33);


        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");

        linkedList.add("B");

        linkedList.add("C");

        linkedList.add("B");

        linkedList.add("D");




    }
}
