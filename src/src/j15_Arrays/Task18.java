package src.j15_Arrays;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {

        //TASK: sayi arr`deki ic arraylerin toplamini yeni bir arr`e atayip prin eden code create ediniz.

        //input -> int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        //output-> int yeiArr []={6,11,-7};

        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};

        int yeniArr[]= new int[sayi.length];

        int toplam=0;

        for (int k = 0; k < sayi.length; k++) {
            for (int d = 0; d < sayi[k].length; d++) {
                toplam+=sayi[k][d];
            }
            yeniArr[k]=toplam;
            toplam=0;
        }

        System.out.println(Arrays.toString(yeniArr));

    }
}
