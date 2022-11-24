package src.j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {

        /*
        Queue Coll. interface oldugu icin child class olan LinkedList ve PriorityQueue ile obje uretilir.
        Eczane yemekhane vs. belirli sart ile aksiyon alan elemanlar icin kullanilir.
        Cons. secimine gore queue obj ozellikleri belirlenir.
        FIFO -> first in first out: Collectiona ilk giren ilk cikar. Eleman en sona eklenir.
         */

        Queue<String> q1= new LinkedList<>(Arrays.asList("Cebrail","Sumeyra","Yakup","Muharrem"));

        System.out.println("q1 = " + q1); // [Cebrail, Sumeyra, Yakup, Muharrem]

        q1.add("Erol");
        System.out.println("q1 = " + q1); // [Cebrail, Sumeyra, Yakup, Muharrem, Erol]

        Queue<String> q2= new PriorityQueue<>(Arrays.asList("JavaCAN","JavaSU","JavaNAZ","Javiye"));
        System.out.println("q2 = " + q2); // [JavaCAN, JavaSU, JavaNAZ, Javiye]

        q2.add("Javidan");
        System.out.println("q2 = " + q2); // [Javidan, JavaCAN, JavaNAZ, Javiye, JavaSU]

        // element();
        System.out.println("q1.element() = " + q1.element()); // Cebrail

        // peek();
        System.out.println("q1.peek() = " + q1.peek()); // Cebrail
        System.out.println();
        System.out.println();
        System.out.println();

        //remove();
        System.out.println(q2);
        System.out.println("q1.remove() = " + q2.remove()); //
        System.out.println();
        System.out.println();
        System.out.println();
        //poll();
       // System.out.println("q1.poll() = " + q1.poll()); // Cebrail

        /*
        peek() -> copy-paste gibi ilk elemani return eder ama silmez.
        poll() -> cut-paste ilk elemani siler ve return eder.
        element() -> ilk elemani silmeden return eder.
        remove(); -> ilk elemani siler ve return eder.

        TRICK: poll ve remove farki -> eger queue coll. bos ise remove NoScuhException, poll ise null return eder.
         */

        q1.clear(); // que coll. elemanlari silindi.
        System.out.println("q1 = " + q1); // []
        System.out.println("q1.size() = " + q1.size()); // 0
        System.out.println("q1.poll() = " + q1.poll()); // null
        //System.out.println("q1.remove() = " + q1.remove()); // NoSuchElementException

        //offer(); -> queue coll. eleman eklemek icin kullanilir.
        System.out.println("q2.offer() = " + q2.offer("kusneme")); // true

        /*
        TRICK: offer ve add farki -> eger queue coll. eleman kisitlamasi yapilmis ise add methodu Exception firlatir.
        Offer ise true/false return eder.
         */


        Queue<String> q = new PriorityQueue<>();

        q.add("Teddy");
        q.add("Mark");
        q.add("Leo");

        System.out.println(q);
    }
}
