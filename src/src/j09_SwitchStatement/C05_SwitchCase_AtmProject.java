package src.j09_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase_AtmProject {
    public static void main(String[] args) {

        /* Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
           çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("*** ATM`ye Hosgeldiniz. ***");
        System.out.print("Bakiye ogrenme icin -> 1\nPara yatirma-> 2\nPara cekme -> 3\nCikis -> 4\nGiriniz: ");
        int secim= scan.nextInt();

        int bakiye= 1000;

        switch (secim){
            case 1:
                System.out.println("Bakiyeniz: "+bakiye);
                break;
            case 2:
                System.out.print("Yatiracaginiz miktari girin: ");
                int yatanMiktar= scan.nextInt();
                bakiye += yatanMiktar;
                System.out.println("Guncel bakiyeniz: "+bakiye);
                break;
            case 3:
                System.out.print("Cekeceginiz miktari girin: ");
                int cekilenMiktar= scan.nextInt();
                if (cekilenMiktar>bakiye){
                    System.out.println("Yetersiz bakiye");
                    System.out.println("Bakiyeniz: "+bakiye);
                }else {
                    bakiye -= cekilenMiktar;
                    System.out.println("Guncel bakiyeniz: "+bakiye);
                }
                break;
            case 4:
                System.out.println("Cikis isleminiz gerceklestirilmisitir.");
                break;
            default:
                System.out.println("Hatali secim girdiniz tekrar deneyiniz");
        }

    }
}
