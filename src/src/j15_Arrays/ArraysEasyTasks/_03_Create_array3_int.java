package src.j15_Arrays.ArraysEasyTasks;

import java.util.Arrays;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*
      elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        int arr[]=new int[5];

        arr[0]=25;
        arr[1]=30;
        arr[2]=30;
        arr[3]=35;
        arr[4]=100;

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }

        System.out.println("toplam = " + toplam);
        System.out.println("farkli bir yol: "+(arr[0]+arr[1]+arr[2]+ arr[3]+arr[4])); // farkli bir yol: 220
        System.out.println("farkli bir yol: "+arr[0]+arr[1]+arr[2]+ arr[3]+arr[4]); // farkli bir yol: 25303035100

    }
}