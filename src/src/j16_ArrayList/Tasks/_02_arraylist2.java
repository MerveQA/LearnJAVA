package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {

        List<Integer> listSayi= new ArrayList<>(List.of(1,2,3,4,5));

        System.out.println(getSum(listSayi)); //15
    }

    private static int getSum(List<Integer> listSayi) {
        int toplam=0;

        for (Integer w:listSayi) {
            toplam+= w;
        }

        return toplam;
    }
}
