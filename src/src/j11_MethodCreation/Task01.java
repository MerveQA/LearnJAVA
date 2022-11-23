package src.j11_MethodCreation;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        // TASK: Girilen 2 sayinin esitligini kontrol eden method create edin.

        Scanner scan=new Scanner(System.in);
        System.out.print("1.sayiyi girin: ");
        int sayi1= scan.nextInt();
        System.out.print("2.sayiyi girin: ");
        int sayi2= scan.nextInt();

        System.out.println(sayilarEsitMi(sayi1, sayi2)); // true-false, Girilen degiskenlere gore degisir
        System.out.println(sayilarEsitMi(3, 5));   // fale
        System.out.println(sayilarEsitMi(33, 33)); // true
        // yukarida ki methodlarin return type`lari void olmadigi icin Class icerisinde ya bir variable`a
        // assing yapmaliyiz ve o variable`i yazdirmaliyiz
        // yada sout icine atip direkt methodu yazdirmaliyiz. Yoksa konsoldan cikti (sonuc) alamayiz.


        sayilarEsitMi2(56,67);// Sayilar esit degil
        sayilarEsitMi2(61,61);// Sayilar esit
        sayilarEsitMi2(sayi1,sayi2);// 13-14 // Sayilar esit degil
        // burada ise yukaridaki methodlarin return type void oldugu icin Class icerisinde herhangi assing
        // yada yazdirma islemi yapmamiza gerek yoktur. Method icerisinde yazdirilmis ise konsolda sonuc yazdirir.


    }

    public static boolean sayilarEsitMi(int a, int b) {

       boolean esitMi;
       if (a==b){
           esitMi=true;
        }else{
           esitMi=false;
        }

        return esitMi;
    }

    public static void sayilarEsitMi2(int a, int b) {
        if (a==b){
            System.out.println("Sayilar esit");
        }else{
            System.out.println("Sayilar esit degil");
        }
    }


}
