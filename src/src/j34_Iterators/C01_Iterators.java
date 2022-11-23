package src.j34_Iterators;

import java.util.*;

public class C01_Iterators {

    public static void main(String[] args) {

        List<String> l1 =new ArrayList<>(Arrays.asList("Nur","Gamze","Erol","Bekir"));
        System.out.println("l1 List ilk hali: "+l1); // [Nur, Gamze, Erol, Bekir]

        //TASK: l1 elemanlarini forLoop ile print ediniz...
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i)+" "); // Nur Gamze Erol Bekir
        }
        System.out.println();

        //TASK: l1 elemanlarini for-each loop ile print ediniz...
        for (String w:l1) {
            System.out.print(w+" "); //Nur Gamze Erol Bekir
        }
        System.out.println();

        //TASK: l1 herbir elemani :-) forloop ile update edip print ediniz...
        for (int i = 0; i < l1.size(); i++) {
            l1.set(i, l1.get(i)+":-) ");
        }
        System.out.println("l1 update sonrasi: "+l1); //[Nur:-) , Gamze:-) , Erol:-) , Bekir:-) ]

        //TASK: l1 herbir elemani :-) for-each loop ile update edip print ediniz...
        for (String x:l1) {
            x +=":-(";
        }
        System.out.println("l1 for-each loop update sonrasi: "+l1); // [Nur:-) , Gamze:-) , Erol:-) , Bekir:-) ]

        /*
        index desteklemeyen yapilarda tekrarlayan aksiyon icin for-each loop update yapamayabilir.
        Yukaridaki taskde oldugu gibi
        Bu durumda java iterator interface`den tanimlanacak variable ile tekrarlayan aksiyonlar index olmadan yapilir.
         */

        System.out.println("\n*** iterator ***");

        Iterator<String> it1=l1.iterator(); // Iterator interface`den it1 variable tanimlandi. Atama olarak l1 elemanlari atandi
        // it1.hasNext()->it1 elemanlari icin pointer oldugu yerde eleman varsa true yoksa false verir ve pointer bir sonraki eleman onune gelir.
        // it1.next() -> list`in pointer onundeki elemanini return eder.

        while (it1.hasNext()){
            System.out.print(it1.next() + " "); // Nur:-)  Gamze:-)  Erol:-)  Bekir:-)
        }

        System.out.println("\n\n*** 2. List Tasks ***");
        List<String> l2 =new ArrayList<>(Arrays.asList("Baran","Gulsum","Akif","Nazim"));
        System.out.println("l2 List ilk hali: "+l2); // [Baran, Gulsum, Akif, Nazim]

        //TASK: l2 elemanlarini iterator ile silip print ediniz.
        Iterator<String> it2=l2.iterator();

        while (it2.hasNext()){ // tekrardaki pointer onunde eleman varligini kontrol eder
            it2.next(); // tekrardaki pointer onundeki elemani verir
            it2.remove(); // next() methodu ile getirilen elemnai siler
        }
        System.out.println("iterator ve remove sonrasi l2: "+l2); // []


    }
}
