package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _07_arraylist7 {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */

    public static void main(String[] args) {

        List<Integer> list1 =new ArrayList<>(List.of(3 , 2 , 5 , 6));
        List<Integer> list2 =new ArrayList<>(List.of(5 , 8 , 9));

        common_values(list1,list2);

    }

    private static void common_values(List<Integer> list1, List<Integer> list2) {

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {

                if (list1.get(i)==list2.get(j)){
                    System.out.print(list2.get(j)+" "); // 5
                }

            }
        }

    }
}
