package src.j15_Arrays.ArraysEasyTasks;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        String para="$12 $23 $10 $2 $5 $2";
        para=para.replaceAll("\\$","");

        String paraArr[]= para.split(" ");
        System.out.println(Arrays.toString(paraArr));

        int toplam=0;
        for (int i = 0; i < paraArr.length; i++) {
            toplam+=Integer.parseInt(paraArr[i]);
        }
        System.out.println("$"+toplam); // $54

    }
}