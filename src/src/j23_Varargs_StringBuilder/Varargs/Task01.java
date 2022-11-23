package src.j23_Varargs_StringBuilder.Varargs;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {

        /*
        Task ->
        verilen Stringleri birlestiren concat isimli METHOD create ediniz.
        input : "m", "e", "r", "v", "e";
        output : merve
        input : "a", "l", "i";
        output : ali
        */

        String arr[]={"m", "e", "r", "v", "e"};
        String arr1[]={"a", "l", "i"};

        strBirlestir (arr); // merve
        strBirlestir (arr1); // ali
        strBirlestir ("javaCAN"," Ali"," bey"); // javaCAN Ali bey

        strBirlestir1(arr,arr1); // [m, e, r, v, e][a, l, i]
    }

    public static void strBirlestir (String...str){
        String birlesenStr="";

        for (String w: str) {
            birlesenStr=birlesenStr.concat(w);
        }
        System.out.println("birlesenStr = " + birlesenStr);
    }

    public static void strBirlestir1 (String[]...str){

        for (int i = 0; i < str.length; i++) {
            System.out.print(Arrays.toString(str[i]));
        }
    }
}
