package src.j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C13_replaceAll_fill {
    public static void main(String[] args) {

        // replaceAll() methodu listte belirli bir elemani belirli bir deger ile update eder

        ArrayList<Integer> listSayi= new ArrayList<>(List.of(1,24,23,14,19,1,60,55,27,1,38));
        System.out.println(listSayi); // [1, 24, 23, 14, 19, 1, 60, 55, 27, 1, 38]
        Collections.replaceAll(listSayi,1,20); // sayiListinde 1 yerine 20 degeri atandi
        System.out.println(listSayi); // [20, 24, 23, 14, 19, 20, 60, 55, 27, 20, 38]

        // fill() methodu listte tum elemanlari belirli bir degere update eder.

        Collections.fill(listSayi,33);
        System.out.println(listSayi); // [33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33]

    }
}
