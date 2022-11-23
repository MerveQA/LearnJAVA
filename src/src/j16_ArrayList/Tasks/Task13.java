package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {

        int arr[]={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };


        ArrayList <Integer> arrList=new ArrayList<>();
        for (int w:arr) {
            arrList.add(w);
        }
        System.out.println("arrList: "+arrList);
        int toplam=0;

        for (int i = 0; i < arrList.size(); i++) {
          if (i==0){
              toplam+=arrList.get(i);
          }else if (i==1){
              toplam=arrList.get(i)+arrList.get(i+1);
          }else if (i==3){
              toplam=arrList.get(i)+arrList.get(i+1)+arrList.get(i+2);
          }else if (i==6){
              toplam=arrList.get(i)+arrList.get(i+1)+arrList.get(i+2)+arrList.get(i+3);
          }
            if (toplam!=0)System.out.print(toplam +" ");
          toplam=0;
        }



        /*
         int[] arr2 = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        List<Integer> listSayi = new ArrayList<>();
        int baslama = 0;

        for (int ii = 0; ii < arr2.length; ) {
            int sayac = 0;
            int toplam = 0;
            for (int j = ii; j <= ((ii + baslama) < arr2.length - 1 ? ii + baslama : arr2.length - 1); j++) {
                toplam += arr2[j];
                sayac++;
            }
            listSayi.add(toplam);
            baslama++;
            ii += sayac;
        }

        System.out.println(listSayi);
         */


    }
}

