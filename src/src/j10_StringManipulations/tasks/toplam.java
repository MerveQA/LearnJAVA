package src.j10_StringManipulations.tasks;

import java.util.Scanner;

public class toplam {
    public static void main(String[] args) {

        // *** Q01 ***
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan= new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String cumle= scan.nextLine();

        if (cumle.contains(" ")){
            System.out.println("Kullanıcıdan alacağımiz string en az bir boşluk karakteri ICERMEKTEDIR.");
        }else {
            System.out.println("Kullanıcıdan alacağımiz string boşluk karakteri ICERMEMEKTEDIR.");
        }


        // *** Q07 ***
        /*
        TASK : Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
               kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
               Test data: ali eme all
         */

        Scanner sc= new Scanner(System.in);
        System.out.print("Uc harfli bir isim giriniz: ");
        String isim= sc.nextLine().toLowerCase();

        String a= ((isim.length()==3) ? (((isim.charAt(0)==isim.charAt(1)) || (isim.charAt(0)==isim.charAt(2)) ||
                (isim.charAt(1)==isim.charAt(2))) ? "Girilen isim AYNI karakterlerden olusuyor" :
                "Girilen isim FARKLI karakterlerden olusuyor") : "Hatali giris UC harfli bir isim giriniz");

        System.out.println(a);

        if (isim.length()==3){
            if ((isim.charAt(0)==isim.charAt(1)) || (isim.charAt(0)==isim.charAt(2)) || (isim.charAt(1)==isim.charAt(2))){
                System.out.println("Girilen isim AYNI karakterlerden olusuyor");
            }else{
                System.out.println("Girilen isim FARKLI karakterlerden olusuyor");
            }
        }else{
            System.out.println("Hatali giris UC harfli bir isim giriniz");
        }


        // *** Q09 ***
        /*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */
        Scanner input= new Scanner(System.in);
        System.out.print("Bir kelime gir: ");
        String kelime= input.nextLine();

        if (kelime.length()%2==0){
            System.out.println("Girilen kelime 2`ye tam bolunebildigi icin kelimenin yarisi alinabilir\n"+
                    (kelime.substring(0,kelime.length()/2)));
        } else {
            System.out.println("Girilen kelime 2`ye tam bolunemedigi icin kelimenin yarisi alinamaz\n"+
                    (kelime.substring(0,kelime.length()/2)));
        }


    }
}
