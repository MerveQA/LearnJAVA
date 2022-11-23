package src.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
          Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

          Ornek : Inputs : 853
          Output : Girdiginiz sayinin birler basamagi : 3
                   Girdiginiz sayinin onlar basamagi : 5
                   Girdiginiz sayinin yuzler basamagi : 8
         */

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen 3 basamakli bir sayi giriniz: ");
        int sayi= scan.nextInt();

        System.out.println("Kullanicinin girdigi sayi: "+sayi);

        int sayininBirlerBasamagi= sayi%10;
        int sayininOnlarBasamagi= (sayi/10)%10;
        int sayininYuzlerBasamagi=sayi/100;

        System.out.println("Girdiginiz sayinin birler basamagi: "+sayininBirlerBasamagi);
        System.out.println("Girdiginiz sayinin onlar basamagi: "+sayininOnlarBasamagi);
        System.out.println("Girdiginiz sayinin yuzler basamagi: "+sayininYuzlerBasamagi);


    }
}
