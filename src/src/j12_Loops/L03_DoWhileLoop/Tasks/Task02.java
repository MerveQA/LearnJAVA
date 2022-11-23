package src.j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        Scanner scan= new Scanner(System.in);
        System.out.print("1. sayiyi giriniz: ");
        int sayi1=scan.nextInt();
        System.out.print("2. sayiyi giriniz: ");
        int sayi2=scan.nextInt();

        // Kullanicinin sayi1`imi yoksa sayi2`yimi buyuk sayi olarak girecegi bilinemedigi icin
        // ifle iki durumda degerlendirildi

        if (sayi1<sayi2){ // burada sayi1`in sayi2`den kucuk olma durumu ele alindi

            do {
                System.out.print(sayi1+" ");
                sayi1++;
            }while (sayi1<=sayi2);

        }else { // burada sayi2`in sayi1`den kucuk olma durumu ele alindi

            do {
                System.out.print(sayi2+" ");
                sayi1++;
            }while (sayi2<=sayi1);

        }



    }
}
