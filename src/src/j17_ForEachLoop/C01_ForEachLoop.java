package src.j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {

    public static void main(String[] args) {

        /*
        for-each loop for loop`un gelismis halidir.
        - clean code yazim kolayligi
        - code okuma kolayligi
        - hata yapma riskini azaltir
         */

        List<Integer> sayiList= new ArrayList<>(List.of(16,5,2,33,22,27,41,24));

        //TASK: list elemanlarini ayri satirlara prin ediniz.

        for (int i = 0; i < sayiList.size(); i++) {
            System.out.println(sayiList.get(i));
        }

        for (Integer a:sayiList) {
            System.out.println(a);
        }

        //TASK: list elemanlarin ilk 3 eleman haric tek olanlari print ediniz
        System.out.println("****");
        for (Integer w : sayiList.subList(3,sayiList.size()-1)) {
            if (w%2!=0){
                System.out.print(w+" "); // 33 27 41
            }
        }

        //TASK: list elemanlarinin 2 ile 5in indexarasindaki(2,3,4,5 dahil) elemanlarin toplamini print ediniz

        System.out.println("****");
        int toplam=0;
        for (Integer w : sayiList.subList(2,6)) {
           toplam+=w;
        }

        System.out.println("Toplam: "+toplam); // 84
    }
}
