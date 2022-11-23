package src.j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {

        /*
        CharAt() parametre int olarak girilen indexteki char degerini return eder.
        Index degeri sifirdan baslar
         */
        String sehir = "Istanbul";

        System.out.println(sehir.charAt(5));
        char besinciIndex = sehir.charAt(5);
        System.out.println(besinciIndex);

        // son index karakteri -> length()-1
        System.out.println(sehir.charAt(sehir.length() - 1));

        // ilk index karakteri -> charAt(0);
        System.out.println(sehir.charAt(0));

        //System.out.println(sehir.charAt(18)); // RTE
        //TRICK: CharAt() index boyutunu gecerse RTE verir.


        //TASK: Girilen kelimesinin ortadaki karakteri print eden kod create ediniz.

        Scanner scan= new Scanner(System.in);
        System.out.print("Bir kelime gir: ");
        String kelime= scan.nextLine();

        if (kelime.length()%2!=0){
            System.out.println(kelime.charAt((kelime.length()-1) / 2));
        } else {
            System.out.println("Girilen kelimenin orta karakteri yoktur.");
        }



    }
}
