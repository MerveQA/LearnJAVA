package src.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11_prime_numbers {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Pozitif bir sayi girin: ");
        int sayi= sc.nextInt();

        List<Integer> asalSayilar = new ArrayList<>();

        for (int i = 2; i <sayi ; i++) {
            int count=0;
            for (int j = 2; j <i; j++) {
                if (i%j==0){
                count++;
                }
            }
            if (count==0){
                asalSayilar.add(i);
            }
        }
        System.out.println(asalSayilar);


    }
}

