package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _09_2dArray_with_arraylis {

    /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {

        Integer arr [][]={{1,2,3},{4,5,6},{7,8,9}};
        List <Integer> listArr=new ArrayList<>();

        for (int k = 0; k < arr.length; k++) {
            for (int d = 0; d < arr[k].length; d++) {
                listArr.add(arr[k][d]);
            }
        }

        System.out.println(listArr); // [1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}