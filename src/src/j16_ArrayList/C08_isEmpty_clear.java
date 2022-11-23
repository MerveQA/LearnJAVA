package src.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty_clear {
    public static void main(String[] args) {

        // isEmpty (); -> listin bos olmasini kontrol eder. Boolean sonuc return eder.
        // clear(); -> listin tum elemanlarini siler.

        ArrayList<String> listSehir =new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm"));
        System.out.println("listSehir: "+listSehir); // [Munih, LosAngeles, Londra, Stockholm]
        System.out.println(listSehir.isEmpty()); // false

        listSehir.clear();// list temizlendi
        System.out.println("listSehir: "+listSehir); // []
        System.out.println(listSehir.isEmpty()); // true
    }
}
