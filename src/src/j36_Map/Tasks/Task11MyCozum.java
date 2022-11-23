package src.j36_Map.Tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task11MyCozum {
    public static void main(String[] args) {

        /*
    Count the words in a String one by one
    Bir Stringdeki kelimeleri saydırıp prnt eden code create ediniz .
    String Str = "Ali came to school and Ayse came to school"
    Ali=    1
    came=   2
    to=     2
    school= 2
    and=    1
    Ayse=   1
    */

        String str = "Ali came to school and Ayse came to school";

        String arr[] =str.split(" ");
        System.out.println(Arrays.toString(arr));

        HashMap<String,Integer> kelimeSayisi=new HashMap<>();

        for (String ch:arr) {
            if (!kelimeSayisi.containsKey(ch)){
                kelimeSayisi.put(ch,1);
            }else {
                kelimeSayisi.put(ch,kelimeSayisi.get(ch)+1);
            }
        }

        for (Map.Entry<String, Integer> w: kelimeSayisi.entrySet()) {
            System.out.println(w);
        }


    }
}
