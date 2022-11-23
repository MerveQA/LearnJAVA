package src.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

        /*
        Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
                    1 saat = 3600 saniye
                    1 dk   = 60 saniye
       */
        int input= 4250;

        int saat= 4250/3600;
        int saniye= 4250%60;
        int dakika= (4250-(50+3600))/60;
        System.out.println(input+" saniye "+saat+" saat "+dakika+" dakika "+saniye+" saniye");



    }
}
