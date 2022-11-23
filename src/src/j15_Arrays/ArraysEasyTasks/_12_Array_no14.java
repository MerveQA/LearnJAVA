package src.j15_Arrays.ArraysEasyTasks;

import java.util.Arrays;
import java.util.Scanner;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*   _12_Array_no14

        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç true olmalı
         */

        int inArr[]={1,2,3,4};

        int sayac=0;
        for (int i = 0; i < inArr.length; i++) {

            if (inArr[i] == 1 ) {
                sayac++; // 1
            }

            if (inArr[i] == 4){
                sayac++; // 1
            }
        }
            // sayac =1 + 1 = 2

        //System.out.println(sayac != 2);

        if (sayac==2){
            System.out.println(false);
        }else {
            System.out.println(true);
        }

    }
}