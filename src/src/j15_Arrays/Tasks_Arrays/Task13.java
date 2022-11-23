package src.j15_Arrays.Tasks_Arrays;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)
         */

        Scanner scan=new Scanner(System.in);

        int sayilar[]= new int[8];

        int sayac=0;

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(i+". index sayiyi girin: ");
            sayilar[i]=scan.nextInt();

            if (sayilar[i]%3==0){
                sayac++;
            }
        }
        System.out.println("3`e tam bolunebilen Array elemanlari adedi: "+sayac);

    }

}
