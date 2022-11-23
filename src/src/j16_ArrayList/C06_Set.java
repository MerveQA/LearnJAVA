package src.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_Set {
    public static void main(String[] args) {

        // set(); -> listin istenen elemani istenen indexe update eder.

        ArrayList<String> listSehir =new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm"));
        System.out.println(listSehir.set(3, "Angara")); // Stockholm -> set edilen degeri print eder
        System.out.println(listSehir); // [Munih, LosAngeles, Londra, Angara]

        //System.out.println(listSehir.set(11, "pataGONYA")); // olamayan index set edilirse -> IndexOutOfBoundsException (RTE) verir.
        //listSehir.set(1,"bursa",2,"izmir");// list te coklu set methodu calismaz


    }
}
