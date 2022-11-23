package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task09 {
    public static void main(String[] args) {

         /*
         TASK :
        Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
        toplamını bulan code create ediniz.
        */

        List <Integer> sayiList= new ArrayList<>(List.of(2,3,6,4,8,9,1));

        int kareToplam=0;
        for (int i = 0; i < sayiList.size(); i++) {
            kareToplam+=Math.pow(sayiList.get(i),2);
        }

        System.out.println("Kareler toplami: "+kareToplam); // 211



    }
}
