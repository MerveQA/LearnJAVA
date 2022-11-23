package src.j13_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {

        /*
        TASK: Girilen tamsayinin asal olmasini kontrol eden kod create ediniz
        Asal Tamsayi: 1`e ve kandisinden baska tam boleni olmayan sayilardir.
         */

        Scanner sc=new Scanner(System.in);
        System.out.print("Tam sayi girin: ");
        int sayi= sc.nextInt();

        boolean asalMi=true;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){ // eger sayi kendisine kadar olan sayilardan enaz birine tam bolunuyorsa if body calisir
                asalMi=false;
                break;
            }
        }
        if (asalMi & sayi!=1){
            System.out.println("Girilen sayi asal sayidir");
        }else {
            System.out.println("Girilen sayi asal sayi degildir");
        }

    }
}
