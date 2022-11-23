package src.j08_IfStatement_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

     /*
      TASK :
      Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
      musteri karti olup olmadigini sorun
      Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
      Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
      alirsa %10 indirim yapan code create ediniz.
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("Musteri kartiniz var mi? -> (V)ar or (Y)ok giriniz: ");
        char musteriKarti = scan.next().toUpperCase().charAt(0);

        if (musteriKarti == 'V') {
            System.out.print("Kac adet urun satin aldiniz: ");
            int urunAdet = scan.nextInt();
            if (urunAdet > 10) {
                System.out.println("Tebrikler %20 indirim kazandiniz");
            } else if(urunAdet >0) {
                System.out.println("Tebrikler %15 indirim kazandiniz");
            }else {
                System.out.println("Indirimden yararlanmak icin urun satin almaniz gerekli");
            }
        } else if (musteriKarti == 'Y') {
            System.out.print("Kac adet urun satin aldiniz: ");
            int urunAdet = scan.nextInt();
            if (urunAdet > 10) {
                System.out.println("Tebrikler %15 indirim kazandiniz");
            } else if (urunAdet > 0) {
                System.out.println("Tebrikler %10 indirim kazandiniz");
            } else {
                System.out.println("Indirimden yararlanmak icin urun satin almaniz gerekli");
            }
        } else{
            System.out.println("Hatali giris. musteri kartiniz varsa -> V, Yoksa -> Y karakterlerinden birini giriniz");
        }

    }
}
