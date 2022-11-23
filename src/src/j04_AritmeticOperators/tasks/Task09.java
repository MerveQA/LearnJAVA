package src.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
   /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.
     */

        Scanner scan= new Scanner(System.in);
        System.out.print("Ciftlikteki inek saysini giriniz: ");
        int inek= scan.nextInt();
        System.out.print("Ciftlikteki koyun saysini giriniz: ");
        int koyun= scan.nextInt();
        System.out.print("Ciftlikteki tavuk saysini giriniz: ");
        int tavuk= scan.nextInt();

        System.out.println("Ciftlikteki ineklerin ayaklari toplami: "+ inek*4 +
                           "\nCiftlikteki koyunlarin ayaklari toplami: "+koyun*4 +
                           "\nCiftlikteki tavuklarin ayaklari toplami: "+tavuk*2 +
                           "\nCiftlikteki toplam "+(inek+koyun+tavuk)+" hayvanin ayak sayisi= "+ (inek*4+koyun*4+tavuk*2));



    }

}
