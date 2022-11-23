package src.j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {
    public static void main(String[] args) {

        //TRICK: Array`den cevrilen List array kaynakli oldugu icin array davranisi gosterir
        //       boyutu sabittir dolayisiyla remove add method calismaz.

        String arrJavaCan[] = {"Akif", "Gamze", "Musty", "SevdeNur"};
        List<String> listJavaTar = Arrays.asList(arrJavaCan);
        System.out.println(listJavaTar); // [Akif, Gamze, Musty, SevdeNur]

        System.out.println(listJavaTar.size()); // 4
        //listJavaTar.add("Haluk"); // Arraya eleman EKLENEMEZ. // RTE ->UnsupportedOperationException
        //listJavaTar.clear(); // RTE

        //TRICK: list data type ArrayList tanimlanirsa RTE vermez. Kaynagi list davranisi verir, boyut esnekligi yapar.

        List<String> listJavaTar1= new ArrayList<>(Arrays.asList(arrJavaCan));
        listJavaTar1.add("Haluk");
        System.out.println(listJavaTar1); // [Akif, Gamze, Musty, SevdeNur, Haluk]

        ArrayList<String> listJavaTar2= new ArrayList<>(Arrays.asList(arrJavaCan));
        listJavaTar2.add("YunusEmre");
        System.out.println(listJavaTar2); // [Akif, Gamze, Musty, SevdeNur, YunusEmre]
    }
}
