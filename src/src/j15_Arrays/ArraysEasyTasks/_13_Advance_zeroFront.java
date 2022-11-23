package src.j15_Arrays.ArraysEasyTasks;

import java.util.Arrays;

public class _13_Advance_zeroFront {

    public static void main(String[] args) {

      /*
        Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
        için yeniden düzenlenmiş bir Array döndürün.
        Sıfır olmayan sayıların sırası önemli değildir.
        Böylece {1, 0, 0, 1} gibi {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

        Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
        Sonuç böyle olmalı :  0,0,0,1,1
        */

        int sayilar []= {1,0,0,1,0};

        System.out.println(Arrays.toString(sayilar)); // [1, 0, 0, 1, 0]
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0, 1, 1]

    }
}