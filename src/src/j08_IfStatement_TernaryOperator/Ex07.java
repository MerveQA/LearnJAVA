package src.j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        /*
          Kuualanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve
          üzeri ise kontak anahtarını teslim ediniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */

        Scanner sc= new Scanner(System.in);
        System.out.print("Ehliyetiniz var mi? -> (V)ar, (Y)ok: ");
        char ehliyet= sc.next().toUpperCase().charAt(0);

        if (ehliyet=='V'){

            System.out.print("Kac yillik tecrubeniz var: ");
            int yil= sc.nextInt();
            if (yil>=7){
                System.out.print("Aldiginiz km mesafeyi giriniz: ");
                int mesafe= sc.nextInt();

                if (mesafe>=100000){
                    System.out.println("Kontak anahtarini alabilirsiniz");
                }else{
                    System.out.println("Aldiginiz km yetersiz "+(100000-mesafe)+" km daha mesafe gerekli");
                }

            }else{
                System.out.println("Tecrubeniz yetersiz "+ (7-yil)+ " yil daha tecrube kazanmaniz gerekli");
            }

        } else if (ehliyet=='Y') {
            System.out.println("Ehliyet kursuna gidiniz.");

        }else{
            System.out.println("Dogru secim yapiniz");
        }


    }
}
