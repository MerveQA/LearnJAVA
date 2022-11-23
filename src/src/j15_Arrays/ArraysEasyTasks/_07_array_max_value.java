package src.j15_Arrays.ArraysEasyTasks;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12,2,5,15,8
        En büyük değeri yazdırınız.
        */

        int array[]={12,2,5,15,8};

        int maxDeger= array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i]>maxDeger){
                maxDeger=array[i];
            }
        }
        System.out.println("Max deger: "+maxDeger); // 15

        //2.YOL:
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);

    }
}

