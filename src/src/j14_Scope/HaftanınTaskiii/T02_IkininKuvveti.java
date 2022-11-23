package src.j14_Scope.HaftanınTaskiii;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {

        /*
          Kullanicidan gelen datayi methodda parametre olarak alan
          ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */

        Scanner sc= new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int sayi= sc.nextInt();

        PowersofTwo(sayi);

    }

    private static void PowersofTwo(int sayi) {

        boolean ussuMu = false;
        for (int i = 1; i <= sayi; i*=2) {

            if (sayi==i){
                ussuMu=true;
               break;
            }
        }

        if (ussuMu==true){
            System.out.println("Sayi 2`nin kuvveti");
        }else {
            System.out.println("Sayi 2`nin kuvveti degil");
        }




    }


        /*

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("pozitif tam sayi giriniz");
    int num = scan.nextInt();

        System.out.println(powersOfTwo(num));
    PowersofTwo(num);

}

    public static boolean powersOfTwo(int num) {

        boolean powerOfTwo = false;

        for (int i = 1; i < Integer.MAX_VALUE; i = i * 2) {

            if (num == i) {
                powerOfTwo = true;
                break;
            }
            if (num < i) {
                break;
            }

        }

        return powerOfTwo;

    }

    private static void PowersofTwo(int num) {

        if (num % 2 == 0) {
            num /= 2;
            if (num == 1) {
                System.out.println("Girilen sayi 2'nin kuvvetidir");
            } else {
                PowersofTwo(num);
            }

        } else {
            System.out.println("Girilen sayi 2'nin kuvveti degildir");
        }

    }
     */

}

