package src.j10_StringManipulations;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {

        /*
        substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> eclusive/haric
         */

        String str= "Java bilen sirti yere gelmez : )";
        System.out.println(str.substring(10)); // sirti yere gelmez : )

        // str datasinin son 10 karakterini print ediniz.
        System.out.println(str.substring(str.length() - 10)); //gelmez : )

        // str datasinin ilk 10 karakterini print ediniz.
        System.out.println(str.substring(0, 10)); //Java bilen -> 0,1,2...9 dahil karakterleri alir

        // str datasinin ilk karakterini print ediniz..
        System.out.println(str.substring(0, 1)); //J -> 0`i alir 1`i almaz

        // TASK: Girilen 4 harfli kelimeyi tersten yazdiriniz.

        Scanner scan= new Scanner(System.in);
        System.out.print("4 harfli kelime girin: ");
        String input= scan.nextLine();

        if (input.length()!=4){
            System.out.println("Hatali giris 4 harfli kelime giriniz");
        }else {
            System.out.println(input.substring(3) + input.substring(2, 3) + input.substring(1, 2) + input.substring(0, 1));
        }

    }
}
