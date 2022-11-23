package src.j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {

        List<String> l3 =new ArrayList<>(Arrays.asList("Baran","Gulsum","Akif","Nazim"));

        // TASK: l3 elemanlarini iterator ile :-) set edip print ediniz. -> [Baran:-), Gulsum:-), Akif:-), Nazim:-)]
        System.out.println("ListIterator oncesi l3: "+l3);

        ListIterator<String> it3=l3.listIterator();// ListIterator yapisi tanimlandi

        while (it3.hasNext()){
            it3.set(it3.next()+":-) "); // tekrardaki next() ile elemani :-) concat ederek update edildi
        }
        System.out.println("ListIterator set sonrasi l3: "+l3); // [Baran:-) , Gulsum:-) , Akif:-) , Nazim:-) ]


        //TASK:  l3 elemanlarinin ilk harfi buyuk kalan 3 harfi *** karakteri ve l4 listi ekleyip print ediniz
        System.out.println("\n*** 4. List Tasks ***");
        List<String> l4 =new ArrayList<>(Arrays.asList("Serhat","Yakup","Mustafa","Nazli"));
        System.out.println("ListIterator oncesi l3: "+l3);

        ListIterator<String> ebikGabik = l3.listIterator();

        while (ebikGabik.hasNext()){
            ebikGabik.set(ebikGabik.next().toUpperCase().charAt(0)+"***");
            // next()`le l4 elemanlarinin ilk harf buyuk, kalan 3 harf *** ile set edildi
            ebikGabik.add(l4.toString()); // tekrardaki update edilen l3`e l4 add edildi
        }
        System.out.println("ListIterator set ve add sonrasi l3: "+l3);
        //[B***, [Serhat, Yakup, Mustafa, Nazli], G***, [Serhat, Yakup, Mustafa, Nazli], A***, [Serhat, Yakup, Mustafa, Nazli], N***, [Serhat, Yakup, Mustafa, Nazli]]

        // TASK: l5 elemanlarinin ilk harfi buyuk kalan 3 harfler yerine 3 *** karakteri ekleyin ve
        //       Yildizli olarak elde ettigimiz her l5 eleaminidan sonra l6 elemanini indexe gore birer birer ekleyiniz.

        List<String> l5 =new ArrayList<>(Arrays.asList("Yunus","Emre","Dogan","Boran"));
        List<String> l6 =new ArrayList<>(Arrays.asList("Derya","Meltem","Elif","Tugce"));
        ListIterator<String> falanFilan = l5.listIterator();

        int sayac=0;
        while (falanFilan.hasNext()){
            falanFilan.set(falanFilan.next().toUpperCase().charAt(0)+"***");
            // next()`le l4 elemanlarinin ilk harf buyuk, kalan 3 harf *** ile set edildi
            falanFilan.add(l6.get(sayac)); // tekrardaki update edilen l3`e l4 add edildi
            sayac++;
        }
        System.out.println(l5); // [Y***, Derya, E***, Meltem, D***, Elif, B***, Tugce]

        
    }
}
