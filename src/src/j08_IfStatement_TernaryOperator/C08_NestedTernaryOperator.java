package src.j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
        %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
        */

        Scanner scan=new Scanner(System.in);
        System.out.print("Urun miktari girin: ");
        int urunMiktari= scan.nextInt();
        System.out.print("Urun fiyati girin: ");
        int urunFiyati= scan.nextInt();

        double sonuc = urunMiktari>100 ? (urunFiyati *0.67)*urunMiktari : urunFiyati*urunMiktari;

        System.out.println(sonuc);



    }
}
