package src.j16_ArrayList.Tasks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {

        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        List <Integer> sayiList= new ArrayList<>(List.of(1,2,2,3,1,4,2,5,6,8,7,5,9,1));

        Collections.sort(sayiList);
        System.out.println(sayiList);

        //TODO Tekrar bak

        for (int i = 0; i < sayiList.size()-1; i++) {

            if (sayiList.get(i)==sayiList.get(i+1)){
                sayiList.remove(i);
            }
            if (sayiList.get(i)==sayiList.get(i+1)){
                sayiList.remove(i);
            }

        }
        System.out.println(sayiList);

    }

}
