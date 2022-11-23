package src.j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C03_Previous {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>(Arrays.asList(24, 38, 65, 9, 11, 7, 27, 23));

        // l1 elemanlarini tersten print ediniz.
        System.out.println("l1 list ilk hali: " + l1); // [24, 38, 65, 9, 11, 7, 27, 23]
        /*
        tekrarda son elemandan baslayan islemler icin pointer en sona goturulmeli.
        Bunun icin pointeri sona goturen hasNext() methodu calismali.
         */

        ListIterator<Integer> it1 = l1.listIterator();

        while (it1.hasNext()) { // pointer bastan sona dogru ilerler
            it1.next(); // burasi pointer`i sona goturdu
        }

        while (it1.hasPrevious()) { // pointer surekli basa dogru ilerler.
            System.out.print(it1.previous() + " "); // 23 27 7 11 9 65 38 24

        }

        System.out.println("\n\nTASK 2:");
        List<String> l2 = new ArrayList<>(Arrays.asList("Cagla", "Ugur", "Muharrem", "Cebrail"));

        // l2 elemanlarinin sonuncusuna :-) ekleyip print ediniz.
        System.out.println("ListIterator oncesi l2: " + l2);

        ListIterator<String> it2 = l2.listIterator(); //l2 elemanlarini tekrarlayan ListIterator tanimlandi.

        while (it2.hasNext()) {

            String s = it2.next();
            if (!it2.hasNext()) { // son eleman -> sonrasinda eleman yok
                it2.set(s + ":-)");
            }
        }
        System.out.println(l2); // [Cagla, Ugur, Muharrem, Cebrail:-)]

        /*
        hasPrevious() method icin MUTLAKA KESINLIKLE hasNext() ve next() methodlari calistirilarak cursor(pointer)
        en sona getirilmelidir.

        ITERATOR VE LISTITERATOR FARKLARI
        1- Iterator -> sadece hasNext(), next(), remove() methodlari calisir
           ListIterator -> hasNext(), next(), remove(), hasPrevious(), previous(), add(), set() vs. mathodlari calisir

        2- ListIterator -> sadece list yapilarinda calisir.
           Iterator -> tum collection (list, set, Array, map...) icin tanimlanir.

        3- Iterator -> sadece ileri bastan -> sona tekrarlar
           ListIterator -> b<->s ileri ve geri cift yonlu tekrarlar.

        Iterator -> Kapsami genis ama aksiyonu az
        ListIterator -> Kapsami dar ama aksiyonu cok
         */
    }
}
