package src.j15_Arrays.ArraysEasyTasks;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */

        String sehirArr[][]={{"new jersey","atlanta","ohio"}, // kat 0
                             {"Pittsburgh" ,"ohio","new york","ohio"}, // kat 1
                             {"ohio","new york"}}; // kat 2

        for (int k = 0; k < sehirArr.length; k++) {
            for (int d = 0; d < sehirArr[k].length; d++) {

                if (sehirArr[k][d].equalsIgnoreCase("ohio")){
                    sehirArr[k][d]="Florida";
                }
            }
        }
        System.out.println(Arrays.deepToString(sehirArr));
        //[[new jersey, atlanta, Florida], [Pittsburgh, Florida, new york, Florida], [Florida, new york]]


    }
}

