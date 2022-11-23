package src.j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

        //Array Copy... copyOf(arr,newLength); -> girilen Arrayin newLength kadar ilk elemanini copyalar

        int sayi []= {9,45,62,35,13,98,78,100,25,55,20,51};

        int yeniArr[]= Arrays.copyOf(sayi,5); // [9, 45, 62, 35, 13]
        System.out.println("Yeni Array: "+Arrays.toString(yeniArr)); // [9, 45, 62, 35, 13]

        int baskaArr[]=Arrays.copyOfRange(sayi,3,7); // 3 dahil 8 haric index elemanlar kopyalanir.
        System.out.println("baskaArr: "+Arrays.toString(baskaArr)); // [35, 13, 98, 78]

        //Arrayin belirli bir eleman ile update(set) etme... fill(arr, value)
        Arrays.fill(sayi,99);
        System.out.println(Arrays.toString(sayi)); // [99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99]

        Arrays.fill(sayi,3,7,33); // 3 dahil, 7 haric
        System.out.println(Arrays.toString(sayi)); // [99, 99, 99, 33, 33, 33, 33, 99, 99, 99, 99, 99]






    }
}
