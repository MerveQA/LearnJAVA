package src.j15_Arrays.ArraysEasyTasks;

import java.util.Arrays;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
        */

        int input=123;

        String inputArr[]=String.valueOf(input).split("");

        int tersArr[]= new int [inputArr.length];
        int a=0;
        int index=0;

        for (int i = inputArr.length-1; i >=0 ; i--) {
            tersArr[index]=Integer.parseInt(inputArr[i]);
            index++;
        }
        System.out.println(tersArr[0]*100+tersArr[1]*10+tersArr[2]); // 321

    }
}


