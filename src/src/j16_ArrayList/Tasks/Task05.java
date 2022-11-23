package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {

        /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
        Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

        */

        String arr [][]={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};

        arrayiListeAtama(arr);

        //2.YOL:
        arrayiListeAtama1(arr);

    }


    private static void arrayiListeAtama(String[][] arr) {

        List<String> lisrArr= new ArrayList<>();

        for (int k = 0; k < arr.length; k++) {

            for (int d = 0; d < arr[k].length; d++) {

                lisrArr.add(arr[k][d]);
            }
        }
        Collections.sort(lisrArr);

        System.out.println(lisrArr);

    }

    private static void arrayiListeAtama1(String[][] arr) {
        List <String> listArr= new ArrayList<>();

        for (int k = 0; k < arr.length; k++) {

            listArr.addAll(Arrays.asList(arr[k]));
        }

        Collections.sort(listArr);

        System.out.println(listArr);
    }
}
