package src.HaftanınTaskiii;

import java.util.Arrays;
import java.util.Scanner;

public class T06_HarfSayac {
    public static void main(String[] args) {

        /* TASK :
         kullanıcıdan alınan bir String'deki herbir karakterin adedini bir array içinde yazdıran bir java programı yazın.

         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir cumle girin: ");
        String cumle =sc.nextLine();

        String kirpilmisCumle="";

        while(!cumle.isEmpty()){
            int sayac=0;

            for (int i = 0; i < cumle.length(); i++) {

                if (cumle.charAt(0)==cumle.charAt(i)){
                    sayac++;
                }
            }
            kirpilmisCumle+=cumle.charAt(0)+"="+sayac+" ";
            cumle=cumle.replace(cumle.substring(0,1),"");
        }
        String[] arrCumle = kirpilmisCumle.split(" ");
        System.out.println(Arrays.toString(arrCumle));


    }

}
    

