package src.j12_Loops.L01_ForLoop.Tasks_DersteCozulenler;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /*
        Girilen bir ifadenin istenen harf sayisini print eden code create ediniz
        input: selam javaCAN`lar
        output: a sayisi : 3
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Cumle giriniz: ");
        String str=sc.nextLine();
        System.out.print("arattiginiz harfi yaziniz: ");
        char harf=sc.next().charAt(0);

            int harfSayi=0;

        for (int i = 0; i < str.length() ; i++) {

            if (str.charAt(i)==harf){
                harfSayi++;
            }
        }
        System.out.println("Girdiginiz: "+str+", cumlesinde "+harf+" harfi "+ harfSayi+" tane var");




    }
}
