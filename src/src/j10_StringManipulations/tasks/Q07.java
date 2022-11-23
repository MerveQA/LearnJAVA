package src.j10_StringManipulations.tasks;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /*
        TASK : Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
               kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
               Test data: ali eme all
         */

        Scanner scan= new Scanner(System.in);
        System.out.print("Uc harfli bir isim giriniz: ");
        String isim= scan.nextLine().toLowerCase();

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

    }
}