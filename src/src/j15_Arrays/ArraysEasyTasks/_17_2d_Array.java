package src.j15_Arrays.ArraysEasyTasks;

import java.util.Arrays;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

        int arr2d [][]={{2,3,2} , {4,1,5} , {7,2,5}};

        System.out.println("Degisiklik oncesi Array:  "+Arrays.deepToString(arr2d));
        for (int k = 0; k < arr2d.length; k++) {
            for (int d = 0; d < arr2d[k].length; d++) {

                if (arr2d[k][d]==2){
                    arr2d[k][d]=6;
                }
            }
        }
        System.out.println("Degisiklik sonrasi Array: "+Arrays.deepToString(arr2d)); // [[6, 3, 6], [4, 1, 5], [7, 6, 5]]


    }
}