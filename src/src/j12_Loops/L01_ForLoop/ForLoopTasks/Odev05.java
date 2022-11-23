package src.j12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Odev05 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.

        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false

        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Lutfen tamsayı giriniz: ");
            int sayi= scan.nextInt();

            boolean ucunUssu= powerOfThree (sayi);
            System.out.println(ucunUssu);

        }
        public static boolean powerOfThree (int sayi) {

            boolean ussuMu=true;

            for (int i = 3; i <=sayi ; i*=3) {

                if (sayi%i!=0){

                    ussuMu=false;
                }
            }
            return ussuMu;
        }



    /*
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen tamsayı giriniz: ");
        double sayi = scan.nextInt();

        System.out.println(powerOfThree(sayi));

    }

    public static boolean powerOfThree(double sayi) {

        boolean ussuMu = true;


        for (int i = 1; i < sayi; i++) {

            double a = sayi / i;
            double b = a / i;
            double c = b / i;


            if (c == 1) {
                ussuMu = true;
                break;
            } else {
                ussuMu=false;
            }
        }

        return ussuMu;
    }

    */


}
