package src.j15_Arrays.ArraysEasyTasks;

import java.util.Arrays;

public class _20_Arrayboth_Ends {

    public static void main(String[] args) {

        /*
        Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
        ilk ve son elementlerini kapsayan yeni array'e return edin.

        Oluşturacağınız int array'i =   ([1, 2, 3, 4])

        Sonuç bu şekilde olmalıdır. [1, 4]
        */

        int inputArr[]={1, 2, 3, 4};

        int yeniArr[]=new int[2];

        yeniArr[0]=inputArr[0]; // yeniArr`nin 0. indexine inputArr`nin 0. indexi atandi
        yeniArr[1]=inputArr[inputArr.length-1];//yeniArr`nin 1. indexine inputArr`nin son indexi atandi

        System.out.println(Arrays.toString(yeniArr)); // [1, 4]

    }
}