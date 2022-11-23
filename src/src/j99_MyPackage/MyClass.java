package src.j99_MyPackage;

import java.util.Random;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
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

            if (birinciOyuncu>3 || birinciOyuncu<1){
                System.out.println("hatali Giris Tekrar Deneyin");

            }else {
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




    }
}
