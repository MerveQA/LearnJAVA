package src.j35_Collection.C01_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        /*
        LinkedList....
        1- LinkedList`te elemanlar "data" ve "adres"  olmak uzere 2 kisimdan olusur ve eleman yerine "node" olarak tanimlanir.
        2- LinkedList`te ilk node data barindirmayan sadece adres bulunduran head node tanimlanmistir.
        3- LinkedList`te son node adres kismi null olan sadece data bulunduran tail node tanimlanmistir.
        4- ArrayList searching LinkedList node ekleme ve silmede daha avantajlidir.
           LinkedList eleman bulmada index yapisi olmadigi icin basarisizdir.
        5- LinkedList -> tren vagon iliskisi baglantisi gibi dusunulebilir
        6- Collection obj tanimlanirken cons Class(LinkedList, ArrayList...) olmali interface(List, Queue...) olmamasina dikkat edilmeli
           Ancak obj DataType olarak parent interface tanimlanabilir.
        7- LinkedList class 2 tane parent interface`den(List, Queue) implement etmistir.
         */

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("Ebubekir", "Gulsum", "Adem", "Ilker", "Merve")); // Declare + atama

        //LinkedList print...
        System.out.println("ll1 = " + ll1); // [Ebubekir, Gulsum, Adem, Ilker, Merve]

        //LinkeList add(); methodu
        ll1.add("Ugur");
        System.out.println("ll1 = " + ll1); // [Ebubekir, Gulsum, Adem, Ilker, Merve, Ugur]
        ll1.add(2, "Abdulaziz");
        System.out.println("ll1 = " + ll1); // [Ebubekir, Gulsum, Abdulaziz, Adem, Ilker, Merve, Ugur]

        // addFirst(); methodu
        ll1.addFirst("JavaCAN");
        System.out.println("ll1 = " + ll1); // [JavaCAN, Ebubekir, Gulsum, Abdulaziz, Adem, Ilker, Merve, Ugur]

        // addLast(); methodu
        ll1.addLast("JavaTAR");
        System.out.println("ll1 = " + ll1); // [JavaCAN, Ebubekir, Gulsum, Abdulaziz, Adem, Ilker, Merve, Ugur, JavaTAR]

        List<String> ll2= new ArrayList<>(Arrays.asList("Fatih","Erol","Nur")); // DataType interface List olan LinkedList

        // addAll(); methodu
        ll1.addAll(ll2);
        //ll1.addAll("Agam"); -> Parametre Collection olmazsa CTE

        System.out.println("ll1 = " + ll1); // [JavaCAN, Ebubekir, Gulsum, Abdulaziz, Adem, Ilker, Merve, Ugur, JavaTAR, Fatih, Erol, Nur]
        ll1.addAll(3,ll2);
        System.out.println("ll1 = " + ll1);
        // [JavaCAN, Ebubekir, Gulsum, Fatih, Erol, Nur, Abdulaziz, Adem, Ilker, Merve, Ugur, JavaTAR, Fatih, Erol, Nur]

    }
}
