package src.j10_StringManipulations;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {

        /*
        contains() Stering icerisinde istenen Stringin varligini kontrol eder. boolean return eder.
         */

        String s1="Enise Hanim basarili bir Qa tester team lead";
        System.out.println(s1.contains("hanim")); // false
        System.out.println(s1.contains("E")); // true
        System.out.println(s1.contains(" ")); // true

        String s2= "Qa";
        System.out.println(s1.contains(s2)); // true
        System.out.println(s2.contains(s1)); // false

        //TASK 1: Girilen bir cumlede aranan kelimenin varligini kontrol eden bir kod create ediniz.Ternary kullaniniz.
        Scanner scan= new Scanner(System.in);
        System.out.print("Bir kcumle gir: ");
        String cumle= scan.nextLine().toLowerCase();
        System.out.print("Cumle icinde aradiginiz kelimeyi girin: ");
        String kelime= scan.nextLine().toLowerCase();


        System.out.println(cumle.contains(kelime) ? ("Girilen; \"" + cumle + "\" cumlesinde, \"" + kelime + "\" kelimesini ICERIYOR.") :
                                                    ("Girilen; \"" + cumle + "\" cumlesinde, \"" + kelime + "\" kelimesini ICERMIYOR."));

         /*
        TASK 2: Girilen e-mail hesabini @gmail.com icemiyorsa "lutfen gmail hesabi giriniz".
              @gmail.com  ile bitiyorsa "onylandi" aksi durumda "gecerli hesap giriniz"
              print eden code create ediniz
         */

        Scanner sc= new Scanner(System.in);
        System.out.print("e-mail hesabinizi girin: ");
        String mail= sc.nextLine().toLowerCase();

        if (mail.contains("@gmail.com")){ // icerip icermemesi kontol edildi
            if (mail.endsWith("@gmail.com")){ // "@gmail.com" e-mail hesabinin sonunda yer alip almamasi kontrol edildi
                System.out.println("Hesabiniz onaylandi");
            }else {
                System.out.println("gecerli hesap giriniz");
            }
        }else {
            System.out.println("lutfen gmail hesabi giriniz");
        }

    }
}
