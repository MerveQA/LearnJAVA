package src.j16_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {

        ArrayList<String> listUlke =new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));
        ArrayList<String> listSehir =new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stocolm"));

        // nCopies(int, Obj); -> int elemanli bir obj`den olusan list atamasi yapiyor.
        ArrayList<String> yeniList= new ArrayList<>(Collections.nCopies(3,"JavaCAN"));
        System.out.println(yeniList); // [JavaCAN, JavaCAN, JavaCAN]

        //addAll(); -> bir liste diger listi oldugu gibi ekler.

        listUlke.addAll(listSehir); // ulke list sonuna sehir list tamamen eklendi.

        System.out.println("listUlke = " + listUlke); //[Alamanya, Amerigonya, ingiltere, isvec, Munih, LosAngeles, Londra, Stocolm]

        listSehir.addAll(3,listUlke); // 3. indexten itibaren ulke listi sehir liste tamamen eklendi.
        System.out.println("listSehir = " + listSehir); //[Munih, LosAngeles, Londra, Alamanya, Amerigonya, ingiltere, isvec, Stocolm]

        //TASK: 1den 10a kadar sayilari bir liste atayip print eden code create ediniz.

        ArrayList<Integer> sayilar= new ArrayList<>();

        for (int i = 1; i <11 ; i++) {
            sayilar.add(i);

        }
        System.out.println("sayilar = " + sayilar); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


    }
}
