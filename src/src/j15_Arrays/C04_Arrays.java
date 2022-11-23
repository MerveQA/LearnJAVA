package src.j15_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        //Array esitlik kontrolu... equals() methodu index ve value kontrolu yapar ve true/false return eder.

        int sayi1[]={39,3,72,63,84};
        int sayi2[]={84,63,72,39,3};

        System.out.println("sayi1 ve sayi2 esitmi = " + Arrays.equals(sayi1, sayi2)); // false

        Arrays.sort(sayi1);// [3,39,63,72,84]
        Arrays.sort(sayi2);// [3,39,63,72,84]
        System.out.println("sayi1 ve sayi2 esitmi = " + Arrays.equals(sayi1, sayi2)); // true
        System.out.println(sayi1[0] == sayi2[0]); // true

        //Arrayi Stringe cevirme.. toString(arr); -> verilen arr`i string data type cevirir.

        String str= Arrays.toString(sayi1);
        System.out.println("str = "+str); //[3, 39, 63, 72, 84] -> arr`in tum karakterleri String olarak tanimlandi.
        System.out.println("str.length() = " + str.length()); //19
        System.out.println(str.substring(6)); //, 63, 72, 84]
        //TRIK: Arrayin tum karakterleri String olarak tanimlandi


    }
}
