package src.j25_Encapsulation.task02.MyCozum;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        islem();

    }

    private static void islem() {
        AccountClass obj = new AccountClass(10023, 5750);

        Scanner sc = new Scanner(System.in);
        System.out.println("Yapmak istediginiz Islemi seciniz\n" +
                "1 -> Para Yatirma\n" +
                "2 -> Para Cekme\n" +
                "3 -> Bakiye Ogrenme\n" +
                "0 -> Cikis.");
        int secim = sc.nextInt();

        switch (secim) {
            case 0:
                System.out.println("Cikis Islemi Tamamlandi");
                break;
            case 1:
                System.out.println("Yatirmak istediginiz tutari yaziniz.");
                obj.deposit(sc.nextInt());
                obj.guncelBalance();
                islem();
            case 2:
                System.out.println("Cekmek istediginiz tutari yaziniz.");
                obj.withdraw(sc.nextInt());
                obj.guncelBalance();
                islem();
            case 3:
                obj.guncelBalance();
                islem();
            default:
                System.out.println("Hatali Islem secimi!!! Tekrar Deneyiniz");
                islem();
        }

    }
}
