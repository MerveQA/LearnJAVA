package src.j11_MethodCreation;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class UcusProject {

    /*
    A şehrinden uçmak isteyen bir yolcu
    B şehrine 500km
    C şehrine 700km
    D şehrine 900 km mesafededir.

    Bilet tarifesi:
    km birim fiyati : 0.10$
    bilet gidis donus alinirrsa 20% indirim

    Yas Tarifesi
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim, uygulayan bi app create ediniz
    */
    static Scanner scan = new Scanner(System.in);
    static String rota = "";
    static int yas;
    static int gidisDonus = 0;

    static double fiyatB = 500 * 0.10; // A`dan B`ye ucus fiyati
    static double fiyatC = 700 * 0.10; // A`dan C`ye ucus fiyati
    static double fiyatD = 900 * 0.10; // A`dan D`ye ucus fiyati


    public static void main(String[] args) {

        rota();


    } // main SONU

    public static void rota() {
        System.out.print("Gitmek istediginiz sehri seciniz" +
                "\nB sehri icin -> B" +
                "\nC sehri icin -> C" +
                "\nD sehri icin -> D" +
                "\n    Tuslayiniz: ");
        rota = scan.next().toUpperCase();

        if ((rota.equals("B") || rota.equals("C") || rota.equals("D"))) {
            ucusYonu();

        } else {
            System.out.println("Yanlis rota girdiniz");
        }
    }

    public static void ucusYonu() {
        System.out.print("Ucus yonu icin" +
                "\n Tek yon icin -> 1" +
                "\nCift yon icin -> 2" +
                "\n      Tuslayiniz: ");
        gidisDonus = scan.nextInt();

        if (gidisDonus == 1) {
            yasTekYon();
        } else if (gidisDonus == 2) {
            yasCiftYon();
        } else {
            System.out.println("Tek Yon mu, Cift Yon mu Dogru Giriniz");
        }

    }

    private static void yasCiftYon() {
        System.out.print("Yasinizi Giriniz: ");
        yas = scan.nextInt();

        if (yas < 12) {          // 12 yasindan kucuk
            if (rota.equals("B")) {
                System.out.println("12 yas alti B sehrine cift yon ucus bilet fiyatiniz: "+(fiyatB * 0.5 * 0.8 * 2));
            } else if (rota.equals("C")) {
                System.out.println("12 yas alti C sehrine cift yon ucus bilet fiyatiniz: "+(fiyatC * 0.5 * 0.8 * 2));
            } else if (rota.equals("D")) {
                System.out.println("12 yas alti D sehrine cift yon ucus bilet fiyatiniz: "+(fiyatD * 0.5 * 0.8 * 2));
            }

        } else if (yas <= 24) { // 12 - 24 yas arasi
            if (rota.equals("B")) {
                System.out.println("12 - 24 yas arasi B sehrine cift yon ucus bilet fiyatiniz: "+(fiyatB * 0.9 * 0.8 * 2));
            } else if (rota.equals("C")) {
                System.out.println("12 - 24 yas arasi C sehrine cift yon ucus bilet fiyatiniz: "+(fiyatC * 0.9 * 0.8 * 2));
            } else if (rota.equals("D")) {
                System.out.println("12 - 24 yas arasi D sehrine cift yon ucus bilet fiyatiniz: "+(fiyatD * 0.9 * 0.8 * 2));
            }

        } else if (yas < 65) { // 25- 65 yas arasi
            if (rota.equals("B")) {
                System.out.println("25 - 65 yas arasi B sehrine cift yon ucus bilet fiyatiniz: "+(fiyatB * 0.8 * 2));
            } else if (rota.equals("C")) {
                System.out.println("25 - 65 yas arasi C sehrine cift yon ucus bilet fiyatiniz: "+(fiyatC * 0.8 * 2));
            } else if (rota.equals("D")) {
                System.out.println("25 - 65 yas arasi D sehrine cift yon ucus bilet fiyatiniz: "+(fiyatD * 0.8 * 2));
            }

        } else { // 65 yasindan buyuk
            if (rota.equals("B")) {
                System.out.println("65 yas ustu B sehrine cift yon ucus bilet fiyatiniz: "+(fiyatB * 0.7 * 0.8) * 2);
            } else if (rota.equals("C")) {
                System.out.println("65 yas ustu C sehrine cift yon ucus bilet fiyatiniz: "+(fiyatC * 0.7 * 0.8) * 2);
            } else if (rota.equals("D")) {
                System.out.println("65 yas ustu D sehrine cift yon ucus bilet fiyatiniz: "+(fiyatD * 0.7 * 0.8) * 2);
            }
        }
    }


    public static void yasTekYon() {
        System.out.print("Yasinizi Giriniz: ");
        yas = scan.nextInt();

        if (yas < 12) {          // 12 yasindan kucuk
            if (rota.equals("B")) {
                System.out.println("12 yasindan kucuk B sehrine tek yon ucus bilet fiyatiniz: "+(fiyatB * 0.5));
            } else if (rota.equals("C")) {
                System.out.println("12 yasindan kucuk C sehrine tek yon ucus bilet fiyatiniz: "+(fiyatC * 0.5));
            } else if (rota.equals("D")) {
                System.out.println("12 yasindan kucuk D sehrine tek yon ucus bilet fiyatiniz: "+(fiyatD * 0.5));
            }

        } else if (yas <= 24) { // 12 - 24 yas arasi
            if (rota.equals("B")) {
                System.out.println("12-24 yas arasi B sehrine tek yon ucus bilet fiyatiniz: "+(fiyatB * 0.9));
            } else if (rota.equals("C")) {
                System.out.println("12-24 yas arasi C sehrine tek yon ucus bilet fiyatiniz: "+(fiyatC * 0.9));
            } else if (rota.equals("D")) {
                System.out.println("12-24 yas arasi D sehrine tek yon ucus bilet fiyatiniz: "+(fiyatD * 0.9));
            }

        } else if (yas < 65) { // 25- 65 yas arasi
            if (rota.equals("B")) {
                System.out.println("25-65 yas arasi B sehrine tek yon ucus bilet fiyatiniz: "+fiyatB);
            } else if (rota.equals("C")) {
                System.out.println("25-65 yas arasi C sehrine tek yon ucus bilet fiyatiniz: "+fiyatC);
            } else if (rota.equals("D")) {
                System.out.println("25-65 yas arasi D sehrine tek yon ucus bilet fiyatiniz: "+fiyatD);
            }

        } else { // 65 yasindan buyuk
            if (rota.equals("B")) {
                System.out.println("65 yas ustu B sehrine tek yon ucus bilet fiyatiniz: "+(fiyatB * 0.7));
            } else if (rota.equals("C")) {
                System.out.println("65 yas ustu C sehrine tek yon ucus bilet fiyatiniz: "+(fiyatC * 0.7));
            } else if (rota.equals("D")) {
                System.out.println("65 yas ustu D sehrine tek yon ucus bilet fiyatiniz: "+(fiyatD * 0.7));
            }

        }


    }


}
