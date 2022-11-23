package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {

        List<Integer> listSayi =new ArrayList<>(List.of(5,3,4,6,7));

        secondMax(listSayi);

        System.out.println(secondMax(listSayi)); // 6


    }

    private static int secondMax(List<Integer> listSayi) {

        Collections.sort(listSayi);

        return listSayi.get(listSayi.size()-2);
    }
}

