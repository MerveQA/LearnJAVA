package src.j15_Arrays.Tasks_Arrays;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {

        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        int arr[]= {3,5,6,1,9,45,25,4,9,0};

        terstensirali(arr);

    }

    private static void terstensirali(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Kucukten buyuge dogal sirali: "+Arrays.toString(arr));

        int yeniArr[]=new int[arr.length];
        for (int i = arr.length-1; i >0 ; i--) {
            yeniArr[arr.length-1-i]=arr[i];
        }

        System.out.println("Tersten sirali: "+Arrays.toString(yeniArr));
    }
}
