package src.j14_Scope.HaftanınTaskiii;

import java.util.Random;
import java.util.Scanner;

public class Toplam {
    public static void main(String[] args) {

        //**** T01_TopZıplamaMesafeSaysı ****
        /*
        HAFTANIN TASK'iiii :-)
        Bir top belirli yükseklikten atılmaktadır.
        Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
        */

        Scanner scn = new Scanner(System.in);
        System.out.print("Topun atilacagi yuksekigi girin: ");
        double yukseklik = scn.nextDouble();

        double toplamYol = yukseklik;
        int ziplamaAdet = 0;

        do {
            yukseklik = yukseklik * 0.75;
            toplamYol += yukseklik * 2;
            ziplamaAdet++;

        } while (yukseklik > 1);

        System.out.println("Toplam Yol: " + toplamYol);
        System.out.println("Toplam ziplama: " + ziplamaAdet);




        //**** T03_TasKagitMakas ****

        // tas >makas
        // makas >kagit
        //kagit >tas

        int numberOfFirstWin = 0;
        int numberOfComWin = 0;
        int gameOver = 3;

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.print("*****Oyuncu*****\nTas icin   -> 1\nKagit icin -> 2\nMakas icin -> 3\n  Tuslayiniz: ");
            int birinciOyuncu = scan.nextInt();

            if (birinciOyuncu > 3 || birinciOyuncu < 1) {
                System.out.println("hatali Giris Tekrar Deneyin");

            } else {
                Random random = new Random();
                int oyuncuPc = random.nextInt(3) + 1;

                System.out.println(); // dummy
                switch (oyuncuPc) {
                    case 1:
                        System.out.println("Bilgisayar TAS dedi");
                        break;
                    case 2:
                        System.out.println("Bilgisayar KAGIT dedi");
                        break;
                    case 3:
                        System.out.println("Bilgisayar MAKAS dedi");
                        break;
                }

                switch (birinciOyuncu) {
                    case 1:
                        System.out.println("Oyuncu TAS dedi");
                        break;
                    case 2:
                        System.out.println("Oyuncu KAGIT dedi");
                        break;
                    case 3:
                        System.out.println("Oyuncu MAKAS dedi");
                        break;

                }
                // tas 1 > makas 3
                // makas 3 > kagit 2
                //kagit 2 > tas 1

                System.out.println(); // dummy
                if (birinciOyuncu == oyuncuPc) {
                    System.out.println("-BERABERE-");
                } else if ((birinciOyuncu == 1 && oyuncuPc == 3) || (birinciOyuncu == 2 && oyuncuPc == 1) || (birinciOyuncu == 3 && oyuncuPc == 2)) {
                    System.out.println("Bu Turda -OYUNCU- Kazandi");
                    numberOfFirstWin++;
                } else {
                    System.out.println("Bu Turda -BILGISAYAR- Kazandi");
                    numberOfComWin++;
                }

                System.out.println();//dummy
                if (numberOfComWin == 3) {
                    System.out.println("***Oyun Bitti. Kazanan BILGISAYAR***");
                    break;
                } else if (numberOfFirstWin == 3) {
                    System.out.println("***Oyun Bitti. Kazanan OYUNCU***");
                    break;
                }
            }
        }



        //**** T02_IkininKuvveti ****
        /*
          Kullanicidan gelen datayi methodda parametre olarak alan
          ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int sayi = sc.nextInt();

        PowersofTwo(sayi);
    }

    private static void PowersofTwo(int sayi) {

        boolean ussuMu = false;
        for (int i = 1; i <= sayi; i *= 2) {

            if (sayi == i) {
                ussuMu = true;
                break;
            }
        }

        if (ussuMu == true) {
            System.out.println("Sayi 2`nin kuvveti");
        } else {
            System.out.println("Sayi 2`nin kuvveti degil");
        }
    }
}