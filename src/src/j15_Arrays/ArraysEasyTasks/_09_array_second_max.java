package src.j15_Arrays.ArraysEasyTasks;

import java.util.Arrays;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        int sayiArr[]={15 , 25, 22, 18, 30,30};

        Arrays.sort(sayiArr);
        System.out.println(sayiArr[sayiArr.length-2]); // 25





    }
}
