package src.j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {

        // remove(); -> list`ten istenen elemani siler

        ArrayList<String> listSehir =new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm"));

        System.out.println(listSehir); // [Munih, LosAngeles, Londra, Stockholm]
        System.out.println(listSehir.remove("angara")); // false
        System.out.println(listSehir.remove("Londra")); // true
        System.out.println(listSehir.remove(1)); // LosAngeles
        System.out.println(listSehir); // [Munih, Stockholm]
        //System.out.println(listSehir.remove(11)); // IndexOutOfBoundsException -> olmayan index girildiginde RTE verir.

        listSehir.add("Munih");
        listSehir.add("Angara");
        listSehir.add("Munih");

        System.out.println(listSehir); // [Munih, Stockholm, Munih, Angara, Munih]
        System.out.println(listSehir.remove("Munih")); // true -> tekrarli eleman varsa, ilk index silinir digerlerine dokunmaz
        System.out.println(listSehir); // [Stockholm, Munih, Angara, Munih]

        ArrayList<String> listUlke =new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));

        listSehir.addAll(listUlke);// sehir liste ulke list eklendi
        System.out.println(listSehir); // [Stockholm, Munih, Angara, Munih, Alamanya, Amerigonya, ingiltere, isvec]

        listSehir.removeAll(listUlke); // sehir listten ulke list cikaridi.
        System.out.println(listSehir); // [Stockholm, Munih, Angara, Munih]





    }
}
