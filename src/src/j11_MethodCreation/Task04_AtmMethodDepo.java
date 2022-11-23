package src.j11_MethodCreation;

import java.util.Scanner;

public class Task04_AtmMethodDepo {

    static int bakiye= 1000;
    static Scanner scan= new Scanner(System.in);

    public static void secim() {
        System.out.print("      *** Islem Menusu ***\n" +
                "Yapmak Istediginiz Islemi Seciniz;\n" +
                "   Bakiye Sorgulamak icin -> 1\n" +
                "       Para Yatirmak icin -> 2\n" +
                "         Para Cekmek icin -> 3\n" +
                "        Cikis Yapmak icin -> 4\n" +
                "                   Tuslayin: ");
        int secim= scan.nextInt();

        switch (secim){
            case 1: bakiyeSorgula(); break;
            case 2: paraYatir(); break;
            case 3: paraCek(); break;
            case 4: cikisYap(); break;
            default: System.out.println("Yanlis Islem Tusladiniz Tekrar deneyin");
                secim();
        }
    }

    public static void cikisYap() {
        System.out.println("Cikis Isleminiz Gerceklestirilmistir...");
    }

    public static void paraCek() {
        System.out.print("Cekmek istediginiz tutari girin: ");
        int cekilenPara= scan.nextInt();
        if (bakiye>=cekilenPara){
            bakiye-=cekilenPara;
            System.out.print("Para cekme isleminiz gerceklestirilmistir." +
                    "\n  Cekilen Tutar: "+cekilenPara+"$"+
                    "\nKalan Bakiyeniz: "+bakiye+"$");
        }else{
            System.out.print("Yetersiz Bakiye !!!\n" +
                    "Bakiyeniz: "+bakiye+"$");
        }
        karar();
    }

    public static void paraYatir() {
        System.out.print("Yatirmak istediginiz tutari girin: ");
        int yatanPara= scan.nextInt();
        bakiye+=yatanPara;
        System.out.print(" Yatirilan tutar: "+yatanPara+"$"+
                "\nGuncel Bakiyeniz: "+bakiye+"$");
        // bakiyeSorgula();
        karar();
    }

    public static void bakiyeSorgula() {
        System.out.println("Bakiyeniz: "+bakiye+"$");
        karar();
    }

    public static void karar() {
        System.out.println("");
        System.out.println("");
        System.out.print("Yapmak Istediginiz Islemi Tuslayin\n"+
                " Islem Menusu`ne Donmek icin -> 1\n"+
                "           Cikis Yapmak icin -> 0\n"+
                "                      Tuslayin: ");
        int karar= scan.nextInt();
        switch (karar){
            case 1: secim();break;
            case 0: cikisYap();break;
            default:
                System.out.println("Hatali secim yaptiniz ISLEM MENUSU`ne yonlendirildiniz");
                secim();
        }

    }

}
