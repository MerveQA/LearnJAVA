package src.j15_Arrays.ArraysEasyTasks;

import java.util.Arrays;

public class _02_Create_array2 {

    public static void main(String[] args) {

    /*
             int Array oluşturun.
                elemanları : 13, 15,14,16,16
                Arrayin elemanlarını yazdırın.
     */
        // Kodu aşağıya yazınız..

        int sayiArr[]={13, 15, 14, 16, 16};

        System.out.println("Arrays.toString: "+Arrays.toString(sayiArr));

       // String str=Arrays.toString(sayiArr);

        //System.out.println("str = " + str);
        //System.out.println("str.length() = " + str.length());

        for (int i = 0; i < sayiArr.length; i++) {

            System.out.print(sayiArr[i]+" ");

        }



    }
}
