package src.j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin



        Random random = new Random();
        int rastgele = random.nextInt(100);

        Scanner scan= new Scanner(System.in);
        int sayac=1;

        while (true){
            System.out.print("1-100 arasi Tam sayi giriniz: ");
            int tahmin=scan.nextInt();

            if (tahmin>rastgele){
                System.out.println("Daha kucuk sayi girin.");

            }else if (tahmin<rastgele){
                System.out.println("Daha buyuk sayi girin.");

            }else {
                break;
            }

            sayac++;
        }
        System.out.println(sayac+" tahminde sayiyi dogru bildiniz");



    }

}
