package src.j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {

    public static void main(String[] args) {

        // TASK: iki String array elemanlarinin ortak olanlarini yazdiran code create ediniz. with for-each

        String arr1[] = {"nazim", "gulsum", "dilek", "erol", "cuneyt", "cigdem"};

        String arr2[] = {"musty", "gulsum", "ayse", "enise", "cuneyt", "cigdem"};


        for (String w : arr1) {

            for (String a : arr2) {

                if (w.equalsIgnoreCase(a)) {
                    System.out.print(w+" ");
                }
            }
        }
        System.out.println(); // dummy

        //Hocanin cozumu

        List<String > ortakIsim=new ArrayList<>(); //ortak ısımlerin atanacagı boş list

        for (String str1:arr1){

            for (String str2:arr2){

                if (str2.equalsIgnoreCase(str1)){ //her bir çekirdek eşitliği kontrol
                    ortakIsim.add(str2);
                }
            }
        }
        if (ortakIsim.isEmpty()){ //ortak isim list boşluk kontrol
            System.out.println("ararylerinizde ortak isim yok "+ortakIsim);
        }else System.out.println(ortakIsim);


    }
}
