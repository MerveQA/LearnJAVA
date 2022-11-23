package src.j16_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C10_sort_reverse {
    public static void main(String[] args) {

        // Collection.sort(list); -> verilen listi naturel siralama yapar.
        // Collection.reverse(list); -> verilen listin ters siralamasini return eder.

        ArrayList<String> listSehir =new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm"));

        System.out.println(listSehir); // [Munih, LosAngeles, Londra, Stockholm]
        Collections.sort(listSehir); // sort methodu sout icinde calismaz.
        System.out.println(listSehir); // [Londra, LosAngeles, Munih, Stockholm]

        Collections.reverse(listSehir);
        System.out.println(listSehir); // [Stockholm, Munih, LosAngeles, Londra]

        ArrayList<String> listUlke =new ArrayList<>(List.of("Alamanya","Amerigonya","Ingiltere","isvec"));
        System.out.println(listUlke); // [Alamanya, Amerigonya, Ingiltere, isvec]
        Collections.reverse(listUlke);
        System.out.println(listUlke); // [isvec, Ingiltere, Amerigonya, Alamanya]


        List <Integer> sayilar= new ArrayList<>(List.of(13,15,1,5,9,100,45,120));
        System.out.println(sayilar); // [13, 15, 1, 5, 9, 100, 45, 120] reverse methodu kullanilmadan once

        Collections.reverse(sayilar); // reverse methodu ile list tersine cevrildi.
        System.out.println(sayilar); // [120, 45, 100, 9, 5, 1, 15, 13] reverse methodu kullanildiktan soraki siralama

        /*
        Collections.reverse() methodu girilen listi tersten dogal sirali olarak return etmez.
        Girilen list`i indexine gore tersine cevirir. Indexini tersine cevirir.
         */
    }
}
