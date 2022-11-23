package src.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        // indexOf(); -> list icinde istenen elemanin index degerini return eder.

        ArrayList<String> listUlke =new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));
        ArrayList<String> listSehir =new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stocolm"));

        System.out.println(listSehir.indexOf("Londra")); // 2
        System.out.println(listSehir.indexOf("Angara")); // -1
        System.out.println(listSehir.indexOf("londra")); // -1 buyuk kucuk harf duyarli.

        listUlke.add("Amerigonya");//        0         1           2         3        4
        System.out.println(listUlke); // [Alamanya, Amerigonya, ingiltere, isvec, Amerigonya]
        System.out.println(listUlke.indexOf("Amerigonya")); // 1 -> tekrarli elemanlardan soldan ilk bulunan elemanin indexini return eder.
        System.out.println(listUlke.lastIndexOf("Amerigonya")); // 4 sagdan ilk buldugu elemanin indexini retun eder.

    }
}
